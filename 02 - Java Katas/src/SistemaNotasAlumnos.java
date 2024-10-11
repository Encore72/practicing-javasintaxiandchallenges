import java.util.Scanner;

class SistemaNotasAlumnos {

    public static void main(String[] args) {

        miScanner();

    }

    public static void miScanner() {

        Scanner miScanner = new Scanner(System.in);

        int i = 0;
        int notas1 = 0;
        int notasMayorA5 = 0;
        int notasMenoresA4 = 0;
        int notasResto = 0;
        double sumaNotasMayorA5 = 0;
        double sumaNotasMenoresA4 = 0;
        double sumaNotasResto = 0;


        for (i = 0; i < 20; i++) {
            double entrada;
            boolean error = false;

            do {
                System.out.println("Introduzca la Nota número " + (i + 1));
                entrada = miScanner.nextDouble();

                if (entrada == 0) {
                    error = true;
                    break;
                } else if (entrada < 1 || entrada > 7) {
                    System.out.println("Error! La nota debe ser entre 1 y 7");
                }

                if (error) {
                    System.out.println("Error! La nota no puede ser 0. Programa finalizado.");
                    System.exit(1);
                }

                if (entrada == 1) {
                    notas1++;
                    sumaNotasResto += entrada;
                } else if (entrada >= 5) {
                    notasMayorA5++;
                    sumaNotasMayorA5 += entrada;
                } else if (entrada <= 4) {
                    notasMenoresA4++;
                    sumaNotasMenoresA4 += entrada;
                } else {
                    notasResto++;
                    sumaNotasResto += entrada;
                }

            } while (entrada < 1 || entrada > 7);
        }

        System.out.println("El número de notas 1 es: " + notas1);
        System.out.println("La media de las notas mayores a 5 es: " + sumaNotasMayorA5 / notasMayorA5);
        System.out.println("La media de las notas menores a 4 es: " + sumaNotasMenoresA4 / notasMenoresA4);

        double mediaTotal = ((sumaNotasMayorA5 + sumaNotasMenoresA4 + sumaNotasResto) / i);

        System.out.println("La media total de todas las notas es: " + mediaTotal);

    }

}