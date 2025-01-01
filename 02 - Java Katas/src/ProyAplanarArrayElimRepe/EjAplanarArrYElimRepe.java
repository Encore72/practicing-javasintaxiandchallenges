package ProyAplanarArrayElimRepe;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjAplanarArrYElimRepe {

    public static void main(String[] args) {
        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"}, {}
        };

        String[] lenguajesUnicos = Arrays.stream(lenguajes)  // Convertimos el array bidimensional en un Stream
                .flatMap(Arrays::stream)  // Aplanamos cada sub-arreglo en un solo Stream
                .distinct()  // Eliminamos los duplicados
                .toArray(String[]::new);  // Recogemos el resultado en un arreglo de tipo String[]

        // Imprimir el resultado
        System.out.println(Arrays.toString(lenguajesUnicos));


        // OTRA FORMA DE HACERLO

        String[][] lenguajes2 = {{"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };
        Arrays.stream(lenguajes2)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(e -> System.out.println(e));


        // Y OTRA FORMA (con función lambda)

        String[][] lenguajes3 = {{"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };
              Function<String[][], List<String>> flatten = arr -> Arrays.stream(arr)
                .flatMap(a -> Arrays.stream(a))
                .distinct()
                .collect(Collectors.toList());

        flatten.apply(lenguajes3).forEach(e -> System.out.println(e));

    }

}
