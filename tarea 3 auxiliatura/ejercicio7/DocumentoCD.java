import java.util.List;

public class DocumentoCD extends Documento {
    private String formatoCD;
    private String tipoLicencia;

    public DocumentoCD(String titulo, List<String> autores, String editorial, int anioPublicacion,
                       String formatoCD, String tipoLicencia) {
        super(titulo, autores, editorial, anioPublicacion);
        this.formatoCD = formatoCD;
        this.tipoLicencia = tipoLicencia;
    }

    public DocumentoCD(DocumentoCD otro) {
        super(otro);
        this.formatoCD = otro.formatoCD;
        this.tipoLicencia = otro.tipoLicencia;
    }

    @Override
    protected String getTipo() {
        return "Documento en CD";
    }

    @Override
    public Documento copiar() {
        return new DocumentoCD(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Formato del CD: " + formatoCD + ", Licencia: " + tipoLicencia;
    }
}
