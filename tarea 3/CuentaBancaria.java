public class CuentaBancaria{
    private String titular;
    private int nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int nroCuenta, double saldo){
        this.titular=titular;
        this.nroCuenta=nroCuenta;
        this.saldo=saldo;
    }
    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a depositar debe ser mayor a 0.");
        } else {
            this.saldo += monto;
            System.out.println("Depósito exitoso de Bs. " + monto + ". Nuevo saldo: Bs. " + this.saldo);
        }
    }

    // a) y b) Método retirar con validación
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a 0.");
        } else if (monto > this.saldo) {
            System.out.println("Error: Saldo insuficiente. Intenta retirar Bs. " + monto + " pero el saldo es Bs. " + this.saldo);
        } else {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de Bs. " + monto + ". Saldo restante: Bs. " + this.saldo);
        }
    }

    // d) Mostrar los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("--- DATOS DE LA CUENTA ---");
        System.out.println("Titular: " + titular);
        System.out.println("Nro. de Cuenta: " + nroCuenta);
        System.out.println("Saldo actual: Bs. " + saldo);
    }
}