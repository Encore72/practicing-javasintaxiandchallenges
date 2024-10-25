import java.util.Scanner;

public class ArrayBidiImprimirX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz: ");
        int sizeMatriz = sc.nextInt();

        if (sizeMatriz == 0) {
            System.out.println("No se puede imprimir la matriz");
            System.exit(1);
        }

        for (int i = 0; i < sizeMatriz; i++) {
            for (int j = 0; j < sizeMatriz; j++) {

                if ((i == j) || (j == sizeMatriz - i - 1)) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }

    }

}
