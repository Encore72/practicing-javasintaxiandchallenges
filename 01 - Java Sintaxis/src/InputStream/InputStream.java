package InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
     * InputStream es una clase abstracta que representa la fuente de un flujo de bytes de entrada.
     * Es decir InputStream es el grifo a través de donde pasa el flujo de bytes (agua).
     * Esa fuente de bytes pueden ser diversos lugares, un archivo, una conexión de red, un teclado...
     * 
     * InputStream proporciona un conjunto de métodos para leer datos de ese flujo de bytes, ya sea
     * leyendo un byte a la vez, un arreglo de bytes o incluso un numero determinado de bytes.
     * 
     * Estos métodos por ejemplo son:
     * 
     * read(): lee un solo byte del flujo y devuelve un entero respresentando ese byte, si se ha llegado
     * al final del flujo devuelve -1
     * 
     * read(byte[] b): lee una cantidad de bytes del flujo y los almacena en el array de bytes b
     * 
     * close(): cierra el flujo de entrada, liberando los recursos asociados.
     * 
     * 
     */
    
    
   


public class InputStream {

    public static void main(String[] args) {

        LeerFicheroCompleto();
        LeerByteAByte();
        
    }
    

    // funcion para leer el fichero completo

    public static void LeerFicheroCompleto() {
        // FileInputStream fichero: Crea un objeto FileInputStream para leer el archivo especificado en la ruta
        try (FileInputStream fichero = new FileInputStream("C:\\Users\\isaac\\Documents\\GitHub-Repositories\\tests-primerospasos\\01 - Java Sintaxis\\txtparatestinputstream.txt")) { 
            // try con recursos: Este bloque garantiza que el recurso fichero se cierre automáticamente al finalizar el bloque, incluso si ocurre una excepción.
            byte[] contenidoDelFichero = fichero.readAllBytes(); // Lee todos los bytes del archivo txt y los guarda en el array de bytes contenidoDelFichero
            String contenidoDelFicheroConvertidoATexto = new String(contenidoDelFichero); // Convierte los bytes a una cadena de texto utilizando el constructor de la clase String
            System.out.println(contenidoDelFicheroConvertidoATexto);
        } catch (IOException e) { // Captura cualquier excepción de entrada/salida que pueda ocurrir durante la lectura del archivo.
            System.err.println("Error al leer el archivo: " + e.getMessage()); // Imprime un mensaje de error en la consola, indicando el motivo de la excepción.
        }
    }


    // funcion para leer el fichero Byte a Byte (.read en lugar de .readAllBytes)

    public static void LeerByteAByte() {
        // try con recursos: Este bloque garantiza que el recurso fichero2 se cierre automáticamente al finalizar el bloque, incluso si ocurre una excepción.
        // FileInputStream fichero2: Crea un objeto FileInputStream para leer el archivo especificado en la ruta
        try (FileInputStream fichero2 = new FileInputStream("C:\\Users\\isaac\\Documents\\GitHub-Repositories\\tests-primerospasos\\01 - Java Sintaxis\\txtparatestinputstream.txt")) {
            int byteLeido; // Declara una variable byteLeido para almacenar el valor del byte leído.
            while ((byteLeido = fichero2.read()) != -1) { 
                // fichero2.read(): Lee un byte del archivo y lo guarda en la variable byteLeido.
                // != -1: El ciclo continúa mientras el valor leído sea distinto de -1. Cuando se llega al final del archivo, el método read() devuelve -1.
                System.out.print((char) byteLeido); // Convierte el valor del byte a un carácter (casting) y lo imprime en la consola usando print (sin salto de línea).
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
