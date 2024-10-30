package ProyectoHerenciaPersonasEmpresa;

public class EjemploMain {

    public static void main(String[] args) {

    Gerente gerente = new Gerente("Juan", "Palomo", 5004000, "Av. Palomisima nº43, 3º4ª", 3150,94, 10000);
        gerente.aumentarSalario(18);
        gerente.setPresupuesto(15000);

        System.out.println(gerente);



    }

}
