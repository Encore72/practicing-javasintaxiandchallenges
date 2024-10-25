import java.util.Scanner;

public class ArrayBidiImprimirSilla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la silla: ");
        int sizeMatriz = sc.nextInt();

        if (sizeMatriz == 0) {
            System.out.println("No se puede imprimir la silla");
            System.exit(1);
        }

        for (int i = 0; i < sizeMatriz; i++) {
            for (int j = 0; j < sizeMatriz; j++) {

                if ((j == 0) || (i == (sizeMatriz / 2) || (j == sizeMatriz - 1 && (i >= (sizeMatriz / 2))))) {
                    System.out.print("x");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }

}
