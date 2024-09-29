public class TryCatch { 
 
    /*
     * TRY CATCH se utiliza para manejar excepciones, que son los eventos que interrumpen el flujo normal
     * de ejecución del programa debido a errores o condiciones inesperadas.
     * 
     * Por ejemplo, si dividimos por cero se produce una excepción de división por cero, TRY CATCH permite
     * capturar esa excepción y ejecutar un código alternativo en lugar de que el programa se detenga.
     * 
     * Son dos bloques, 
     * 
     * En el bloque TRY colocamos el código que podría generar la excepción
     * 
     * El bloque CATCH es el que entra en juego si se produce la excepción dentro de TRY, es donde se especifica 
     * el tipo de excepción que se espera capturar y el código que se ejecutará en caso de que ocurra.
     * 
     * Es importante usar TRY CATCH para evitar detenciones abruptas, para crear un codigo robusto y para poder
     * tomar decisiones controldas en función del tipo de excepción.
     * 
     * Adicionalmente tenemos FINALLY, que es el que se ejecutará siempre encontremos excepción o no.
     * 
     * Y como complemento, tenemos THROW que lanza una excepción manualmente, lo que permite forzar el manejo
     * de excepciones. Estas excepciones pueden ser personalizadas, por ejemplo se pueden crear clases de
     * excepción para representar errores específicos de la aplicación, por ejemplo en un sistema de reservas
     * se puede crear la excepción ReservaNoDisponibleException para indicar que no hay disponibilidad en una
     * fecha determinada.
     */


    /*
     * Hay varios tipos de excepciones, por ejemplo:
     * 
     * ArithmeticException: al intentar dividir por 0
     * IOException: error en entrada/salida de datos, como abrir un archivo que no existe.
     * SQLException: error al interactuar con una base de datos.
     * OutOfMemoryError: se lanza al agotarse la memoria
     * StackOverflowError: se lanza cuando se produce una recursión infinita
     * NullPointerException: se lanza al intentar acceder a un objeto nulo
     * IndexOutOfBoundsException: se lanza al intentar acceder a un elemento del array fuera de la capacidad del array
     * 
     * Estas son las más comunes, y también se pueden crear PERSONALIZADAS segun necesitemos.
     */


    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 0; // Intencionadamente puesto a cero para generar una excepción
    
        try {
            // Este bloque de código intenta ejecutar la operación que podría generar una excepción
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            // Este bloque se ejecuta si se produce una excepción de tipo ArithmeticException (dividir por cero)
            System.out.println("¡Error! No se puede dividir entre cero.");
            // Aquí puedes agregar código adicional para manejar la excepción,
            // como registrar un mensaje de error, mostrar un mensaje más amigable al usuario,
            // o intentar realizar otra operación.
        } finally {
            // Este bloque se ejecuta siempre, haya o no una excepción
            System.out.println("Este mensaje se muestra siempre, al final del bloque try-catch.");
        }
    }
            /*
             * la "e" después de "ArithmeticException" o cualquier tipo de excepcion se pone para declarar una variable
             * de ese tipo de excepción, en este caso ArithmeticException, y lo que hacemos es que cuando se produce esa
             * excepción que estamos buscando dentro del bloque TRY, será capturada por el bloque CATCH y será
             * asignada a la variable "e"
             * 
             * A través de esa variable podemos acceder a información detallada sobre la excepción que se ha producido, por
             * ejemplo con el método e.getMessage()
             */

    // ejemplo de throw

    public static int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return numerador / denominador;
    }
    


}
