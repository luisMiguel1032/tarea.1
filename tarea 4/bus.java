public class Bus {
    private String placa;
    private int capacidadTotal;
    private int pasajerosActuales;
    private double recaudacion;
    private final double COSTO_PASAJE = 1.50; // Costo por pasaje (Bs. 1.50)

    public Bus(String placa, int capacidadTotal) {
        this.placa = placa;
        this.capacidadTotal = capacidadTotal;
        this.pasajerosActuales = 0;
        this.recaudacion = 0.0;
    }

    // a) Subir X cantidad de pasajeros (validando capacidad)
    public void subirPasajeros(int x) {
        int asientosDisponibles = obtenerAsientosDisponibles();
        if (x <= 0) {
            System.out.println("Cantidad inválida de pasajeros.");
        } else if (x > asientosDisponibles) {
            int subieron = asientosDisponibles;
            this.pasajerosActuales += subieron;
            System.out.println("Solo pudieron subir " + subieron + " pasajeros. El bus está lleno (" + (x - subieron) + " quedaron fuera).");
        } else {
            this.pasajerosActuales += x;
            System.out.println("Subieron " + x + " pasajeros correctamente.");
        }
    }

    // b) Método para cobrar pasaje a los pasajeros a bordo
    public void cobrarPasaje() {
        double cobrado = pasajerosActuales * COSTO_PASAJE;
        this.recaudacion += cobrado;
        System.out.println("Se cobró pasaje a " + pasajerosActuales + " pasajeros. Total cobrado: Bs. " + cobrado);
    }

    // c) Muestra cuántos asientos quedan disponibles
    public int obtenerAsientosDisponibles() {
        return capacidadTotal - pasajerosActuales;
    }

    public void mostrarAsientosDisponibles() {
        System.out.println("Asientos disponibles en el bus (" + placa + "): " + obtenerAsientosDisponibles() + " de " + capacidadTotal);
    }

    public void mostrarEstadoBus() {
        System.out.println("Placa: " + placa + " | Pasajeros a bordo: " + pasajerosActuales + " | Recaudación total: Bs. " + recaudacion);
    }
}