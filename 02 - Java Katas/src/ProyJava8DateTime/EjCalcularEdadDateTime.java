package ProyJava8DateTime;

import java.time.LocalDate;
import java.time.Period;

public class EjCalcularEdadDateTime {
    public static void main(String[] args) {

        String edad = "1987-05-12";

        LocalDate fechaNacimiento = LocalDate.parse(edad);

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);

        System.out.println("La persona nacida en " + edad + " tiene " + periodo.getYears() + " años, " + periodo.getMonths() + " meses y " + periodo.getDays() + " días");

    }
}
