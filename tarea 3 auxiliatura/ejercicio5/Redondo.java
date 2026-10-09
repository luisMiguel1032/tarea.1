public class Redondo extends Figura {
    private int radio;

    public Redondo(String color, int radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    protected double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Redondo -> Radio: " + radio + ", " + super.toString();
    }
}
