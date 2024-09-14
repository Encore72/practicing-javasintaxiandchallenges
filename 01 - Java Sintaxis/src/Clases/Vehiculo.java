package Clases;

public class Vehiculo {
    
    // 1. atributos
    String fabricante;
    String modelo;
    double cc;
    int year;
    boolean sportMode;
    int speed;
        // tambien se le puede dar como atributo otra clase, por ejemplo la clase motor con muchas piezas (propiedades)
        Motor motor;

    // 2. constructores (funciones especiales que permiten construir objetos a través de una plantilla) - se puede hacer sobrecarga de constructores -

        // se declaran con public + nombre de la clase (no tiene sentido static porque los constructores se van a llamar desde otras clases, esa es su naturaleza)

    public Vehiculo(String fabricante, String modelo, double cc, int year,boolean sportMode, int speed){  
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sportMode = sportMode;
        this.speed = speed;
    }

    public Vehiculo(String fabricante, String modelo){  
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

     public Vehiculo(String fabricante, String modelo, double cc, int year, boolean sportMode, int speed, Motor motor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sportMode = sportMode;
        this.speed = speed;
        this.motor = motor;
    }

    public Vehiculo() {
    }

    
    // 3. metodos
    public void acelerar(int cantidadAceleracion){
        this.speed += cantidadAceleracion;
    }

    public void decelerar(int cantidadDeceleracion){
        this.speed -= cantidadDeceleracion;
    }


        // metodo toString   para que cuando imprimas un objeto te diga que objeto es y no nombredeobjeto@direccionenlamemoria

        public String toString(){
            return "Este vehiculo es un " + fabricante + modelo + ".";
        }

}
