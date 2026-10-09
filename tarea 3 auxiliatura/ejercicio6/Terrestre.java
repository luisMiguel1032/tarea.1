public class Terrestre extends Animal {
    private int numeroPatas;
    private String tipoTerreno;

    public Terrestre(int edad, double peso, String especie, int numeroPatas, String tipoTerreno) {
        super(edad, peso, especie);
        this.numeroPatas = numeroPatas;
        this.tipoTerreno = tipoTerreno;
    }

    public void correr() {
        System.out.println(especie + " corre sobre " + tipoTerreno + " apoyandose en sus " + numeroPatas + " patas.");
    }

    public void cavar() {
        System.out.println(especie + " cava en " + tipoTerreno + " para hacer su refugio.");
    }

    @Override
    public void respirar() {
        super.respirar();
        System.out.println("Respira con pulmones: el aire entra por la nariz y el oxigeno pasa a la sangre.");
    }

    @Override
    public void mover() {
        System.out.println(especie + " camina y corre sobre el suelo.");
    }

    @Override
    public String toString() {
        return "Terrestre -> " + super.toString() + ", Patas: " + numeroPatas + ", Terreno: " + tipoTerreno;
    }
}
