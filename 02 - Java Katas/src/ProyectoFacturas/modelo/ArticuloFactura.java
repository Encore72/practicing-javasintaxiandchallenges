package ProyectoFacturas.modelo;

public class ArticuloFactura {

   private int cantidad;
   private Producto producto;

    public ArticuloFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public float calcularImporte() {
        return this.cantidad * this.producto.getPrecio();
    }


}
