package ProyectoMamiferosAbstract;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro() {
    }

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "como como un perro";
    }

    @Override
    public String dormir() {
        return "duermo como un perro";
    }

    @Override
    public String correr() {
        return "corro como un perro";
    }

    @Override
    public String comunicarse() {
        return "me comunico como un perro";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "fuerzaMordida=" + fuerzaMordida +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
