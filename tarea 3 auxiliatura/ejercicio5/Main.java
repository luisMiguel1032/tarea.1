public class Main {

    public static void mostrarColorMayorArea(Cuadrado cuadrado, Triangulo triangulo) {
        double areaCuadrado = cuadrado.obtenerArea();
        double areaTriangulo = triangulo.obtenerArea();

        System.out.println("Area del cuadrado: " + String.format("%.2f", areaCuadrado));
        System.out.println("Area del triangulo: " + String.format("%.2f", areaTriangulo));

        if (areaCuadrado > areaTriangulo) {
            System.out.println("La figura de mayor area es el cuadrado, de color " + cuadrado.getColor());
        } else if (areaTriangulo > areaCuadrado) {
            System.out.println("La figura de mayor area es el triangulo, de color " + triangulo.getColor());
        } else {
            System.out.println("Ambas figuras tienen la misma area");
        }
    }

    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado("Rojo", 4);
        Cuadrado cuadrado2 = new Cuadrado("Azul", 6);

        Triangulo triangulo1 = new Triangulo("Verde", 3, 4, 5);
        Triangulo triangulo2 = new Triangulo("Amarillo", 6, 8, 10);

        Redondo redondo1 = new Redondo("Naranja", 3);
        Redondo redondo2 = new Redondo("Morado", 5);

        System.out.println("=== Cuadrados ===");
        System.out.println(cuadrado1);
        System.out.println(cuadrado2);

        System.out.println();
        System.out.println("=== Triangulos ===");
        System.out.println(triangulo1);
        System.out.println(triangulo2);

        System.out.println();
        System.out.println("=== Redondos ===");
        System.out.println(redondo1);
        System.out.println(redondo2);

        System.out.println();
        System.out.println("=== Comparacion entre un cuadrado y un triangulo ===");
        mostrarColorMayorArea(cuadrado1, triangulo2);
    }
}
