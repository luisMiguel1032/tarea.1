public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    protected abstract double obtenerArea();

    @Override
    public String toString() {
        return "Color: " + color + ", Area: " + String.format("%.2f", obtenerArea());
    }
}
