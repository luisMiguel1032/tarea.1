 public class Main {
 public static void main(String[] args) {
    // a) Instanciar 2 objetos de diferente forma

        // Forma 1: Usando el constructor parametrizado
        Computadora pc1 = new Computadora("Lenovo", "Intel i7", 16, 512);

        // Forma 2: Usando el constructor vacío y llenando datos con setters
        Computadora pc2 = new Computadora();
        pc2.setMarca("ASUS");
        pc2.setProcesador("AMD Ryzen 5");
        pc2.setRam(8);
        pc2.setAlmacenamiento(1024);

        int x = 16;
        System.out.println("¿La RAM de pc1 es igual a " + x + " GB? " + pc1.tieneRamIgualA(x));
        System.out.println("¿La RAM de pc2 es igual a " + x + " GB? " + pc2.tieneRamIgualA(x));

        System.out.println("\n-----------------------------------");

        // c) De 2 computadoras, mostrar los datos de la que tiene mayor almacenamiento
        System.out.println("Computadora con mayor almacenamiento:");
        if (pc1.getAlmacenamiento() > pc2.getAlmacenamiento()) {
            pc1.mostrarInformacion();
        } else if (pc2.getAlmacenamiento() > pc1.getAlmacenamiento()) {
            pc2.mostrarInformacion();
        } else {
            System.out.println("Ambas computadoras tienen la misma capacidad de almacenamiento.");
        }

 }