import java.util.List;

public class Libro extends Documento {

    public Libro(String titulo, List<String> autores, String editorial, int anioPublicacion) {
        super(titulo, autores, editorial, anioPublicacion);
    }

    public Libro(Libro otro) {
        super(otro);
    }

    @Override
    protected String getTipo() {
        return "Libro";
    }

    @Override
    public Documento copiar() {
        return new Libro(this);
    }
}
