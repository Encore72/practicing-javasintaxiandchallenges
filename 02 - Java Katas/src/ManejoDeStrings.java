import java.util.Scanner;

public class ManejoDeStrings {

    public static void main(String[] args) {
        
        miScanner();

    } 
    
    public static void miScanner() {
        Scanner manejadorDeNombres = new Scanner(System.in);
        System.out.println("Ingrese Nombre 1");
        String nombre1 = manejadorDeNombres.nextLine();
        System.out.println("Ingrese Nombre 2");
        String nombre2 = manejadorDeNombres.nextLine();
        System.out.println("Ingrese Nombre 3");
        String nombre3 = manejadorDeNombres.nextLine();

        String inicialNombre1 = nombre1.substring(0, 1).toUpperCase();
        String lastTwoNombre1 = nombre1.substring(nombre1.length()-2);

        String inicialNombre2 = nombre2.substring(0, 1).toUpperCase();
        String lastTwoNombre2 = nombre2.substring(nombre2.length()-2);

        String inicialNombre3 = nombre3.substring(0, 1).toUpperCase();
        String lastTwoNombre3 = nombre3.substring(nombre3.length()-2);

        System.out.println(inicialNombre1 + "." + lastTwoNombre1 + "_" + inicialNombre2 + "." + lastTwoNombre2 + "_" + inicialNombre3 + "." + lastTwoNombre3);

        manejadorDeNombres.close();

    }
  
}
