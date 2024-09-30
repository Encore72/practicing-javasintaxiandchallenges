package XMLyJSON;


/**
 * ----------------- QUE ES JSON ----------------- 
 * 
 * JSON (JavaScript Object Notation) es un formato de texto ligero y de fácil lectura para almacenar e intercambiar datos. 
 * Es una especie de diccionario o lista de compras, pero en formato digital. Se utiliza para enviar datos entre 
 * un servidor y un cliente.
 * 
 * Java cuenta con una excelente integración con JSON. Esto significa que podemos:
 * Leer archivos JSON: Convertir un archivo JSON en objetos Java para trabajar con los datos de manera más fácil.
 * Crear archivos JSON: Generar archivos JSON a partir de objetos Java para enviarlos a otras aplicaciones o almacenarlos.
 * 
 */


/** 
 * ----------------- SINTAXIS JSON ----------------- 
 * Un archivo JSON consta de pares clave-valor, encerrados entre llaves {}. Las claves siempre deben ser cadenas de texto (entre comillas dobles), y los valores pueden ser:
 * 
 * Cadenas de texto: También encerradas entre comillas dobles.
 * Números: Enteros o de punto flotante.
 * Booleanos: true o false.
 * Null: Representa un valor nulo.
 * Objetos: Otros objetos JSON, encerrados entre llaves.
 * Arrays: Listas ordenadas de valores, encerradas entre corchetes [].

                {
                    "nombre": "Juan Pérez",
                    "edad": 30,
                    "ciudad": "Madrid",
                    "esEstudiante": false,
                    "hobbies": ["leer", "programar", "viajar"],
                    "direccion": {
                        "calle": "Calle Principal",
                        "numero": 123
                    }
                }

* Objeto raíz: Todo el contenido está dentro de un objeto, indicado por las llaves {}.
* Pares clave-valor: Cada par está separado por una coma. La clave (nombre) va entre comillas dobles y está seguida de dos puntos y luego el valor.
* Cadena de texto: "nombre", "ciudad" y los elementos del array "hobbies" son cadenas de texto.
* Número: "edad" es un número entero.
* Booleano: "esEstudiante" es un valor booleano.
* Array: "hobbies" es un array de cadenas de texto.
* Objeto anidado: "direccion" es otro objeto dentro del objeto principal.
*
*/

/**
 * Lo primero que hay que hacer para parsear un JSON (leer un JSON o implementar un JSON en nuestro proyecto) es
 * agregar la dependencia, y como en este proyecto empecé creandolo sin build tools (ni maven ni gradle) entonces
 * necesito agregar la dependencia manualmente descargando el JAR de Jackson. (El JAR de Jackson es un archivo que
 * contiene la biblioteca Jackson para Java, esta biblioteca es imprescindible para trabajar con JSON, imagina que
 * JAR es una caja de herramientas que contiene todas las herramientas necesarias para que este proyecto pueda leer
 * escribir y manipular datos en formato JSON).
 * 
 * Para agregar manualmente la dependencia descargamos jackson core, jackson databind y jackson anotations de mvnrepository.com
 * 
 * JAR = Java Archive
 * 
 * Por ejemplo sin JACKSON más abajo no podríamos utilizar ObjectMapper, que es una clase importante de Jackson que 
 * permite convertir objetos en JSON y viceversa.
 */ 

 
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;  // esto indica al compilador que importe las herramintas de jackson-databind-2.172.jar (JACKSON)


public class JSONtest {

    public static void main(String[] args) throws IOException {
        // Ruta al archivo JSON (ajusta la ruta según proyecto)
        String rutaArchivo = "C:\\Users\\isaac\\Documents\\GitHub-Repositories\\tests-primerospasos\\01 - Java Sintaxis\\lib\\JSONtest.json";

        // Crear un objeto ObjectMapper (es el objeto que realiza la conversion entre JSON y JAVA o viceversa)
        ObjectMapper mapper = new ObjectMapper();

        // Leer el contenido del archivo JSON y mapearlo a un objeto
                    /**
                     * El proceso de mapeo consiste en tomar cada parte del JSON y asignarla al atributo correspondiente en el objeto Java. 
                     * Por ejemplo, si en el JSON tenemos un campo llamado "nombre", lo asignaremos al atributo nombre de la clase Persona.
                     */
        Datos datos = mapper.readValue(new File(rutaArchivo), Datos.class);
                                                                // el valuetype datos.class le dice al ObjectMapper que el tipo de dato que encontrará en el JSON
                                                                // serán propiedades que coincidirán con los atributos de la clase Datos
                                                                
        // Acceder a los datos y mostrarlos por consola
        System.out.println("Nombre de la persona: " + datos.getPersona().getNombre());
        System.out.println("Edad de la persona: " + datos.getPersona().getEdad());

        System.out.println("Mascotas:");
        for (Mascota mascota : datos.getMascotas()) {
            System.out.println("Nombre: " + mascota.getNombre() + ", Tipo: " + mascota.getTipo());
        }
    }
}

class Datos {
    private Persona persona;
    private List<Mascota> mascotas;
    
    public Persona getPersona() {
        return persona;
    }
    public List<Mascota> getMascotas() {
        return mascotas;
    }
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}

class Persona {
    private String nombre;
    private int edad;
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Mascota {
    private String nombre;
    private String tipo;

    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
