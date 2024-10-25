import java.util.Scanner;

public class LeerPromedioEnArray {
    public static void main(String[] args) {

        int[] arrayInt = new int[7];

        Scanner sc = new Scanner(System.in);

        int sumaPositivos = 0;
        int contPositivos = 0;
        int sumaNegativos = 0;
        int contNegativos = 0;
        int contCeros = 0;

            for (int i = 0; i < 7; i++) {
                System.out.println("Por favor, introduzca un número entero negativo o positivo: ");
                arrayInt[i] = sc.nextInt();
               if (arrayInt[i] > 0) {
                   sumaPositivos += arrayInt[i];
                   contPositivos++;
               } else if (arrayInt[i] < 0) {
                   sumaNegativos += arrayInt[i];
                   contNegativos++;
               } else if (arrayInt[i] == 0) {
                   contCeros += arrayInt[i];
               }
            }

        System.out.println("El número de ceros es = " + contCeros);
        System.out.println("El promedio de los nº positivos es = " + (sumaPositivos/contPositivos));
        System.out.println("El promedio de los nº negativos es = " + (sumaNegativos/contNegativos));

   }
}
