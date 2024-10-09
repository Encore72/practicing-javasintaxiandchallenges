import javax.swing.*;
import java.util.Scanner;

public class SelectorNombreMasLargo {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese nombre 1: ");
        String nombre2 = JOptionPane.showInputDialog("Ingrese nombre 2: ");
        String nombre3 = JOptionPane.showInputDialog("Ingrese nombre 3: ");

        String nombreMasLargo = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        nombreMasLargo = (nombre3.split(" ")[0].length() < nombreMasLargo.split(" ")[0].length()) ? nombreMasLargo: nombre3;

        System.out.println("El nombre más largo es: " + nombreMasLargo);

    }

}
