package ProyectoStreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ModStreamyReturnSum {

    public static void main(String[] args) {

        // OPCIÓN 1
        DoubleStream arrayDe100 = DoubleStream.of(IntStream.rangeClosed(1, 100)
                .filter(n -> n % 10 != 0)
                .mapToDouble(n -> n)
                .map(num -> num / 2.0)
                .reduce(0, Double::sum));

        System.out.println("La suma total es: " + arrayDe100.sum());


        // OPCIÓN 2

        // Crear un arreglo de 100 elementos con valores del 1 al 100
        int[] array = IntStream.rangeClosed(1, 100).toArray();

        // Usar Streams para realizar las operaciones requeridas
        double sum = IntStream.of(array)  // Convertir el arreglo en un flujo de enteros
                .filter(n -> n % 10 != 0)     // Eliminar los divisibles por 10
                .mapToDouble(n -> n / 2.0)     // Convertir a double y dividir entre 2
                .reduce(0.0, (a, b) -> a + b); // Sumar todos los valores

        // Imprimir el resultado
        System.out.println("La suma total es: " + sum);

    }

}
