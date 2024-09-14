import java.util.Arrays;

public class StringAArray {


  public static void main(String[] args) {

 
    // creamos la variable tipo String "frase" y le damos un valor
    String frase = "Esta es una frase de ejemplo que será spliteada";

    // creamos la variable tipo Array de Strings "fraseEnArray" y le asignamos como valor el return de la funcion stringToArray
    String[] fraseConvertidaEnArray = stringToArray(frase);

    // imprimimos el array, para imprimir un array es necesario el método "Arrays.toString(nombredelarray)" porque si le damos directamente
    // el nombre del array, el nombre del array es solo una referencia (direccion) al bloque de memoria donde estanlos datos del array
    System.out.println(Arrays.toString(fraseConvertidaEnArray));


  }


  // esta funcion coge el parametro string (frase) y a través del método .split devuelve frase spliteada en palabras
  // .split es un metodo que divide un string en substrings segun un patron de separacion definido
  // el regex "\\s+" es el patron de separacion, y lo que hace es:
  /* \\s busca cualquier caracter de espacio en blanco, incluyendo espacios, tabulaciones, saltos de linea, etc...
   * + significa "uno o mas", es decir, que se buscaran uno o mas cracteres de espacio en blanco consecutivos para realizar la division en subcadenas
   */
  public static String[] stringToArray(String frase) {
    return frase.split("\\s+");
}

}
