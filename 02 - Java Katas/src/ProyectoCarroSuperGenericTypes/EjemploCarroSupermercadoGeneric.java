package ProyectoCarroSuperGenericTypes;

public class EjemploCarroSupermercadoGeneric {

    public static <T extends ProductoSupermercado> void imprimirBolsaSupermercado(BolsaSupermercado<T> bolsaSupermercado) {

        System.out.println("=====================================================");

        for (T producto : bolsaSupermercado) {

            System.out.println("Tipo de bolsa: " + producto.getClass().getSimpleName());
            System.out.println("Nombre del Producto: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());

            if (producto instanceof Fruta) {
                System.out.println("Peso: " + ((Fruta) producto).getPeso());
                System.out.println("Color: " + ((Fruta) producto).getColor());
            }

            if (producto instanceof Lacteo) {
                System.out.println("Cantidad: " + ((Lacteo) producto).getCantidad());
                System.out.println("Proteinas: " + ((Lacteo) producto).getProteinas());
            }

            if (producto instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) producto).getComponentes());
                System.out.println("Litros: " + ((Limpieza) producto).getLitros());
            }

            if (producto instanceof NoPerecible) {
                System.out.println("Contenido: " + ((NoPerecible) producto).getContenido());
                System.out.println("Calorias: " + ((NoPerecible) producto).getCalorias());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>(4);
        bolsaFrutas.addProductos(new Fruta("Manzana", 3.4, 0.78, "Roja"));
        bolsaFrutas.addProductos(new Fruta("Pera", 2.5, 0.4, "Verde"));
        bolsaFrutas.addProductos(new Fruta("Pina", 4.99, 1.4, "Amarilla"));
        bolsaFrutas.addProductos(new Fruta("Melocoton", 3.49, 0.872, "Naranja"));
        bolsaFrutas.addProductos(new Fruta("Fresa", 7.99, 3.72, "Rojo"));

        imprimirBolsaSupermercado(bolsaFrutas);

        BolsaSupermercado<Limpieza> bolsaLimpiezas = new BolsaSupermercado<>(4);
        bolsaLimpiezas.addProductos(new Limpieza("antibacterial", 0.75, "Cif", 1690));
        bolsaLimpiezas.addProductos(new Limpieza("lavaloza", 1.2, "Quix", 2290));
        bolsaLimpiezas.addProductos(new Limpieza("cloro", 0.95, "Limpiador Crema", 1390));
        bolsaLimpiezas.addProductos(new Limpieza("Gel con Lavandinca", 0.45, "Lysoform", 1380));
        bolsaLimpiezas.addProductos(new Limpieza("Desinfectante Lavanda", 0.9, "Lysol", 1330));

        imprimirBolsaSupermercado(bolsaLimpiezas);


        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>(4);
        bolsaLacteos.addProductos(new Lacteo("Leche1", 3.4, 573, 22400));
        bolsaLacteos.addProductos(new Lacteo("Queso1", 32.45, 415, 2020));
        bolsaLacteos.addProductos(new Lacteo("Leche2", 53.4, 542, 2500));
        bolsaLacteos.addProductos(new Lacteo("Queso2", 5.4, 52, 6200));
        bolsaLacteos.addProductos(new Lacteo("Tranchete", 13.45, 145, 2100));

        imprimirBolsaSupermercado(bolsaLacteos);


        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>(5);
        bolsaNoPerecibles.addProductos(new NoPerecible(23510, 9515, "1", 151));
        bolsaNoPerecibles.addProductos(new NoPerecible(43525, 4560, "2", 12));
        bolsaNoPerecibles.addProductos(new NoPerecible(280, 2514, "3", 3630));
        bolsaNoPerecibles.addProductos(new NoPerecible(530, 6340, "4", 12));
        bolsaNoPerecibles.addProductos(new NoPerecible(300, 36, "5", 25));

        imprimirBolsaSupermercado(bolsaNoPerecibles);

    }
    
    

}
