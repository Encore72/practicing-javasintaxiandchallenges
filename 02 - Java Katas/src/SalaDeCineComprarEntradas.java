public class SalaDeCineComprarEntradas {

    static boolean[][] salaDeCine = new boolean[10][10];

    /**
     * lo de arriba es esto pero bien hecho:
     * 
     * static boolean[][] salaDeCine = {
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * {false, false, false, false, false, false, false, false, false, false},
     * };
     * 
     */

    public static void printOcupadaLibre() {
        for (int fila = 0; fila < salaDeCine.length; fila++) {
            for (int butaca = 0; butaca < salaDeCine[fila].length; butaca++) {
                if (salaDeCine[fila][butaca] == true) {
                    System.out.println("La fila: [" + fila + "], butaca: [" + butaca + "], está Ocupado.");
                } else {
                    System.out.println("La fila: [" + fila + "], butaca: [" + butaca + "], está Libre.");
                }
            }
        }
    }

    public static void printOcupadaLibre2() {
        for (int fila = 0; fila < salaDeCine.length; fila++) {
            System.out.println("");
            for (int butaca = 0; butaca < salaDeCine[fila].length; butaca++) {
                if (salaDeCine[fila][butaca] == true) {
                    System.out.print("x");
                } else {
                    System.out.print("_");
                }
            }
        }
    }

    public static void comprarEntradasCine(int fila, int butaca) {
        if (salaDeCine[fila - 1][butaca - 1] == true) {
            System.out.println("Esta butaca está ocupada, escoja otra.");
        } else {
            salaDeCine[fila - 1][butaca - 1] = true;
            System.out.println("Has comprado la butaca: " + butaca + "de la fila: " + fila + ", gracias.");
        }

    }

    public static void main(String[] args) {

        comprarEntradasCine(1, 1);

        comprarEntradasCine(9, 9);

        comprarEntradasCine(10, 10);

        comprarEntradasCine(4, 10);

        comprarEntradasCine(1, 1);

        printOcupadaLibre2();

    }

}
