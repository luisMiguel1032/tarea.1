public class mein {
    public static void main(String[] args) {
        // d) Crea una instancia del bus y utiliza los métodos anteriores
        Bus bus1 = new Bus("3456-ABC", 30); // Bus con capacidad para 30 pasajeros

        bus1.mostrarAsientosDisponibles();  // c) Asientos iniciales disponibles

        System.out.println("\n--- Pasajeros subiendo ---");
        bus1.subirPasajeros(12);           // a) Suben 12 pasajeros
        bus1.mostrarAsientosDisponibles();  // c) Muestra asientos disponibles

        System.out.println("\n--- Cobrando pasaje ---");
        bus1.cobrarPasaje();               // b) Cobra pasaje a los 12 pasajeros

        System.out.println("\n--- Subiendo más pasajeros ---");
        bus1.subirPasajeros(20);           // Intentan subir 20 (supera el límite de 18 restantes)
        bus1.cobrarPasaje();               // Cobra pasaje a los nuevos pasajeros
        
        System.out.println();
        bus1.mostrarEstadoBus();
    }
}