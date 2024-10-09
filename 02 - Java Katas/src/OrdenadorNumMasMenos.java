import java.util.Scanner;

public class OrdenadorNumMasMenos {

    public static void main(String[] args) {
        
    miScanner();

    } 
    
    public static void miScanner() {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese número A");
        int numA = miScanner.nextInt();
        System.out.println("Ingrese número B");
        int numB = miScanner.nextInt();

        int numMax = (numA > numB) ? numA : numB;
        int numMin = (numA < numB) ? numA : numB;

        System.out.println(numMax + ", " + numMin);

    }
}
