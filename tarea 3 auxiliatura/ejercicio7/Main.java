import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Central");
        Biblioteca biblioteca2 = new Biblioteca("Biblioteca de Ingenieria");

        biblioteca1.agregarDocumento(new Libro("Programacion en Java", List.of("Herbert Schildt"), "McGraw-Hill", 2020));
        biblioteca1.agregarDocumento(new Libro("Estructuras de Datos", List.of("Mark Allen Weiss"), "Pearson", 2013));
        biblioteca1.agregarDocumento(new Libro("Ingenieria de Software", List.of("Ian Sommerville"), "Pearson", 2011));
        biblioteca1.agregarDocumento(new Libro("Bases de Datos", List.of("Abraham Silberschatz", "Henry Korth", "S. Sudarshan"), "McGraw-Hill", 2019));
        biblioteca1.agregarDocumento(new Revista("Tecnologia Hoy", List.of("Equipo Editorial"), "Editorial Digital", 2024, 12, 3, "Marzo"));
        biblioteca1.agregarDocumento(new DocumentoCD("Curso de Python", List.of("Carlos Perez"), "Editorial Andina", 2018, "CD-ROM", "Licencia educativa"));

        biblioteca2.agregarDocumento(new Libro("Algoritmos", List.of("Thomas Cormen", "Charles Leiserson"), "MIT Press", 2009));
        biblioteca2.agregarDocumento(new Revista("Ciencia y Sistemas", List.of("Comite Editorial"), "Editorial Universitaria", 2023, 8, 2, "Junio"));
        biblioteca2.agregarDocumento(new RevistaInvestigacion("Journal of Computing Research", List.of("Ana Rojas", "Pedro Flores"), "Editorial Cientifica", 2022, 5, 1, "Enero", "Inteligencia artificial"));
        biblioteca2.agregarDocumento(new RevistaInvestigacion("Revista de Redes y Comunicaciones", List.of("Maria Quispe"), "Editorial Cientifica", 2021, 3, 4, "Octubre", "Redes de computadoras"));
        biblioteca2.agregarDocumento(new DocumentoCD("Simulador de Circuitos", List.of("Equipo de Desarrollo"), "Software Andino", 2020, "DVD", "Licencia comercial"));

        System.out.println("=== Estado inicial ===");
        biblioteca1.mostrar();
        System.out.println();
        biblioteca2.mostrar();

        System.out.println();
        System.out.println("=== Comparacion entre bibliotecas ===");
        Biblioteca.mostrarMayores(biblioteca1, biblioteca2);

        System.out.println();
        System.out.println("=== Traslado: revistas a la primera biblioteca y libros a la segunda ===");
        biblioteca2.trasladarRevistas(biblioteca1);
        biblioteca1.trasladarLibros(biblioteca2);
        biblioteca1.mostrar();
        System.out.println();
        biblioteca2.mostrar();

        System.out.println();
        System.out.println("=== Copia de seguridad ===");
        Biblioteca copia1 = biblioteca1.copiaSeguridad();
        Biblioteca copia2 = biblioteca2.copiaSeguridad();
        copia1.mostrar();
        System.out.println();
        copia2.mostrar();

        System.out.println();
        System.out.println("=== Comprobacion de que las copias son independientes ===");
        biblioteca1.getDocumento(0).setTitulo("Titulo modificado en el original");
        System.out.println("Original: " + biblioteca1.getDocumento(0).getTitulo());
        System.out.println("Copia:    " + copia1.getDocumento(0).getTitulo());
    }
}
