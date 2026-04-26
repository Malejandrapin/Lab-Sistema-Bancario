public class CuentaCorriente extends CuentaBancaria {
    private double comisionPorTransaccion;
    private double limiteSOBREGIRO;

    //Constructor con parametros
    public CuentaCorriente(String numeroCuenta, String titular, double saldo, double comisionPorTransaccion, double limiteSOBREGIRO) {
        super(numeroCuenta, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSOBREGIRO = limiteSOBREGIRO;
    }

    //Getter and Setter
    public double getComisionPorTransaccion() {
        return comisionPorTransaccion;
    }

    public void setComisionPorTransaccion(double comisionPorTransaccion) {
        this.comisionPorTransaccion = comisionPorTransaccion;
    }

    public double getLimiteSOBREGIRO() {
        return limiteSOBREGIRO;
    }

    public void setLimiteSOBREGIRO(double limiteSOBREGIRO) {
        this.limiteSOBREGIRO = limiteSOBREGIRO;
    }

    //Sobreescribiendo el metodo describir
    @Override
    public String describir() {
        return super.describir() + "-Comisión por Transacción: $ " + comisionPorTransaccion;
    }

    //Sobreescrbiendo el metodo Calcular Comision
    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    //Sobreescribiendo metodo realizar retiro
    @Override
    public void realizarRetiro(double monto) {
        double totalDescontar = monto + comisionPorTransaccion;
        if ((getSaldo() - totalDescontar) < -limiteSOBREGIRO) {
            System.out.println("El retiro no es posible, supera el limite de sobregiro");
        } else {
            setSaldo(getSaldo() - totalDescontar);
            System.out.println("Su retiro ha sido exitoso");
        }
    }
}
