public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    //constructor vacio
    public CuentaBancaria() {
    }

    //constructor con parámetros
    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //Getters

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    //Setters


    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //Metodo protegido
    protected void setSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    //Metodo describir
    public String describir() {
        return "-Cuenta " + numeroCuenta + " -Titular " + titular + " -Saldo: $" + saldo;
    }

    //Metodo Calcular Comision
    public double calcularComision() {
        return 0.0;
    }
    //Metodo realizar retiro
    public void realizarRetiro(double monto) {
        setSaldo(getSaldo() - monto);
    }
}
