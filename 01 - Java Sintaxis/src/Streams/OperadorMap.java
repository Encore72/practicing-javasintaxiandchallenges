package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OperadorMap {
    public static void main(String[] args) {

            /* El operador map es una herramienta que nos permite transformar
            cada elemento de una colección (como una lista, un set, etc.) en un nuevo elemento,
            aplicando una función específica a cada uno. Es decir, toma una colección de un tipo y
            devuelve una nueva colección del mismo tamaño, pero con los elementos transformados.
             */

        // Ejemplo 1
        Stream<String> nombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(nombre -> {
                    return nombre.toUpperCase();
                }); // esto tambien se puede simplificar con .map(String::toUpperCase)

            /* no podriamos poner .forEach directamente despues del .map porque forEach retorna un void y lo
            * estariamos encadenando a un stream del tipo String, para poder hacerlo necesitariamos declarar asi
            *
            *   Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
            *   .map(nombre -> {
            *   return nombre.toUpperCase();
            *   }).forEach(System.out::println);
            *
            * */

        nombres.forEach(System.out::println);

        // declaramos una lista y le pasamos el stream de nombres mediante el metodo collect que
        // recoge los elementos del stream y los guarda en una lista
        List<String> lista = nombres.collect(Collectors.toList());

    }
}
