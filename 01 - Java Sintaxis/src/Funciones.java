public class Funciones {
    /**
     * Las funciones pueden ser con o sin parametros, y con o sin retorno
     * 
     * Sin parametros es que no recibe ningun dato de entrada, simplemente
     * realiza una acción especifica sin necesidad de información adicional.
     * 
     * Con parametros es que sí recibe datos de entrada al ser invocada,
     * y esos datos se iutilizan dentro de la función para realizar la acción.
     * 
     * Sin retorno es que la función al ejecutarse no devuelve ningún valor,
     * simplemente realiza una acción como modificar una variable global.
     * 
     * Con retorno es que la función al ejecutarse devolverá algún valor 
     * al lugar donde ha sido invocada y ese valor puede ser utilizado.
     * 
     */



    // declarar la función necesita:
    // publica o privada + static o no + tipo de retorno (si retorna) + nombre función + () + {}

    // ej1: funcion sin parametros y sin retorno

    public static void saludar(){
        System.out.println("Hola, soy la funcion sin parametros y sin retorno");
    }


    // ej2: funcion con parametros y sin retorno

    public static void imprimirNombre(String nombre){
        System.out.println("Hola, " + nombre + ", soy la función con parámetros y sin retorno.");
    }


    // ej3: funcion sin parametros y con retorno

    public static String obtenerSaludoGeneral(){
        return "¡Hola a todos, soy la funcion sin parametros y con retorno!";
    }

        /**
         * Ahora tenemos una función que retorna un valor, pero ese valor debe asignarse en algun sitio de
         * la memoria si queremos hacer algo con él, porque sino se pierde en el abismo
         */
        
        static String saludoGeneral = obtenerSaludoGeneral();
            // esto asigna el retorno de obtenersaludoGeneral() a la variable saludoGeneral



    // ej4: funcion con paramentos y con retorno

    public static int sumador(int a, int b){
        return a + b;
    }



    // bonus: sobrecarga de funciones (una misma función tenga diferentes versiones con distintos parametros)
    
        // esta funcion es la misma que la anterior pero con parametro extra (c) y por lo tanto, no da error de duplicado
    public static int sumador(int a, int b, int c){
        return a + b + c;
    }

        // o incluso con el mismo numero de parametros, podriamos usar otro tipo de datos y tampoco seria duplicada
    public static double sumador(double a, double b){
        return a + b;
    }      

    public static double precioConIva(double precio){
        return precio * 1.21;
    }




    public static void main(String[] args){

    // invocamos la función 
    // dentro de otro metodo (objeto) que no sea la propia funcion porque entonces estariamos haciendo recursividad):

        saludar();

        imprimirNombre("Alfredo");
        
        System.out.println(saludoGeneral);
        
        System.out.println(sumador(30, 40));
        
        System.out.println(precioConIva(10.0));
    
    }
             



    /** ¿Qué es STATIC y para qué se usa?
     * Una clase es una fábrica de objetos y cada objeto de esa clase es un objeto único, sin embargo
     * hay herramientas o recursos que todos los objetos de esa fábrica pueden compartir y que no están
     * limitados a un objeto.
     * Si tenemos una clase llamada UtilidadesMatematicas, lo normal es que queramos dotar a esa clase
     * de métodos (funciones) que deberán poder ser llamados desde todos los objetos (instancias) de la
     * clase UtilidadesMatematicas, o directamente desde cualquier lugar de la clase sin necesidad
     * de instanciar esa clase en un objeto.
     * Estas funciones pueden ser SUMAR, RESTAR, MULTIPLICAR y DIVIDIR, y les pondremos STATIC para poder
     * invocarlas desde cualquier lugar dentro de la clase.
     */

    /**¿Que es PUBLIC o PRIVATE y para qué se usa?
     * A diferencia de STATIC, que determina -pertenencia-, PUBLIC o PRIVATE determinan -visibilidad- de 
     * la función o el atributo respecto a todo el código.
     * Un método o atributo PUBLIC puede ser accedido y utilizado desde cualquier parte del código (y modificado), 
     * mientras que un método o atributo PRIVATE sólo puede ser accedido desde dentro de la misma clase
     * donde se define y permite controlar estrictamente el acceso a través de getters y setters.
     */
    
    
}


