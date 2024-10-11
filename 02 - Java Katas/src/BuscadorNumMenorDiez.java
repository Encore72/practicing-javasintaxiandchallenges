import java.util.Scanner;

class BuscadorNumMenorDiez {

    public static void main(String[] args) {

        miScanner();

    }

    public static void miScanner() {

        Scanner miScanner = new Scanner(System.in);
        String[] numIntrodArray = new String[0];

        do {
            System.out.println("Indique 10 números separados por guión: ");
            String numIntroducidos = miScanner.nextLine();
            numIntrodArray = numIntroducidos.split("-");

            if (numIntrodArray.length != 10) {
                System.out.println("Error! Debe ingresar exactamente 10 números!");
            }
        } while (numIntrodArray.length != 10);

        Double[] numIntrodArrayDouble = new Double[numIntrodArray.length];

        for (int i = 0; i < numIntrodArray.length; i++) {
            numIntrodArrayDouble[i] = Double.parseDouble(numIntrodArray[i]);
        }

        double menor = Double.MAX_VALUE;

        for (int i = 0; i < numIntrodArrayDouble.length; i++) {
            menor = (numIntrodArrayDouble[i] < menor) ? numIntrodArrayDouble[i] : menor;
        }

        System.out.println("El numero menor es: " + menor);

        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número " + menor + " es igual o mayor que 10!");
        }

    }

}