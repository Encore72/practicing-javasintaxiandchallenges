package ProyectoLambdaEspacios;

import java.util.function.Function;

public class EjemploLambdaEspacios {

        public static void main(String[] args) {
            Function<String, String> limpiarYConvertirAMayusculas = s -> s.replaceAll("[\\s,.]", "").toUpperCase();

            String frase = "Esta, es una frase. Con, espacios, comas y puntos.";
            String resultado = limpiarYConvertirAMayusculas.apply(frase);

            System.out.println(resultado); // Imprime: ESTAESUNAFRASECONESPACIOSCOMASYPUNTOS
        }
}



