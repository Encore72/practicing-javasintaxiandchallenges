package ProyCalcularImpProdListYSum;

public class Producto {

    double precio;
    int cantidad;

    public Producto() {
    }

    public Producto(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularImporte() {
        return precio * cantidad;
    }


}
