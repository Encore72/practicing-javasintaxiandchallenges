package ProyectoFacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

   private int id;
   private String descripcion;
   private Date fecha;
   private Cliente cliente;
   private ArticuloFactura[] arrayDeArticulos;
   private int indiceArticulosFactura;

   public static final int MAX_ITEMSENFACTURA = 10;
   private static int ultimoId;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.arrayDeArticulos = new ArticuloFactura[MAX_ITEMSENFACTURA];
        this.id = ++ultimoId;
        this.fecha = new Date();

    }

    public Factura() {

    }

    public int getId() {
        return id;
   }

   public String getDescripcion() {
        return descripcion;
   }

   public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
   }

   public Date getFecha() {
        return fecha;
   }

   public void setFecha(Date fecha) {
        this.fecha = fecha;
   }

   public Cliente getCliente() {
        return cliente;
   }

   public void setCliente(Cliente cliente) {
        this.cliente = cliente;
   }

    public ArticuloFactura[] getItems() {
        return arrayDeArticulos;
    }

    public void addItemFactura(ArticuloFactura articulo) {
        if (indiceArticulosFactura < arrayDeArticulos.length) {
            this.arrayDeArticulos[indiceArticulosFactura++] = articulo;
        }
    }

    public float calcularTotalFactura() {
        float total = 0.0f;
        for (ArticuloFactura articulo : arrayDeArticulos) {
            if (articulo == null) { // esto es para evitar que en caso de que en el array de artículos
                continue; // haya 8 items en lugar de 10 (capacidad max del array), sume los dos nulos y de error
            }
            total += articulo.calcularImporte();
            total = (float) Math.round(total * 100) / 100;
        } return total;
    }

    public String generarDetalle(){

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(id)
                .append("\n Cliente: ")
                .append(cliente.getNombre())
                .append("\n NIF: ")
                .append(cliente.getNif())
                .append("\n Fecha: ")
                .append(df.format(fecha))
                .append("\n Descripcion: ")
                .append(descripcion)
                .append("\n")
                .append("\n #\t Nombre\t €\t Cant.\t Precio\n");

        for(ArticuloFactura articulo : arrayDeArticulos){
            if (articulo == null) {
                continue;
            }

            sb.append(articulo.getProducto().getCodigo())
                    .append("\t")
                    .append(articulo.getProducto().getNombre())
                    .append("\t")
                    .append(articulo.getProducto().getPrecio())
                    .append("\t")
                    .append(articulo.getCantidad())
                    .append("\t")
                    .append(articulo.calcularImporte())
                    .append("\n");
        }

        sb.append("\n Precio Total: ")
            .append(calcularTotalFactura());


        return sb.toString();
    }


}
