package Clases;

public class Main {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        // crear un objeto utilizando el constructor vacio
        // nombre de la clase a instanciar + nombredelobjeto(identificador) = new llamadaAlConstructor();

        Vehiculo toyotaPrius = new Vehiculo();

        // crear un objeto utilizando un constructor con parametros

        Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo ", 2100, 2010, false, 0);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.cc);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);
        fordMondeo.decelerar(30);
        System.out.println(fordMondeo.speed);


            // este es el atributo de Vehiculo que es tipo clase (atributo con atributos propios) 
            Motor motorGTI = new Motor("GTI", 190, 459.0, 6);

            Motor bicilindrico700 = new Motor ("Crossplane", 85, 120, 2);


            // este es el constructor de Vehiculo con el atributo motor incluido
            Vehiculo seatIbiza = new Vehiculo("Seat", "Ibiza", 4500, 2015, true, 0, motorGTI);
                System.out.println(seatIbiza);



            // este es el constructor de Motocicleta, la clase hija de Vehiculo (clase padre)
        Motocicleta MT07 = new Motocicleta("Yamaha", "MT07", 689, 2015, true, 220, bicilindrico700, false, false);
            System.out.println(MT07.fabricante);



        // polimorfismo

            /*
             * Todos los vehiculos aceleran, pero cada vehículo acelera de distinta forma.
             * Eso es el polimorfismo de clases, que cada clase responde de manera distinta
             * a un mismo método, por ejemeplo aqui la moto acelera mas que el camion.
             * 
             * Otro ejemplo seria el de el método hablar en la clase personay las subclases
             * pirata, piloto, oficinista. Todos son personas y todos hablan pero cada uno
             * debería hablar con sus expresiones particulares, por ejemplo el pirata dirá
             * "arr" y el piloto dirá "entrando en pista...", etc...
             */

        Vehiculo vehiculo;

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        vehiculo = new Motocicleta();
        vehiculo.acelerar(150);
         
    }

}
