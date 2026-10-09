import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Documento> documentos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Documento getDocumento(int indice) {
        return documentos.get(indice);
    }

    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public int contarDocumentos() {
        return documentos.size();
    }

    public int contarRevistas() {
        int cantidad = 0;
        for (Documento documento : documentos) {
            if (documento instanceof Revista) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int contarLibros() {
        int cantidad = 0;
        for (Documento documento : documentos) {
            if (documento instanceof Libro) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public void trasladarRevistas(Biblioteca destino) {
        if (destino == this) {
            return;
        }
        ArrayList<Documento> trasladados = new ArrayList<>();
        for (Documento documento : documentos) {
            if (documento instanceof Revista) {
                trasladados.add(documento);
            }
        }
        documentos.removeAll(trasladados);
        destino.documentos.addAll(trasladados);
    }

    public void trasladarLibros(Biblioteca destino) {
        if (destino == this) {
            return;
        }
        ArrayList<Documento> trasladados = new ArrayList<>();
        for (Documento documento : documentos) {
            if (documento instanceof Libro) {
                trasladados.add(documento);
            }
        }
        documentos.removeAll(trasladados);
        destino.documentos.addAll(trasladados);
    }

    public Biblioteca copiaSeguridad() {
        Biblioteca copia = new Biblioteca(nombre + " (copia)");
        for (Documento documento : documentos) {
            copia.agregarDocumento(documento.copiar());
        }
        return copia;
    }

    public static void mostrarMayores(Biblioteca a, Biblioteca b) {
        System.out.println(a.nombre + ": " + a.contarRevistas() + " revistas, " + a.contarDocumentos() + " documentos");
        System.out.println(b.nombre + ": " + b.contarRevistas() + " revistas, " + b.contarDocumentos() + " documentos");

        if (a.contarRevistas() > b.contarRevistas()) {
            System.out.println("Tiene mas revistas: " + a.nombre);
        } else if (b.contarRevistas() > a.contarRevistas()) {
            System.out.println("Tiene mas revistas: " + b.nombre);
        } else {
            System.out.println("Ambas bibliotecas tienen la misma cantidad de revistas");
        }

        if (a.contarDocumentos() > b.contarDocumentos()) {
            System.out.println("Tiene mas documentos: " + a.nombre);
        } else if (b.contarDocumentos() > a.contarDocumentos()) {
            System.out.println("Tiene mas documentos: " + b.nombre);
        } else {
            System.out.println("Ambas bibliotecas tienen la misma cantidad de documentos");
        }
    }

    public void mostrar() {
        System.out.println("--- " + nombre + " (" + documentos.size() + " documentos) ---");
        for (Documento documento : documentos) {
            System.out.println(documento);
        }
    }
}
