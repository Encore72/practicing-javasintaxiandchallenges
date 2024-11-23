package ProyectoMamiferosAbstract;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo() {
    }

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;

    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "como como un lobo";
    }

    @Override
    public String dormir() {
        return "duermo como un lobo";
    }

    @Override
    public String correr() {
        return "corro como un lobo";
    }

    @Override
    public String comunicarse() {
        return "me comunico como un lobo";
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "numCamada=" + numCamada +
                ", especieLobo='" + especieLobo + '\'' +
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
