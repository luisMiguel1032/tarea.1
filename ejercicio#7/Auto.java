public class Auto {
    // Atributos privados
    private String marca;
    private String color;
    private double gasolina; // en litros

    // a) Sobrecargar el constructor 2 veces (3 constructores en total)
    public Auto() {
        this.marca = "Genérica";
        this.color = "Blanco";
        this.gasolina = 10.0;
    }

    public Auto(String marca, String color, double gasolina) {
        this.marca = marca;
        this.color = color;
        this.gasolina = gasolina;
    }

    public Auto(String marca, String color) {
        this.marca = marca;
        this.color = color;
        this.gasolina = 0.0;
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getGasolina() { return gasolina; }
    public void setGasolina(double gasolina) { this.gasolina = gasolina; }

    // c) Método equivalente a ++ (Java no admite sobrecarga de operadores)
    public Auto incrementarGasolina() {
        this.gasolina += 5.0;
        return this;
    }

    // d) Método equivalente
    public Auto cambiarColor(String nuevoColor) {
        return new Auto(this.marca, nuevoColor, this.gasolina);
    }

    // e) Método equivalente a - (sumar la gasolina de dos autos)
    public double sumarGasolina(Auto otro) {
        return this.gasolina + otro.getGasolina();
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Color: " + color + " | Gasolina: " + gasolina + " L");
    }
}