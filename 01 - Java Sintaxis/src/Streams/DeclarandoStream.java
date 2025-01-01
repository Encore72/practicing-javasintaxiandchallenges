package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DeclarandoStream {

    public static void main(String[] args) {

        // 01 - Crear un stream de números enteros
        Stream<Integer> streamOfNumbers = Stream.of(5, 10, 15, 20, 25, 30, 35, 40, 45, 50);

            // e es una variable que va recorriendo cada uno de los elementos del stream
            streamOfNumbers.forEach(e -> System.out.println(e));

            // esto es lo de arriba pero con referencia directa :: al method println
            // streamOfNumbers.forEach(System.out::println);

            // Crear un stream de nombres
            Stream<String> streamOfNames = Stream.of("Pato Gomez", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena");


        // 02 - crear stream a partir de un array

        String[] arr = {"a", "b", "c", "d"};

        Stream<String> streamFromArray = Stream.of(arr);

        streamFromArray.forEach(System.out::println);


        // 03 - Crear un stream con streambuilder
        Stream<String> streamConBuilder = Stream.<String>builder()
                .add("a")
                .add("b")
                .add("c")
                .add("d")
                .build();

        // 04 - Crear un stream a partir de un list

            // primero creamos la lista
            List<String> lista = new ArrayList<>();
            lista.add("a");
            lista.add("b");
            lista.add("c");
            lista.add("d");

            // luego convertimos la lista a stream
            Stream<String> streamFromList = lista.stream();

            // y por último recorremos el stream
            streamFromList.forEach(System.out::println);

            // o tambien podemos hacerlo directamente sin crear una variable "streamFromList"
            lista.stream().forEach(System.out::println);


        // DIFERENCIAS ENTRE ARRAYS.STREAM Y STREAM.OF

        int[] numeros = {1, 2, 3, 4, 5, 6};

        // Usamos Arrays.stream para convertir el array en un flujo de enteros
        Arrays.stream(numeros)  // Convierte el array a un IntStream
                .filter(n -> n % 2 == 0)  // Filtra solo los números pares
                .map(n -> n * 2)  // Multiplica por 2 los números filtrados
                .forEach(System.out::println);  // Imprime el resultado


        Integer[] numeros2 = {1, 2, 3, 4, 5, 6};

        // Usamos Stream.of para convertir el array en un flujo de un solo elemento: el array completo
        Stream.of(numeros2)  // Convierte el array a un Stream<Integer[]>
                .filter(n -> n % 2 == 0)  // Filtra solo los números pares
                .map(n -> n * 2)  // Multiplica por 2 los números filtrados
                .forEach(System.out::println);  // Imprime el resultado

        /*

        CONCLUSION

        Arrays.stream es ideal cuando estás trabajando con un array de primitivos como int[], ya que
        convierte el array en un flujo especializado (IntStream), que permite trabajar de forma eficiente
        con los elementos del array.

        Stream.of funciona con arrays de objetos, como Integer[], y crea un flujo de esos objetos. No es
        adecuado para arrays de primitivos (como int[]), ya que trata el array como un único objeto en lugar
        de sus elementos individuales.

         */


    }
}
