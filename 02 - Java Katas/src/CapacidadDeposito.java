import java.util.Scanner;

public class CapacidadDeposito {

    public static void main(String[] args) {
        
        miScanner();

    } 
    
    public static void miScanner() {
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Indique litros en depósito: ");
        double litros = miScanner.nextDouble();

        if (litros == 70) {
            System.out.println("Capacidad de deposito: Lleno");
        } else if (litros >= 60 && litros < 70){
            System.out.println("Capacidad de deposito: Casi lleno");
        } else if (litros >= 40 && litros < 60){
            System.out.println("Capacidad de deposito: 3/4");
        } else if (litros >= 35 && litros < 40) {
            System.out.println("Capacidad de deposito: 2/4");
        } else if (litros >= 20 && litros < 35) {
            System.out.println("Capacidad de deposito: Suficiente");
        } else if (litros >= 0 && litros < 20) {
            System.out.println("Capacidad de deposito: Insuficiente");
        } else {
            System.out.println("Capacidad de deposito: Fuera del límite");
        }
    }
}
