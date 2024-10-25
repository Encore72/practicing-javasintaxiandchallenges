import java.text.ParseException;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

class CalculadorEdad {

    public static void main(String[] args) {

        miScanner();

    }
    public static void miScanner() {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Pedimos al usuario que ingrese su fecha de nacimiento
            System.out.println("Introduzca su fecha de nacimiento en formato YYYY-MM-DD: ");
            String fechaNacimientoIntroducida = sc.nextLine();

            // Convertimos la fecha de nacimiento a un objeto Date
            Date fechaNacimiento = format.parse(fechaNacimientoIntroducida);
            Date fechaActual = new Date();

            System.out.println("La fecha de hoy es: " + fechaActual);
            System.out.println("La fecha de nacimiento del usuario es: " + fechaNacimiento);;

            // Calculamos la diferencia en milisegundos
            long edadPersona = fechaActual.getTime() - fechaNacimiento.getTime();

            // Convertimos la diferencia a años (aproximado)
            long MILLIS_PER_YEAR = 1000L * 60L * 60L * 24L * 365L;
            int edadEnAnios = (int) (edadPersona / MILLIS_PER_YEAR);

            System.out.println("La edad de la persona es: " + edadEnAnios);

        } catch (Exception e) {
            System.out.println("Error al ingresar la fecha. Por favor, ingrese una fecha válida en formato YYYY-MM-DD");
        }
    }
}