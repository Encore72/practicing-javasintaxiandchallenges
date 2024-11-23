package ProyectoCarroSuperGenericTypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaSupermercado<T> implements Iterable<T> {

    private List<T> productos;
    private int maxProductos;

    public BolsaSupermercado(int maxProductos) {
        this.maxProductos = maxProductos;
        this.productos = new ArrayList<>();
    }

    public List<T> getProductos() {
        return productos;
    }

    public int getMaxProductos() {
        return maxProductos;
    }

    public void addProductos(T producto) {
        if (this.productos.size() <= maxProductos) {
            this.productos.add(producto);
        } else {
            throw new RuntimeException("La bolsa está llena");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.productos.iterator();
    }
}
