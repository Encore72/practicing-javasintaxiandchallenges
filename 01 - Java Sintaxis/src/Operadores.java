public class Operadores {
    
    public static void main(String[] args) {
        
        int numero1 = 50;
        int numero2 = 100;

        // 1. de Acceso

            // 1.1. punto .
                String texto = "hola, bienvenido";
                int longitud = texto.length(); // accedemos a la propiedad lenght del texto
                    System.out.println(longitud);

            // 1.2. corchetes [] 
                int[] numeros = {1, 2, 3, 4, 5};
                int segundoNumero = numeros[2]; // accedemos al numero 2 del array
                    System.out.println(segundoNumero);


        // 2. Aritméticos
    
            // 2.1. Suma (+)
                int sumanumero1y2 = numero1 + numero2;
                    System.out.println(sumanumero1y2);

            // 2.2. Resta (-)	
                int restanumero1y2 = numero1 - numero2;
                    System.out.println(restanumero1y2);
                    
            // 2.3. Multiplicación (*)
                int multiplicacionnumero1y2 = numero1 * numero2;
                    System.out.println(multiplicacionnumero1y2);

            // 2.4. División (/)
                int divisionnumero1y2 = numero1 / numero2;
                    System.out.println(divisionnumero1y2);

            // 2.5. Exponenciación (^)	
                int exponenciacionnumero1y2 = numero1 ^ numero2;
                    System.out.println(exponenciacionnumero1y2);

            // 2.6. Módulo (%)
                int modulonumero1y2 = numero1 % numero2;
                    System.out.println(modulonumero1y2);


        // 3. De asignación (para asignar valores a variables)

            // 3.1. asignación básica
                int x = 5;

            // 3.2 asignación compuesta
                x += 3;  // Equivalente a x = x + 3
                    System.out.println(x);

                x -= 2;  // Equivalente a x = x - 2
                    System.out.println(x);

                x *= 4;  // Equivalente a x = x * 4
                    System.out.println(x);

                x /= 2;  // Equivalente a x = x / 2
                    System.out.println(x);

                x %= 7;  // Equivalente a x = x % 7
                    System.out.println(x);


        // 4. De comparación

            // 4.1. Igual ==
                boolean igual = numero1 == numero2;
                    System.out.println(igual);

            // 4.2. Distinto que !=
                boolean distintoQue = numero1 != numero2;
                    System.out.println(distintoQue);

            // 4.3. Mayor que >
                boolean mayorQue = numero1 > numero2;
                    System.out.println(mayorQue);

            // 4.4. Menor que <
                boolean menorQue = numero1 < numero2;
                    System.out.println(menorQue);

            // 4.5. Mayor o igual que >=
                boolean mayoroIgualQue = numero1 >= numero2;
                    System.out.println(mayoroIgualQue);

            // 4.6. Menor o igual que <=
                boolean menoroIgualQue = numero1 <= numero2;
                    System.out.println(menoroIgualQue);      


        // 5. Lógicos

            // 5.1. AND &&
                boolean and = mayorQue && menorQue;
                    System.out.println("and" + and);      

            // 5.2. OR ||
                boolean or = mayorQue || menorQue;
                    System.out.println("or" + or);      

            // 5.3. NOT ! (invierte el resultado logico)
                boolean not = !mayorQue;
                    System.out.println("not" + not);      

            // 5.4 TERNARIO ? :     (condicion a evauluar) ? si_verdadero_devuelve_este_valor : si_falso_devuelve_este_valor
            int edad = 18;
            System.out.println((edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad");

            // cortocicuitados (si numero1 > numero2 es verdadero entonces numero1 < numero2 nunca se evaluará)
                boolean cortocicuitado = (numero1 > numero2) && (numero1 < numero2);
                    System.out.println("cortocircuitado" + cortocicuitado);      

    }



}
