import java.util.Scanner;

public class OrdenarArrayUltaPrimero {
    public static void main(String[] args) {

        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int i = 0; i < arrayInt.length / 2; i++) {
                int aux = arrayInt[i];
                arrayInt[i] = arrayInt[arrayInt.length - i - 1];
                arrayInt[arrayInt.length - i - 1] = aux;
            }

            for (int i = 0; i < arrayInt.length; i++) {
                System.out.print(arrayInt[i] + " ");
            }


    }
}
