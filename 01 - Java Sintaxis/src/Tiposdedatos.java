import java.math.BigDecimal;

public class Tiposdedatos {
    
    @SuppressWarnings("unused")
    public static void main(String[] args) {
     
    // 1. Texto
    char letradetexto = 'a';
    String texto = "Hola, bienvenido.";

        // 2. Numérico

        // 2.1. Enteros
        byte numeropocacapacidad = 5;
        short numeromascapacidad = 10;
        int numeromasmascapacidad = 25;
        long numeromasmasmascapacidad = 100;

        // 2.2. Decimales
        float numerodecimalmenospreciso = 1.60f;
        double numerodecimalmaspreciso = 1.56d;

            // 2.3. Decimales muy muy precisos

            BigDecimal valorA = new BigDecimal(0.12);
            BigDecimal valorB = new BigDecimal(4);

                BigDecimal resultado = valorA.add(valorB);
                    System.out.println(resultado);

                BigDecimal resultado2 = valorA.subtract(valorB);
                    System.out.println(resultado2);

                BigDecimal resultado3 = valorA.multiply(valorB);
                    System.out.println(resultado3);

                BigDecimal resultado4 = valorA.divide(valorB);
                    System.out.println(resultado4);

    // 3. Booleano
    boolean variable_a = false;
    boolean variable_b = true;


    }   

}
