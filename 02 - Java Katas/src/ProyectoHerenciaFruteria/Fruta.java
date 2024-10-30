package ProyectoHerenciaFruteria;

public class Fruta extends Producto{

    private double peso;
    private String color;

    public Fruta() {
    }

    public Fruta(String nombre, double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }


    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFruta{" +
                "peso=" + peso +
                ", color='" + color + '\'' +
                '}';
    }
}
