public class ContadorDeOvejas {

  public static void main(String[] args) {


    contadorDeOvejas(arrayOfSheeps);

    System.out.println(contadorDeOvejas(arrayOfSheeps));


    countSheep(sheep);

    System.out.println(countSheep(sheep));


  }

  public static boolean[] arrayOfSheeps = new boolean[] {
      true, true, true, false,
      true, true, true, true,
      true, false, true, false,
      true, false, false, true,
      true, true, true, true,
      false, false, true, true};


  public static int contadorDeOvejas(boolean[] arrayOfSheeps) {
    int numeroDeOvejas = 0;
    for (int j = 0; j < arrayOfSheeps.length; j++) {
      if (arrayOfSheeps[j] == true) {
        numeroDeOvejas++; {
        } 
      } 
    } return numeroDeOvejas;

  }


  public static Boolean[] sheep = new Boolean[] {
    true, true, true, false,
    true, true, true, true,
    true, false, true, false,
    true, false, false, true,
    true, true, true, true,
    false, false, true, true};


    public static int countSheep(Boolean[] sheep) {
        int count = 0;
        for (Boolean present : sheep) {
            if (present != null && present) {
                count++;
            }
        }
        return count;
    }

    


}
