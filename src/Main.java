//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaAh = new CuentaAhorros("AHORROS-001", "Sebastian Perez", 2500000, 0.8, 500000);
        CuentaBancaria cuentaC = new CuentaCorriente("CCORRIENTE-002", "Solutech SA", 5800000, 15000, 1000000);
        CuentaBancaria cuentaI = new CuentaInversion("CINVERSION-003", "Alexandra Rodriguez", 8000000, 12.5, 12, 150000);

        // Llamo al metodo describir
        System.out.println("---DESCRIBIENDO CUENTAS---");
        System.out.println(cuentaAh.describir());
        System.out.println(cuentaC.describir());
        System.out.println(cuentaI.describir());

        // Llamo al metodo Calcular Comision
        System.out.println("---CALCULANDO COMISIÓN---");
        System.out.println("La comisión calculada es:"+cuentaAh.calcularComision());
        System.out.println("La comisión calculada es:"+cuentaC.calcularComision());
        System.out.println("La comisión calculada es:"+cuentaI.calcularComision());

        // Llamo al metodo realizar retiro
        System.out.println("---REALIZANDO RETIRO---");
        cuentaAh.realizarRetiro(500000.0);
        cuentaC.realizarRetiro(500000.0);
        cuentaI.realizarRetiro(500000.0);

        // Imprimo el saldo
        System.out.println("---IMPRIMIENDO SALDO---");
        System.out.println("Saldo resultante tras retiro de $500.000: $" +cuentaAh.getSaldo());
        System.out.println("Saldo resultante tras retiro de $500.000: $" +cuentaC.getSaldo());
        System.out.println("Saldo resultante tras retiro de $500.000: $" +cuentaI.getSaldo());
    }
}
