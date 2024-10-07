import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        
        miScanner();

    } 
    
    public static void miScanner() {
        Scanner facturador = new Scanner(System.in);
        System.out.println("Ingrese número de factura");
        String nombreFactura = facturador.nextLine();
        System.out.println("Ingrese importe bruto item1");
        double importeBruto1 = facturador.nextDouble();
        System.out.println("Ingrese importe bruto item2");
        double importeBruto2 = facturador.nextDouble();
        double impuesto = 19;
        double totalBruto = importeBruto1 + importeBruto2;
        double totalNeto = ((impuesto / 100) * totalBruto) + totalBruto;
        System.out.println("La factura " + nombreFactura + "tiene un total bruto de " + totalBruto + " euros, con un impuesto de " + impuesto + "% y el monto después de impuestoS es " + totalNeto + "euros.");
        facturador.close();

        
    }
  
}
