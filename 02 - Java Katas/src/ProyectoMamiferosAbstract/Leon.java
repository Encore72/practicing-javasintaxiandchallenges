package ProyectoMamiferosAbstract;

public class Leon extends Felino {

    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon() {
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico,
                float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "como como un león";
    }

    @Override
    public String dormir() {
        return "duermo como un león";
    }

    @Override
    public String correr() {
        return "corro como un león";
    }

    @Override
    public String comunicarse() {
        return "me comunico como un león";
    }

    @Override
    public String toString() {
        return "Leon{" +
                "numManada=" + numManada +
                ", potenciaRugidoDecibel=" + potenciaRugidoDecibel +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
