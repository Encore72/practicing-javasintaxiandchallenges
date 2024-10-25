import java.util.Scanner;
import java.lang.Math;

class CalculadorAreaCirculo {

    public static void main(String[] args) {

        miScanner();

    }

    public static void miScanner() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio de su circulo: ");

        double radio = sc.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("area = " + area);

    }

}