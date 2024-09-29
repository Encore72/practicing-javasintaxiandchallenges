package InputStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * PrintStream es una clase que usamos para enviar datos a diferentes
 * lugares como por ejemplo la pantalla de la computadora (println),
 * o en un archivo de texto (guardar mensajes en un archivo txt para
 * por ejemplo crear un registro de errores en un archivo), o también
 * para una conexión a internet (enviar mensajes a otros dispositivos
 * o servidores).
 * 
 * 
 */

public class MyPrintStream {

    public static void main(String[] args) {

        try {
            myPrintStream();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void myPrintStream() throws FileNotFoundException {
        try (PrintStream salida = new PrintStream(
                "C:\\Users\\isaac\\Documents\\GitHub-Repositories\\tests-primerospasos\\01 - Java Sintaxis\\registroprintstream.txt")) {
            salida.println("Esto se escribirá en el archivo.");
        } catch (FileNotFoundException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }
    }

}