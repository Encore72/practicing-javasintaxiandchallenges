public class ArrayNumeroMasRepetido {
    public static void main(String[] args) {

        int[] arrayInt = {100, 200, 300, 300, 400, 500, 500, 500, 600, 700};
        int[] arrayAux = new int[arrayInt.length];

        for (int i = 0; i < arrayInt.length; i++) {
            int contVecesEncontrado = 0;
            for (int j = 0; j < arrayInt.length; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    contVecesEncontrado++;
                }
            }
            arrayAux[i] = contVecesEncontrado;
        }


        int indiceDelMasRepe = 0; // índice del número más repetido
        int maxRepeticiones = 0; // veces que se repite

        for (int i = 0; i < 10; i++) {
            if (maxRepeticiones < arrayAux[i]) {
                maxRepeticiones = arrayAux[i];
                indiceDelMasRepe = i;
            }
        }

        System.out.println("Se repite: " + maxRepeticiones + " veces.");
        System.out.println("El numero más repetido es: " + arrayInt[indiceDelMasRepe]);

    }

}
