package ProyectoOrdenCompra;

import java.util.Date;

public class OrdenCompra {

    // atributos
    private int id;
    private String description;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    private static int ultimoId;
    private int indiceProductos;


    // constructor de solo descripción
    public OrdenCompra(String description) {
        this.description = description;
        this.id = ++ultimoId;
        this.productos = new Producto[4];
    }

    // getters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }


    // setters
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    // metodos

        // metodo añadir productos
    public void addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
    }

        // metodo obtener precio total
    public double getPrecioTotal() {
        double precioTotal = 0.0;
        for (Producto p : productos) {
            precioTotal += p.getPrecio();
            precioTotal = Math.round(precioTotal * 100.0) / 100.0;
        }
        return precioTotal;
    }


}


