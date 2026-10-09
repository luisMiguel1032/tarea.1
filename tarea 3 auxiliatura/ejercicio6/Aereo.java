public class Aereo extends Animal {
    private double envergadura;
    private int alturaMaxima;

    public Aereo(int edad, double peso, String especie, double envergadura, int alturaMaxima) {
        super(edad, peso, especie);
        this.envergadura = envergadura;
        this.alturaMaxima = alturaMaxima;
    }

    public void volar() {
        System.out.println(especie + " vuela con una envergadura de " + envergadura + " metros.");
    }

    public void aterrizar() {
        System.out.println(especie + " desciende desde " + alturaMaxima + " metros de altura y aterriza.");
    }

    @Override
    public void respirar() {
        super.respirar();
        System.out.println("Respira con pulmones y sacos aereos, que le dan oxigeno incluso durante el vuelo.");
    }

    @Override
    public void mover() {
        System.out.println(especie + " vuela batiendo sus alas en el aire.");
    }

    @Override
    public String toString() {
        return "Aereo -> " + super.toString() + ", Envergadura: " + envergadura + " m, Altura maxima: " + alturaMaxima + " m";
    }
}
