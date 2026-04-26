public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteresMensual;
    private double saldoMinimo;

    //Constructor con parametros
    public CuentaAhorros(String numeroCuenta, String titular, double saldo, double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);
        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }

    //Getter and Setter
    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    //Sobreescribiendo el metodo describir
    @Override
    public String describir() {
        return super.describir() + "-Tasa Mensual: " + tasaInteresMensual + "%";
    }

    //Sobreescrbiendo el metodo Calcular Comision
    @Override
    public double calcularComision() {
        if (getSaldo() >= saldoMinimo) {
            return 0.0;
        } else {
            return 12000;
        }
    }
    //Sobrecarga del metodo realizar retiro
    public void realizarRetiro(double monto, boolean esUrgente) {
        double resultadoNuevoSaldo = getSaldo() - monto;
        if (esUrgente && resultadoNuevoSaldo < saldoMinimo) {
            setSaldo(resultadoNuevoSaldo - calcularComision());
            System.out.println("Retiro Urgente: Se le ha cobrado comisión de $" + 12000.0);
        } else {
            setSaldo(resultadoNuevoSaldo);
        }
    }
    //Metodo Calcular Interes del Mes
    public double calcularInteresDelMes(){
        return getSaldo() * tasaInteresMensual/100;
    }
}
