package ProyectoLambdaContadorPalabras;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjemploLambdaContador {

    public static void main(String[] args) {
        String frase = "la casa es grande la casa está limpia la casa es bella";

        // Expresión lambda que cuenta las palabras más repetidas
        Map<String, Integer> resultado = Arrays.stream(frase.split("\\s+"))  // Divide la frase en palabras
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))  // Cuenta la frecuencia de cada palabra
                .entrySet()
                .stream()  // Convierte el Map a Stream para obtener la más repetida
                .max(Comparator.comparingInt(Map.Entry::getValue))  // Encuentra la palabra con mayor frecuencia
                .map(entry -> Collections.singletonMap(entry.getKey(), entry.getValue()))  // Devuelve un Map con la palabra más repetida
                .orElse(Collections.emptyMap());  // Si no hay palabras, devuelve un Map vacío

        // Mostrar el resultado
        resultado.forEach((palabra, cantidad) -> System.out.println("Palabra: " + palabra + ", Repeticiones: " + cantidad));
    }

}