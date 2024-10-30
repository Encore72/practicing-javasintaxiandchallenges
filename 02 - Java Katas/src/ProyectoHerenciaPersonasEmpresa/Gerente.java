package ProyectoHerenciaPersonasEmpresa;

public class Gerente extends Empleado {

    private double presupuesto;

    public Gerente(String nombre, String apellido, int nif, String direccion, double salario, int empleadoId, double presupuesto) {
        super(nombre, apellido, nif, direccion, salario, empleadoId);
        this.presupuesto = presupuesto;

    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGerente{" +
                "presupuesto=" + presupuesto +
                '}';
    }

}
