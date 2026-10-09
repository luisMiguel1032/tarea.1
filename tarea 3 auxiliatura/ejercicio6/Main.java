public class Main {
    public static void main(String[] args) {
        Terrestre leon = new Terrestre(5, 190.5, "Leon", 4, "sabana");
        Acuatico tiburon = new Acuatico(12, 250.0, "Tiburon blanco", 1200.0, "salada");
        Aereo aguila = new Aereo(3, 4.2, "Aguila", 2.1, 3000);

        System.out.println("=== Datos de los animales ===");
        System.out.println(leon);
        System.out.println(tiburon);
        System.out.println(aguila);

        System.out.println();
        System.out.println("=== Respirar ===");
        leon.respirar();
        System.out.println();
        tiburon.respirar();
        System.out.println();
        aguila.respirar();

        System.out.println();
        System.out.println("=== Mover ===");
        leon.mover();
        tiburon.mover();
        aguila.mover();

        System.out.println();
        System.out.println("=== Metodos propios ===");
        leon.correr();
        leon.cavar();
        tiburon.nadar();
        tiburon.sumergirse();
        aguila.volar();
        aguila.aterrizar();

        System.out.println();
        System.out.println("=== Polimorfismo ===");
        Animal[] animales = {leon, tiburon, aguila};
        for (Animal animal : animales) {
            animal.mover();
        }
    }
}
