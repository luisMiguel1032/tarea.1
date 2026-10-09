import java.util.List;

public class Revista extends Documento {
    protected int volumen;
    protected int numero;
    protected String mes;

    public Revista(String titulo, List<String> autores, String editorial, int anioPublicacion,
                   int volumen, int numero, String mes) {
        super(titulo, autores, editorial, anioPublicacion);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }

    public Revista(Revista otra) {
        super(otra);
        this.volumen = otra.volumen;
        this.numero = otra.numero;
        this.mes = otra.mes;
    }

    @Override
    protected String getTipo() {
        return "Revista";
    }

    @Override
    public Documento copiar() {
        return new Revista(this);
    }

    @Override
    public String toString() {
        return super.toString() + ", Volumen: " + volumen + ", Numero: " + numero + ", Mes: " + mes;
    }
}
