package ProyectoCatalogo;

public class TvLcd extends Electronico {

    private int pulgadas;

    public TvLcd() {
    }

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return (double)this.getPrecioProducto() * 1.15;
    }
}
