public class Main {
    public static void main(String[] args) {
        // c) Crear dos autos
        Vehiculo auto1 = new Vehiculo("Toyota", "Corolla", 2020, 45, "Blanco");
        Vehiculo auto2 = new Vehiculo("Ford", "Mustang", 2022, 12, "Negro");

        System.out.println("--- Cambiando colores ---");
        // Cambiarles el color
        auto1.setColor("Rojo");
        auto2.setColor("Azul");

        System.out.println("\n--- Mostrando kilometrajes ---");
        auto1.mostrarKilometraje();
        auto2.mostrarKilometraje();
    }

    }