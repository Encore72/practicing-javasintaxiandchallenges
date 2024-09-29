package InputStream;
import java.util.Scanner;


/**
 * Scanner es una clase que usamos como herramienta para obtener un flujo
 * de datos (una entrada de datos) del usuario a través de la consola.
 * 
 * Es decir, permite a nuestro programa interactuar con el usuario, solicitando
 * información y luego utilizando esos datos para realizar cálculos, tomar
 * decisiones o mostrar resultados.
 * 
 * 
 * Lectura de datos: Una vez creado el objeto, puedes utilizar diferentes métodos del objeto Scanner para leer distintos tipos de datos:
 * nextInt(): Lee un número entero.
 * nextDouble(): Lee un número decimal.
 * nextLine(): Lee una línea completa de texto.
 * next(): Lee la siguiente palabra.
 * ... y muchos otros métodos para diferentes tipos de datos.
 */
 

public class MyScanner {

    public static void main(String[] args) {
        
        miScanner();

    } 
    
    public static void miScanner() {
            // 1. Crear un objeto Scanner asociado a la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);
            // 2. Solicitar al usuario que ingrese su nombre
        System.out.println("Ingrese su nombre: ");
            // 3. Leer la línea completa ingresada por el usuario y almacenarla en una variable
        String nombre = scanner.nextLine();
            // 4. Solicitar al usuario que ingrese su edad
        System.out.println("Ingrese su edad: ");
            // 5. Leer el número entero ingresado por el usuario y almacenarlo en una variable
        int edad = scanner.nextInt();
            // 6. Imprimir un mensaje personalizado utilizando los datos ingresados
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");
            // 7. Cerrar el objeto Scanner  
        scanner.close();
        }
    }
  
