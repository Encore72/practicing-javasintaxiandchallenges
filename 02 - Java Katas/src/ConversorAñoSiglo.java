public class ConversorAñoSiglo {

public static void main(String[] args) {
  
        
    System.out.println(obtenerSiglo(150));
    
    System.out.println(century(2000));

}
 
    public static int obtenerSiglo(int año) {
            // Si el año es divisible por 100, el siglo es el resultado de la división entre 100.
            // Por ejemplo, el año 2000 pertenece al siglo 20.
        if (año % 100 == 0) {
            return año / 100;
        } else {
                // Si el año no es divisible por 100, sumamos 1 al resultado de la división entera entre 100.
                // Por ejemplo, el año 1999 pertenece al siglo 20.
            return año / 100 + 1;
        }
    }


        public static int century(int number) {
            return (number + 99) / 100;
        }
       


}
