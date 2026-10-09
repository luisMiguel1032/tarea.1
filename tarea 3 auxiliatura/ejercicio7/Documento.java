import java.util.ArrayList;
import java.util.List;

public abstract class Documento {
    protected String titulo;
    protected ArrayList<String> autores;
    protected String editorial;
    protected int anioPublicacion;

    public Documento(String titulo, List<String> autores, String editorial, int anioPublicacion) {
        this.titulo = titulo;
        this.autores = new ArrayList<>(autores);
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }

    protected Documento(Documento otro) {
        this(otro.titulo, otro.autores, otro.editorial, otro.anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected abstract String getTipo();

    public abstract Documento copiar();

    @Override
    public String toString() {
        return getTipo() + " -> Titulo: " + titulo
                + ", Autores: " + String.join(", ", autores)
                + ", Editorial: " + editorial
                + ", Publicacion: " + anioPublicacion;
    }
}
