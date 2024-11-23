package ProyectoCatalogo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        Date fecha = new Date(123, 11, 23);
        Date fecha2 = new Date(121, 5, 26);


        Producto[] productos = new Producto[6];

        productos[0] = new IPhone(1200, "Apple", "iPhone 16", "Blanco");
        productos[1] = new IPhone(1500, "Apple", "iPhone 16 XL", "Rojo");
        productos[2] = new TvLcd(740, "Samsung", 48);
        productos[3] = new TvLcd(980, "Sony", 72);
        productos[4] = new Libro(39, fecha, "JK Rowling", "Prisionero de Azkaban", "Planeta");
        productos[5] = new Comic(8, fecha2, "Matt", "Ironman 4", "MarvelPublishing", "Ironman");

            for (Producto prod : productos) {
                System.out.println(" ========== " + prod.getClass().getSimpleName() + " ========== ");
                System.out.println("Precio: " + prod.getPrecioProducto());
                System.out.println("Precio de venta: " + prod.getPrecioVenta());

                if (prod instanceof Electronico) {
                    System.out.println("Fabricante: " + ((Electronico) prod).getFabricante());

                    if (prod instanceof IPhone) {
                        System.out.println("Modelo: " + ((IPhone) prod).getModelo());
                        System.out.println("Color: " + ((IPhone) prod).getColor());

                    }

                    if (prod instanceof TvLcd) {
                        System.out.println("Pulgadas: " + ((TvLcd) prod).getPulgadas());
                    }
                }

                if (prod instanceof Libro) {
                    System.out.println("Titulo: " + ((Libro) prod).getTitulo());
                    System.out.println("Autor: " + ((Libro) prod).getAutor());
                    System.out.println("Editorial: " + ((Libro) prod).getEditorial());
                    System.out.println("Fecha: " + ((Libro) prod).getFechaPublicacion());

                    if (prod instanceof Comic) {
                        System.out.println("Personaje: " + ((Comic) prod).getPersonaje());
                    }

                }

                System.out.println();


            }
    }

}
