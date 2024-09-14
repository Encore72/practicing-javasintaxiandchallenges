package SalaDeCineComprarEntradasPro;
import java.util.ArrayList;

public class SalaDeCineComprarEntradasPro {

    static boolean[][] salaDeCine = new boolean[10][10];

    public static void main(String[] args) {

        ArrayList<Ticket> listaDeTickets = new ArrayList<Ticket>();
        listaDeTickets.add(new Ticket(2, 2));
        listaDeTickets.add(new Ticket(2, 3));
        listaDeTickets.add(new Ticket(8, 8));

        comprarEntradasConListaTickets(listaDeTickets);

        printOcupadaLibre2();

    }

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
            System.out.println("Has comprado la butaca: " + butaca + " de la fila: " + fila + ", gracias.");
        }
    }

    public static void comprarEntradasConTicket(Ticket miTicket) {
        if (salaDeCine[miTicket.getFila() - 1][miTicket.getButaca() - 1] == true) {
            System.out.println("Esta butaca está ocupada, escoja otra.");
        } else {
            salaDeCine[miTicket.getFila() - 1][miTicket.getButaca() - 1] = true;
            System.out.println(
                    "Has comprado la butaca: " + miTicket.getButaca() + " de la fila: " + miTicket.getFila() + ", gracias.");
        }
    }

                // version pro de la funcion comprarEntradasConTicket (llamamos a
                // comprarEntradasCine para no duplicar bucle if + else de la funcion anterior)
                public static void comprarEntradasConTicketPro(Ticket miTicket) {
                    comprarEntradasCine(miTicket.getFila(), miTicket.getButaca());
                }



    public static void comprarEntradasConListaTickets(ArrayList<Ticket> ticketsComprar) {
        for (int posicionDeLista = 0; posicionDeLista < ticketsComprar.size(); posicionDeLista++) {
            Ticket miTicket = ticketsComprar.get(posicionDeLista); // variable miTicket = posicion en la lista de ticketsComprar
            if (salaDeCine[miTicket.getFila() - 1][miTicket.getButaca() - 1] == true) {
                System.out.println("Esta butaca está ocupada, escoja otra.");
            } else {
                salaDeCine[miTicket.getFila() - 1][miTicket.getButaca() - 1] = true;
                System.out.println("Has comprado la butaca: " + miTicket.getButaca() + " de la fila: " + miTicket.getFila() + ", gracias.");
            }
        }
    }

                // version pro de la funcion comprarEntradasconListaTickets (llamamos a
                // comprarEntradasconListaTickets para no duplicar lineas 107 a 110)
                public static void comprarEntradasConListaTicketsPro(ArrayList<Ticket> ticketsComprar) {
                    for (int posicionDeLista = 0; posicionDeLista < ticketsComprar.size(); posicionDeLista++) {
                        Ticket miTicket = ticketsComprar.get(posicionDeLista); // variable miTicket = posicion en la lista de ticketsComprar
                        comprarEntradasConTicket(miTicket); // esto es lo mismo que elk bucle if + else de la funcion anterior
                    }
                }

}
