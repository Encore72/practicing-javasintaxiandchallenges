public class ContadorDeOvejasPro {

  // es la version pro porque utiliza Boolean (clase) en lugar de boolean (valor
  // primitivo), lo que nos permite comprobar valores null

  public static void main(String[] args) {

    countSheep(sheep);

    System.out.println(countSheep(sheep));

  }

  public static Boolean[] sheep = new Boolean[] {
      true, true, true, false,
      true, true, true, true,
      true, false, true, false,
      true, false, false, true,
      true, true, true, true,
      false, false, true, true };

  public static int countSheep(Boolean[] sheep) {
    int count = 0;
    for (Boolean present : sheep) { // recorremos (iteramos) con un for each cada elemento del array booleano
                                    // "sheep" y guardamos su valor (true o false) en la variable "present"
      if (present != null && present) { // dentro del loop un if se asegura de que NO haya un valor nulo en "present"
                                        // con "present != null" y (&&) de que sea verdadero
        count++; // y si "present" NO (!=) es nulo y (&&) si es verdadero (doble condicion),
                 // entonces cuenta +1
      }
    }
    return count;
  }

  public static int countSheep2(Boolean[] sheep2) {
    int count = 0;
    for (int j = 0; j < sheep2.length; j++) {   // lo mismo que lo anterior pero con un for en lugar de for each
      if (sheep2[j] != null && sheep2[j]) {  // lo mismo que lo anterior, verificamos que la posicion (j) en sheep2 sea NO nula y SI verdadera
        count++;
      }
    }
    return count;
  }

}
