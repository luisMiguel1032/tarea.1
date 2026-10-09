public class Acuatico extends Animal {
    private double profundidadMaxima;
    private String tipoAgua;

    public Acuatico(int edad, double peso, String especie, double profundidadMaxima, String tipoAgua) {
        super(edad, peso, especie);
        this.profundidadMaxima = profundidadMaxima;
        this.tipoAgua = tipoAgua;
    }

    public void nadar() {
        System.out.println(especie + " nada en agua " + tipoAgua + ".");
    }

    public void sumergirse() {
        System.out.println(especie + " se sumerge hasta " + profundidadMaxima + " metros de profundidad.");
    }

    @Override
    public void respirar() {
        super.respirar();
        System.out.println("Respira con branquias: filtra el oxigeno que esta disuelto en el agua.");
    }

    @Override
    public void mover() {
        System.out.println(especie + " nada moviendo sus aletas o su cola dentro del agua.");
    }

    @Override
    public String toString() {
        return "Acuatico -> " + super.toString() + ", Profundidad maxima: " + profundidadMaxima + " m, Agua: " + tipoAgua;
    }
}
