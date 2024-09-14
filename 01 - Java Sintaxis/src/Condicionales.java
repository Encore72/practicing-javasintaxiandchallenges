public class Condicionales {

    public static void main(String[] args) {

        // 1. If - si pasa esto -> haz esto
        int edad = 18;

        if (edad >= 17) {
            System.out.println("Es mayor de edad");
        }

        // 2. If Else - si pasa esto -> haz esto, si no -> haz esto otro

        int edad2 = 15;

        if (edad2 >= 17) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        // 3. If Else If - si pasa esto -> haz esto, si no verifica esto otro -> y haz esto otro -> y si nada de lo anterior, haz esto otro

        int temperatura = 30;

        if (temperatura >= 30) {
            System.out.println("Hace calor");
        } else if (temperatura > 15) {
            System.out.println("Hace buen día");
        } else {
            System.out.println("Hace frio");
        }

                // calculadora de prestamo de coche
                int carLoan = 10000;
                int loanLength = 3;
                int interestRate = 5;
                int downPayment = 2000;
            
                if (loanLength <= 0) {
                System.out.println("Error! Your must take out a valid car loan.");
                } else if (downPayment >= carLoan) {
                System.out.println("The car can be paid in full.");
                } else {
                int remainingBalance = carLoan - downPayment;
                int months = loanLength * 12;
                int monthlyBalance = remainingBalance / months;
                int interest = (monthlyBalance * interestRate) / 100;
                int monthlyPayment = monthlyBalance + interest;
                System.out.println(monthlyPayment);
                }

                


        // 4. Switch - En funcion de lo que valga 'esto', haz una de estas cosas...

        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Es lunes!");
                break;
            case 2:
                System.out.println("Es Martes!");
                break;
            case 3:
                System.out.println("Es Miercoles!");
                break;
            case 4:
                System.out.println("Es Jueves!");
                break;
            case 5:
                System.out.println("Es Viernes!");
                break;
            default:
                System.out.println("Es Fin de Semana!");
                break;
        }

        // 5. Anidación de condicionales

        boolean condicion1 = true;
        boolean condicion2 = false;

        if (condicion1) {

            if (condicion2) {
                // Acción si ambas condiciones son verdaderas

            } else {
                // Acción si la condición2 es falsa
            }
        } else {
            // Acción si la condición1 es falsa
        }

    }

}
