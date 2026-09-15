public class Main {
    public static void main(String[] args) {
        // b) Instanciar 2 objetos Auto usando diferentes constructores
        Auto auto1 = new Auto("Toyota","Rojo", 20.0);
        Auto auto2 = new Auto("Honda","Azul");

        System.out.println("Estado Inicial");
        auto1.mostrarInfo();                
        auto2.mostrarInfo();

        auto1.incrementarGasolina();
        System.out.println("\n--- Despues de incrementar gasolina en auto1 ---");
        auto1.mostrarInfo();

        // d) Equivalente 
        auto2 = auto2.cambiarColor("Negro");
        System.out.println("\n--- Despues de cambiar color a \"Negro\" en auto2 ---");
        auto2.mostrarInfo();

        // e) Equivalente 
        double gasolinaTotal = auto1.sumarGasolina(auto2);
        System.out.println("\nGasolina total acumulada: " + gasolinaTotal + " L");
    }
}