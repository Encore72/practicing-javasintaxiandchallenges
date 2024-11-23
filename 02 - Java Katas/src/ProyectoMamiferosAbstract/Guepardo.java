package ProyectoMamiferosAbstract;

public class Guepardo extends Felino {

    public Guepardo() {
    }

    public Guepardo(String habitat, float altura, float largo, float peso,
                    String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "como como un guepardo";
    }

    @Override
    public String dormir() {
        return "duermo como un guepardo";
    }

    @Override
    public String correr() {
        return "corro como un guepardo";
    }

    @Override
    public String comunicarse() {
        return "me comunico como un guepardo";
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
