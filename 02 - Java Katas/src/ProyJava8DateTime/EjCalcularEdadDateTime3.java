package ProyJava8DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EjCalcularEdadDateTime3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        long anios = ChronoUnit.YEARS.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años", anios);
    }
}