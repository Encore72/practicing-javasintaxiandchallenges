package ProyectoHerenciaPersonasEmpresa;

public class Persona {

    private String nombre;
    private String apellido;
    private int nif;
    private String direccion;


    public Persona() {
    }

    public Persona(String nombre, String apellido, int nif, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nif = nif;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNif() {
        return nif;
    }

    public String getDireccion() {
        return direccion;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nif=" + nif +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
