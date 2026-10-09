import java.util.List;

public class RevistaInvestigacion extends Revista {
    private String campoInvestigacion;

    public RevistaInvestigacion(String titulo, List<String> autores, String editorial, int anioPublicacion,
                                int volumen, int numero, String mes, String campoInvestigacion) {
        super(titulo, autores, editorial, anioPublicacion, volumen, numero, mes);
        this.campoInvestigacion = campoInvestigacion;
    }

    public RevistaInvestigacion(RevistaInvestigacion otra) {
        super(otra);
        this.campoInvestigacion = otra.campoInvestigacion;
    }

    @Override
    protected String getTipo() {
        return "Revista de investigacion";
    }

    @Override
    public Documento copiar() {
        return new RevistaInvestigacion(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Campo de investigacion: " + campoInvestigacion;
    }
}
