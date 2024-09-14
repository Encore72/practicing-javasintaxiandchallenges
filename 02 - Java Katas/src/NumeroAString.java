public class NumeroAString {

  public static void main(String[] args) {

    // el + 2 esta para comprobar que el 803 de la consola efectivamente es un string
    System.out.println(numberAString(803) + 2);


  }

  
  public static String numberAString(int numero) {
    return Integer.toString(numero);
  }

}
