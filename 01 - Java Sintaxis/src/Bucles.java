public class Bucles {

    /**
     * Usamos tambien continue para detener le ejecucion del codigo en el bucle 
     * y forzarlo a pasar a la siguiente instruccion y break para detener el bucle
     */

    public static void main(String[] args) {

        // 1. While

        int contador = 1;

        while (contador < 10) {
            contador++;
            if (contador == 7)
                break; // o tambien continue y contador subiria hasta 10
        }
        System.out.println("Valor de contador" + contador);


        // 2. Do While

        do {
            contador++;
        } while (contador > 10);
        System.out.println("Valor de contador" + contador);


        // 3. For (initialization; condition; update) inicio, condicion para seguir o no el bucle, accion

               // La initialization es para que el bucle sepa donde esta en cada pasada

        for (int pagina = 1; pagina <= 10; pagina++) {
            System.out.println("Pegando una estampa en la página " + pagina);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println("el valor de i es:" + i);
        }

        String texto = "Este texto debe ir al revés";
            System.out.println(texto);

                        // recorremos el string de atrás hacia adelante, texto.length() -1 nos inicializa en el ultimo caracter del string
        for (int j = texto.length() -1; j >= 0; j--) {
            System.out.println("Caracter actual: " + texto.charAt(j));
        }

                        // recorremos el string de adelante hacia atrás
        for (int k = 0; k < texto.length(); k++) {
            System.out.println("Caracter actual: " + texto.charAt(k));
        }


        
        // 4. For Each - sintaxis especial de java para bucle foreach

        var cajaDeJuguetes = new String[]{"Juguete 1", "Juguete 2", "Juguete 3"};

        for (var juguete : cajaDeJuguetes) {
            System.out.println(juguete);
        } 
                // Es como pedirle al programa que saque todos los juguetes de la caja uno a  uno y te los enseñe, o haga otra cosa con ellos


        // 5. Bucles anidados, ejemplos

            // recorriendo un array bidimensional con un bucle for each
            int[][] arrayBidimensional = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {10, 11, 12}
                };
            
            for (int[] fila : arrayBidimensional) {
                for (int valorencontrado : fila) {
                    System.out.print(valorencontrado);
                } System.out.println();
            }


            // recorriendo un array bidimensional con un bucle for 
            int[][] arraybidimensional = new int[4][3];

            arraybidimensional[0][0] = 1;
            arraybidimensional[0][1] = 2;
            arraybidimensional[0][2] = 3;

            arraybidimensional[1][0] = 4;
            arraybidimensional[1][1] = 5;
            arraybidimensional[1][2] = 6;

            arraybidimensional[2][0] = 7;
            arraybidimensional[2][1] = 8;
            arraybidimensional[2][2] = 9;

            arraybidimensional[3][0] = 10;
            arraybidimensional[3][1] = 11;
            arraybidimensional[3][2] = 12;

            
            for (int fila = 0; fila < arraybidimensional.length; fila++) {
                for (int columna = 0; columna < arraybidimensional[fila].length; columna++) {
                    System.out.println("Posición: [" + fila + "][" + columna + "] contiene el valor " + arraybidimensional[fila][columna]);
                }              
            }
    }
}
