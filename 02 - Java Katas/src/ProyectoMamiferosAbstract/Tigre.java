package ProyectoMamiferosAbstract;

public class Tigre extends Felino {

    private String especieTigre;

    public Tigre() {
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "como como un tigre";
    }

    @Override
    public String dormir() {
        return "duermo como un tigre";
    }

    @Override
    public String correr() {
        return "corro como un tigre";
    }

    @Override
    public String comunicarse() {
        return "me comunico como un tigre";
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "especieTigre='" + especieTigre + '\'' +
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

