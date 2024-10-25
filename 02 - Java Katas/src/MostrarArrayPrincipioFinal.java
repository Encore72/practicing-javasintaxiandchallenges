import java.util.Scanner;

public class MostrarArrayPrincipioFinal {
    public static void main(String[] args) {

        int[] arrayInt = new int[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Ingrese un número entero: ");
            arrayInt[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Por el final en posición " +"["+ (arrayInt.length -i-1) +"] valor: " + arrayInt[arrayInt.length -i-1]);
            System.out.println(" Por el principio en posición " +"["+i+"] valor: " + arrayInt[i]);
        }


        // también se puede asi y es más eficiente porque son 4 iteraciones
        /*

        for (int i = 0; i <= 4; i++) {
            System.out.print("i: " + arrayInt[9 - i]); // y el i-ésimo por el final
            System.out.println(arrayInt[i]);

        */

    }
}
