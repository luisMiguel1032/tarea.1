public class Main {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("Juan Pérez", 2344, 1000.0);
    // ejercicio 3 del código de la clase CuentaBancaria.java jaja
        miCuenta.mostrarDatos();
        System.out.println();

        System.out.println("PRUEBA DE DEPÓSITOS");
        miCuenta.depositar(500.0); /
        miCuenta.depositar(-50.0); 
        System.out.println();

        System.out.println("PRUEBA DE RETIROS");
        miCuenta.retirar(200.0);
        miCuenta.retirar(2000.0); 
        miCuenta.retirar(-10.0);  
        System.out.println();

        miCuenta.mostrarDatos();
    }
}