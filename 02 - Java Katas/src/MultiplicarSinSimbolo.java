import java.util.Scanner;

class MultiplicarSinSimbolo {

    public static void main(String[] args) {

        miScanner();

    }

    public static void miScanner() {

        Scanner miScanner = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Ingrese un número entero positivo o negativo");
        int numero1 = miScanner.nextInt();
        System.out.println("Ingrese otro número entero positivo o negativo");
        int numero2 = miScanner.nextInt();

        boolean esPositivo1 = (numero1 >= 0);
        boolean esPositivo2 = (numero2 >= 0);

        if (!esPositivo1) {
            numero1 = -numero1;
        }

        if (!esPositivo2) {
            numero2 = -numero2;
        }


        for (int i = 0; i < numero1; i++) {
            resultado += numero2;

        }

        if (!esPositivo1) {
            resultado = -resultado;
        }

        if (!esPositivo2) {
            resultado = -resultado;
        }

        System.out.println(resultado);

    }

}