package ProyectoCatalogo;

abstract public class Producto implements IProducto {

    private int precio;

    public Producto() {
    }

    public Producto(int precio) {
        this.precio = precio;
    }

    public int getPrecioProducto() {
        return precio;
    }
}
