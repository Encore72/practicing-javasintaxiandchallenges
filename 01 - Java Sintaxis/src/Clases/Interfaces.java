package Clases;

public class Interfaces {

    // interfaces

    /*
     * Las interfaces son una declaración que definen un conjunto de métodos que
     * posteriormente las clases pueden implementar.
     * Los interfaces tienen un altísimo nivel de abstracción, son una declaración
     * de la forma de interactuar con una clase.
     * 
     * Modela comportamientos, no entidades.
     * 
     * Modela la acción de conducir, no la entidad vehículo o coche.
     * 
     * Modela la acción de hablar, no la entidad persona o alien.
     * 
     * Ejemplo: la clase Conductores tienen un método que es conducir(), pero claro
     * conducir el qué… ¿coches o cualquier cosa que se pueda conducir como furgonetas 
     * o carrozas de carnaval?
     * 
     * Hay que tener cuidado de no querer hacer interfaces para todo (cada clase no
     * puede tener su propia interfaz porque pierde el sentido) porque al mismo tiempo 
     * las interfaces tienen su gracia en ser capaces de modelizar comportamientos de 
     * forma generalizada para varias clases y objetos. No hay una receta mágica, hay 
     * que aprender a equilibrar.
     */




    // creamos la interfaz DispositivoElectronico

    interface DispositivoElectronico {
        void encender();
        void apagar();
        void mostrarInformacion();
    }



    // creamos la clase telefono, que implementa la interfaz(comportamiento) de DispositivoElectronico

    class Telefono implements DispositivoElectronico {
        private String marca;
        private String modelo;
        
        @Override
        public void encender() {
            System.out.println("Encendiendo el teléfono " + marca + " " + modelo);
        }
    
        @Override
        public void apagar() {
            System.out.println("Apagando el teléfono " + marca + " " + modelo);
        }
    
        @Override
        public void mostrarInformacion() {
            System.out.println("Información del teléfono: " + marca + ", " + modelo);
        }
    }
    

    // creamos la clase Computadora, que tambien implementa la interfaz(comportamiento) de DispositivoElectronico


    class Computadora implements DispositivoElectronico {
        private String sistemaOperativo;
        private int capacidadDisco;
         
        @Override
        public void encender() {
            System.out.println("Encendiendo la computadora con " + sistemaOperativo);
        }
    
        @Override
        public void apagar() {
            System.out.println("Apagando la computadora");
        }
    
        @Override
        public void mostrarInformacion() {
            System.out.println("Información de la computadora: " + sistemaOperativo + ", " + capacidadDisco + " GB");
        }
    }


    /*
     * ¿Cuándo usar herencias y cuando interfaces?
     * La herencia significa pertenencia, la interfaz significa comportamiento.
     * La herencia es cuando puedes decir “es un”
     * La interfaz es cuando puedes decir “puede/ se puede”
     * 
     * Por ejemplo:
     * 	Una furgoneta es un vehículo (herencia)
     * 	Un coche es un vehículo (herencia) 
     * 	Un pájaro no es un vehículo (herencia)
     * 	Una furgoneta se puede conducir (interfaz)
     * 	Un coche se puede conducir (interfaz)
     * 	Un pájaro no se puede conducir (interfaz)
     */

}
