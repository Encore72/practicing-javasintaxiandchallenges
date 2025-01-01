package ProyCalcularImpProdListYSum;

import java.util.List;
import java.util.stream.Stream;

public class ProyCalcularImpProdListYSum {

    public static void main(String[] args) {

        Producto p1 = new Producto(3.50, 50);
        Producto p2 = new Producto(1.50, 11);
        Producto p3 = new Producto(4.50, 20);
        Producto p4 = new Producto(5.50, 30);
        Producto p5 = new Producto(2.33, 40);

        List<Producto> listaProductos = List.of(p1, p2, p3, p4, p5);

        double total = listaProductos
                .stream()
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                .sum();

        System.out.println("Total: " + total);

        // version simplificada (Crear la lista de productos y calcular el total en una sola línea)

        double total2 = Stream.of(
                        new Producto(3.50, 50),
                        new Producto(1.50, 11),
                        new Producto(4.50, 20),
                        new Producto(5.50, 30),
                        new Producto(2.33, 40)
                )
                .mapToDouble(productoZ -> productoZ.getPrecio() * productoZ.getCantidad())
                .sum();

        System.out.println("Total: " + total);

    }
}
