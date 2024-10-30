package ProyectoHerenciaFruteria;

public class EjemploMain {
    public static void main(String[] args) {


        Fruta miFruta1 = new Fruta("Pina", 4, 1, "Verde");

        Lacteo miLacteo1 = new Lacteo("Leche", 2.4, 1, 100);

        Limpieza miLimpieza1 = new Limpieza("Desinfectante", 3.5, "quimicos",4);

        NoPerecible miNoPerecible1 = new NoPerecible("Pilas", 5.4, 16, 0);

        Producto[] miProductos = new Producto[] {miFruta1, miLacteo1, miLimpieza1, miNoPerecible1};

        for (Producto producto : miProductos) {
            System.out.println(producto);
        }

        for (int i = 0; i < miProductos.length; i++)
            System.out.println(miProductos[i]);


        for (Producto prod : miProductos) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + " ---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }

        }

    }
}
