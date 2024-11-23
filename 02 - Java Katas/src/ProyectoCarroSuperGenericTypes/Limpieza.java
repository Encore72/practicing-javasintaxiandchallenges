package ProyectoCarroSuperGenericTypes;

public class Limpieza extends ProductoSupermercado {

    private String Componentes;
    private double litros;

    public Limpieza(){

    }

    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        Componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return Componentes;
    }

    public void setComponentes(String componentes) {
        Componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

}
