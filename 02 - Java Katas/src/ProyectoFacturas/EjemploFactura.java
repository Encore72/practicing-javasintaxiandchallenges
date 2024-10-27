package ProyectoFacturas;

import ProyectoFacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

    Cliente cliente = new Cliente();
    cliente.setNombre("Juan");
    cliente.setNif("5458291213-A");

    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese descripción de Factura");
        String desc = sc.nextLine();

    Factura factura = new Factura(desc, cliente);

    Producto producto;
    String nombre;
    float precio;
    int cantidad;

    System.out.println();

        for(int i = 0; i<5; i++){
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            nombre = sc.next();
            producto.setNombre(nombre);

            /*    version optimizada:
             *         System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
             *         producto.setNombre(sc.next());
             */


            System.out.print("Ingrese el precio: ");
            precio = sc.nextFloat();
            producto.setPrecio(precio);

            /*    version optimizada:
             *         System.out.print("Ingrese el precio: ");
             *         producto.setPrecio(sc.nextFloat());
             */

            System.out.print("Ingrese cantidad: ");
            cantidad = sc.nextInt();

            ArticuloFactura articulo = new ArticuloFactura(cantidad, producto);
            factura.addItemFactura(articulo);

            /*  version optimizada:
             *      System.out.print("Ingrese cantidad: ");
             *      factura.addItemFactura(new ItemFactura(s.nextInt(), producto));
             */

            System.out.println();

        }

    System.out.println(factura.generarDetalle());

    }

}

