package InputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;


    /*
     * BufferInputStream es una subclase de InputStream que añade una capa bufer al InputStream,
     * este bufer es el area de memoria donde se almacenan temporalmente los bytes leídos por el
     * InputStream original.
     * 
     * Si InputStream es el grifo por donde pasan los datos, el Bufer es un cubo debajo del grifo,
     * y al abrir el grifo, se llena el cubo, lo que nos permite usar el agua del cubo tantas veces
     * como queramos sin necesidad de volver a abrir el grifo. Es como tener un pequeño depósito
     * de agua (datos) a mano.
     * 
     * Cuando se crea el bufer se especifica un tamaño.
     *      * 
     * BufferInputStream mejora el rendimiento porque reduce el numero de llamadas al sistema
     * operativo para leer datos de la fuente original, lo que agiliza las operaciones de entrada.
     * 
     * Es decir, si necesitamos dar pequeños sorbos de agua es mucho mas rapido coger agua del cubo
     * que ir al grifo cada vez.
     * 
     * Y además nos aporta flexibilidad, pues si tenemos que saborear el primer sorbo (primeros datos)
     * que han caído en el cubo, podemos hacerlo sin tener que volver al principio del grifo.     * 
     */


public class BufferInputStream {
  
  public static void main(String[] args) {
  
    LeerConBuffer();

  }
  
  
  // funcion para leer con buffer
  
  public static void LeerConBuffer() {
    // try con recursos: Garantiza el cierre automático de fis y bis al finalizar el bloque.
    // FileInputStream fis: Crea un objeto FileInputStream para leer el archivo.
    try (FileInputStream fis = new FileInputStream("C:\\Users\\isaac\\Documents\\GitHub-Repositories\\tests-primerospasos\\01 - Java Sintaxis\\txtparatestinputstream.txt");
        BufferedInputStream bis = new BufferedInputStream(fis)) { // Crea un objeto BufferedInputStream encapsulando el FileInputStream. El BufferedInputStream mejora la eficiencia de lectura mediante un búfer interno.
        byte[] buffer = new byte[1024]; // Declara un arreglo de bytes llamado buffer con un tamaño de 1024 bytes (ajustable). Este búfer se utilizará para almacenar los bytes leídos del archivo.
        int bytesLeidos; // Declara una variable entera bytesLeidos para almacenar la cantidad de bytes leídos en cada iteración del ciclo.
        while ((bytesLeidos = bis.read(buffer)) != -1) { // bis.read(buffer): Lee un bloque de bytes del archivo y los almacena en el arreglo buffer y 
                                                         // el método .read del devuelve la cantidad de bytes leídos (máximo el tamaño del búfer).
                                                         // != -1: El ciclo continúa mientras el valor leído sea distinto de -1. Cuando se llega al final del archivo, read devuelve -1.
            System.out.write(buffer, 0, bytesLeidos); // Escribe el contenido de "buffer" desde la posición inicial (0) hasta la cantidad de bytes leídos (bytesLeidos) en la salida estándar (consola).
        }
    } catch (IOException e) { // Captura cualquier excepción de entrada/salida que pueda ocurrir durante la lectura del archivo.
        System.err.println("Error al leer el archivo: " + e.getMessage()); // Imprime un mensaje de error indicando el motivo de la excepción.
    }
  }


  // recordar que 1 byte = 8 bits y que 1 byte = 256 caracteres diferentes

}