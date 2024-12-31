package ProyectoLambdaContadorPalabras;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {
    Map<String,Integer> contarPalabras(String frase);
}
