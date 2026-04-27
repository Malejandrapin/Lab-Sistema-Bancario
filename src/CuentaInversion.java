public class CuentaInversion extends CuentaBancaria{
    private double tasaAnual;
    private int plazoMeses;
    private double penalizacionRetiroAnticipado;

    //Constructor con parámetros
    public CuentaInversion(String numeroCuenta, String titular, double saldo, double tasaAnual, int plazoMeses, double penalizacionRetiroAnticipado) {
        super(numeroCuenta, titular, saldo);
        this.tasaAnual = tasaAnual;
        this.plazoMeses = plazoMeses;
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }
    //Getter and Setter
    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public double getPenalizacionRetiroAnticipado() {
        return penalizacionRetiroAnticipado;
    }

    public void setPenalizacionRetiroAnticipado(double penalizacionRetiroAnticipado) {
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }
    //Sobreescribiendo el metodo describir
    @Override
    public String describir() {
        return super.describir() + "-Plazo: " + plazoMeses + " meses -Tasa anual: " + tasaAnual +"%";
    }
    //Sobreescrbiendo el metodo Calcular Comision
    @Override
    public double calcularComision() {
        return penalizacionRetiroAnticipado;
    }
    //Sobreescribiendo metodo realizar retiro
    @Override
    public void realizarRetiro(double monto){
        setSaldo(getSaldo()- (monto + penalizacionRetiroAnticipado));
    }
    //Sobrecarga del metodo Calcular Comision
    public double calcularComision(int mesesTranscurridos) {
        return mesesTranscurridos >= plazoMeses ? 0.0 : penalizacionRetiroAnticipado;
    }
}
