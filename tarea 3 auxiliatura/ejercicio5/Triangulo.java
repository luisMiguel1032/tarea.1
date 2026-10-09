public class Triangulo extends Figura {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(String color, int lado1, int lado2, int lado3) {
        super(color);
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0
                || lado1 + lado2 <= lado3
                || lado1 + lado3 <= lado2
                || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Los lados no forman un triangulo valido");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    protected double obtenerArea() {
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public String toString() {
        return "Triangulo -> Lados: " + lado1 + ", " + lado2 + ", " + lado3 + ", " + super.toString();
    }
}
