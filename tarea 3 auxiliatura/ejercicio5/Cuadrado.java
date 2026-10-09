public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(String color, int lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    protected double obtenerArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado -> Lado: " + lado + ", " + super.toString();
    }
}
