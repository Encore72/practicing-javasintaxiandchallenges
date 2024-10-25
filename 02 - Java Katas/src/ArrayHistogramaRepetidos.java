public class ArrayHistogramaRepetidos {
    public static void main(String[] args) {

        int[] arrayInt = {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        String[] arrayHistograma = new String[6];

        for (int i = 0; i < arrayHistograma.length; i++) {
            int aux = i + 1;
            String histograma = aux + ": ";
            for (int j = 0; j < arrayInt.length; j++) {
                if (aux == arrayInt[j]) {
                    histograma += "*";
                }
            }
            arrayHistograma[i] = histograma;
        }

        for (int i = 0; i < arrayHistograma.length; i++) {
            System.out.println(arrayHistograma[i]);
        }

    }

}
