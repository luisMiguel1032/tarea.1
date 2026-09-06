public class auto {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private String color;

    public auto(String marca, String modelo, int anio, int kilometraje, String color){
        this.marca =marca;
        this.modelo=modelo;
        this.anio=anio;
        this.kilometraje=kilometraje;
        this.color=color;
    }
    // metodo para mostrar el kilometraje en kilometros y en  metros
    public void mostrarKilometraje(){
        int metros=kilometraje*1000;
        System.out.println("el kilometraje:"+ kilometraje+" km y en metros es: "+metros+" m"+"marca"+marca);
    }
    public void setcolor(String color){
        this.color=color;
        System.out.println("el color del auto es: "+color);
    }
    public String getColor() {
        return color;
    }
    }