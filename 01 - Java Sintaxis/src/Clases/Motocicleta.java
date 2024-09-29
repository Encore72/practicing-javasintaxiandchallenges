package Clases;


// aquí vamos a hacer que motocicleta herede de Vehículo

public class Motocicleta extends Vehiculo {

    // 1. atributos (especiales de Motocicleta, pues tiene todos los de vehiculo ya)

    boolean baulCasco;
    boolean carenado;


    // 2. constructores

    public Motocicleta(){

    }

    public Motocicleta(String fabricante, String modelo, double cc, int year, boolean sportMode, int speed,
            Motor motorGTI, boolean baulCasco, boolean carenado) {
        super(fabricante, modelo, cc, year, sportMode, speed); // <--- super se usa para llamar al constructor de la clase padre e inicilizar los atributos heredados
        this.baulCasco = baulCasco;
        this.carenado = carenado;
    }

    
    // 3. metodos

    public void wheelie(){

    }


}