package Clases;


// aquí vamos a hacer que camión herede de Vehículo

public class Camion extends Vehiculo {

    // 1. atributos (especiales de Camion, pues tiene todos los de vehiculo ya)

    double capacidadCarga;
    int pesoMaximo;

    public Camion(){

    }

    public Camion(String fabricante, String modelo, double cc, int year, boolean sportMode, int speed, Motor motor,
            double capacidadCarga, int pesoMaximo) {
        super(fabricante, modelo, cc, year, sportMode, speed, motor); // <--- super se usa para llamar al constructor de la clase padre e inicilizar los atributos heredados
        this.capacidadCarga = capacidadCarga;
        this.pesoMaximo = pesoMaximo;
    }


    
    
}