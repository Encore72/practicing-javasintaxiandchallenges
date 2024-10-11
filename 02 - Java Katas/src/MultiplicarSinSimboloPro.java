import java.util.Scanner;

class MultiplicarSinSimboloPro {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el numero num1: ");
            int num1 = scanner.nextInt();

            System.out.println("Ingrese el numero b: ");
            int num2 = scanner.nextInt();
            int resultado = 0;

            // verificamos los signos de cada uno, si es positivo o negativo
            boolean positivoA = num1 > -1;
            boolean positivoB = num2 > -1;

            // calculamos el valor absoluto de num1
            int absolutoA = positivoA ? num1 : -num1; // equivalente num1 Math.abs(num1);

            // sumamos tantas veces el valor de b, segun el valor de num1.
            for(int i = 0; i < absolutoA; i++){
                resultado = resultado + num2;
            }

            // si ambos son negativos o si solo num1 es negativo damos vuelta el signo
            if((!positivoA && !positivoB) || !positivoA){
                resultado = -resultado;
            }

            System.out.println("el resultado es " + resultado);
        }
    }