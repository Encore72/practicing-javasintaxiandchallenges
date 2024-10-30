package ProyectoHerenciaPersonasEmpresa;

public class Empleado extends Persona {

    private double salario;
    private int empleadoId;

    public Empleado(String nombre, String apellido, int nif, String direccion, double salario, int empleadoId) {
        super(nombre, apellido, nif, direccion);
        this.salario = salario;
        this.empleadoId = empleadoId;
    }

    public double getSalario() {
        return salario;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarSalario(int porcentajeAumento) {
        this.salario += ((salario * porcentajeAumento) / 100);
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nEmpleado{" +
                "salario=" + salario +
                ", empleadoId=" + empleadoId +
                '}';
    }

}
