package Streams;

import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;

public class StreamExamples {
    public static void main(String[] args) {

        // A) DECLARAR UN STREAM

        // 1. Stream vacío
        Stream<String> emptyStream = Stream.empty();

        // 2. Stream de un único elemento
        Stream<String> singleElementStream = Stream.of("example");

        // 3. Stream desde varios elementos
        Stream<String> multipleElementsStream = Stream.of("example", "example2", "example3");

        // 4. Stream generado por una función (infinito)
        Stream<String> generatedStream = Stream.generate(() -> "example");

        // 5. Stream iterativo (infinito o limitado)
        Stream<String> iterativeStream = Stream.iterate("example", s -> s + "!");
        Stream<String> limitedIterativeStream = Stream.iterate("example", s -> s + "!").limit(5);


        // B) CONVERTIR UN DATO O ESTRUCTURA DE DATOS A STREAM

        // 1. Array a Stream
        String[] array = {"example", "example2", "example3"};
        Stream<String> arrayStream = Arrays.stream(array);

        // 2. Lista (o cualquier Collection) a Stream
        List<String> list = List.of("example", "example2", "example3");
        Stream<String> listStream = list.stream();

        // 3. Map a Stream (clave, valor o entradas)
        Map<Integer, String> map = Map.of(1, "example", 2, "example2");
        Stream<Integer> keysStream = map.keySet().stream();
        Stream<String> valuesStream = map.values().stream();
        Stream<Map.Entry<Integer, String>> entriesStream = map.entrySet().stream();

        // 4. String a Stream de caracteres
        String text = "example";
        IntStream charCodeStream = text.chars(); // Stream de códigos Unicode
        Stream<Character> charStream = text.chars().mapToObj(c -> (char) c); // Stream de caracteres

        // 5. String a Stream de palabras (usando split)
        String textWithWords = "example text with words";
        Stream<String> wordsStream = Arrays.stream(textWithWords.split(" "));

        // 6. Stream desde un archivo (líneas del archivo)
        try (Stream<String> fileStream = Files.lines(Paths.get("example.txt"))) {
            // Procesar el stream
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 7. Stream desde un rango numérico
        IntStream intStream = IntStream.range(1, 5); // Stream de enteros de 1 a 4
        LongStream longStream = LongStream.rangeClosed(1, 5); // Stream de enteros de 1 a 5

        // 8. Stream desde una cola (Queue)
        Queue<String> queue = new LinkedList<>();
        queue.add("example");
        queue.add("example2");
        Stream<String> queueStream = queue.stream();

        // 9. Stream desde un conjunto (Set)
        Set<String> set = Set.of("example", "example2");
        Stream<String> setStream = set.stream();

        // 10. Stream desde un flujo paralelo
        List<String> parallelList = List.of("example", "example2", "example3");
        Stream<String> parallelStream = parallelList.parallelStream();



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


    }
}
