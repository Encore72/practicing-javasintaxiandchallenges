package ProyectoHerenciaPersonasEmpresa;

public class Cliente extends Persona {

    private int clienteId;

    public Cliente() {
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCliente{" +
                "clienteId=" + clienteId +
                '}';
    }
}
