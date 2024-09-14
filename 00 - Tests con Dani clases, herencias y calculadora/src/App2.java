public class App2 {
    public static void main(String[] args) throws Exception {

        String hola = "";

        // Calculadora es la clase, micalculadora es el nombre de la direccion de la memoria donde se esta guardando la clase Calculadora
        Calculadora micalculadora = new Calculadora();
        
        // Persona es la clase, mipersona es el nombre de la direccion de la memoria donde se esta guardando la clase Persona
        Persona mipersona = new Persona();

        // string es el tipo de dato que tendra nuestra nueva variable, nombre es la direccion de la memoria donde se va a guardar el nombre de este objeto en concreto
        // mipersona es donde esta guardado en la memoria la clase Persona entonces con mipersona. accedo a algo de la clase persona, al indicar "nombre"
        // despues del punto accedo unicamente a la variable nombre que he declarado en Persona.java si pusiera apellido accederia a apellido, etc...
        String nombre = mipersona.apellido;

        mipersona.nombre = "Beatriz";
        mipersona.apellido = "Infiesta";
        mipersona.edad = 8172;

        System.out.println(mipersona);


        Pirata mipirata = new Pirata();
        mipirata.nombre2 = "Beatriz";
        mipirata.apellido2 = "Infiesta";
        mipirata.edad2 = 8172;

        System.out.println(mipirata);
       
        
    }


    
}

