public class ArrayImprimirNumMasAlto {
    public static void main(String[] args) {

        int[] arrayInt = {14, 33, 15, 36, 78, 21, 43};

        int numeroMax = 0;
        
            for (int i = 0; i < arrayInt.length; i++) {
               numeroMax = (numeroMax > arrayInt[i]) ? numeroMax : arrayInt[i];
               
            }

        System.out.println("arrayInt[numeroMax] = " + numeroMax);
            
    }
}
