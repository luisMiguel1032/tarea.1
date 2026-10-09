public class Animal {
    protected int edad;
    protected double peso;
    protected String especie;

    public Animal(int edad, double peso, String especie) {
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
    }

    public void respirar() {
        System.out.println(especie + " toma oxigeno para vivir.");
    }

    public void mover() {
        System.out.println(especie + " se desplaza de un lugar a otro.");
    }

    @Override
    public String toString() {
        return "Especie: " + especie + ", Edad: " + edad + ", Peso: " + peso + " kg";
    }
}
