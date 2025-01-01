package ProyectoNumMayorArrayLambda;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class EjNumMayorArrayLambda {

    public static void main(String[] args) {

        // Crear un generador de números aleatorios
        Random random = new Random();

        // Generar un Stream de hasta 15 números aleatorios entre 1 y 100
        Stream<Integer> numerosAleatorios = Stream.generate(() -> random.nextInt(100) + 1)
                .limit(15)
                .peek(System.out::println); // Limitar el número de valores a 15

        // Definir una función que devuelve el valor mismo (se puede modificar para alguna transformación)
        Function<Integer, Integer> obtenerValor = (n) -> n;

        // Utilizar reduce para obtener el número mayor del Stream
        Optional<Integer> maxNumero = numerosAleatorios
                .map(obtenerValor) // Aplicar la función a cada elemento
                .reduce((a, b) -> a > b ? a : b); // Reducir para obtener el mayor número

        // Mostrar el resultado
        maxNumero.ifPresent(max -> System.out.println("El número mayor es: " + max));



        // OTRA FORMA DE HACERLO:

        Function<int[], Integer> max = arr -> Arrays.stream(arr)
                .reduce(0, (ac, e) -> ac > e? ac: e);

        int[] numerosAleatorios2 = Stream.generate(() -> random.nextInt(100) + 1)
                .limit(15)
                .peek(System.out::println)
                .mapToInt(Integer::intValue)
                .toArray();

        int resultado = max.apply(numerosAleatorios2);

        System.out.println("El número mayor es: " + resultado);
    }

}

