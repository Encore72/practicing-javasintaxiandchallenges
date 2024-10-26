package ProyectoOrdenCompra;

import java.util.Date;

public class EjemploOrdenesMain {

    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compra número 1");
        orden1.setCliente(new Cliente("Jaime", "Perez"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Western Digital", "Unidad SSD 480GB", 120.12));
        orden1.addProducto(new Producto("MSI", "Monitor Optix G271", 340.99));
        orden1.addProducto(new Producto("AMD", "Procesador AMD Ryzen 9 5900X", 349.55));
        orden1.addProducto(new Producto("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1299.99));

        OrdenCompra orden2 = new OrdenCompra("Compra número 2");
        orden2.setCliente(new Cliente("Julio", "Rodriguez"));
        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("Fensa", "Cocina", 399.81));
        orden2.addProducto(new Producto("Samsung", "Refrigerador", 999.72));
        orden2.addProducto(new Producto("Midea", "Lavadora", 690.25));
        orden2.addProducto(new Producto("Aspiradora", "IRobot", 190.13));

        OrdenCompra orden3 = new OrdenCompra("Compra número 3");
        orden3.setCliente(new Cliente("Francisco", "Fernandez"));
        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("Melon", "Cemento 25kg", 870.55));
        orden3.addProducto(new Producto("Grau", "Hormigon", 6040.44));
        orden3.addProducto(new Producto("Ceramicas Santiago", "Ladrillo", 90.44));
        orden3.addProducto(new Producto("Redline", "Escala articulada aluminio", 90.66));


        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {

            System.out.println("Id: " + orden.getId());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripción: " + orden.getDescription());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Precio Total: €" + orden.getPrecioTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio €" + p.getPrecio());
                i++;
            }
            System.out.println("-------------------------------------------------------");

        }

    }

}


