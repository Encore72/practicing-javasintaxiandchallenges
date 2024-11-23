package ProyectoMamiferosAbstract;

abstract public class Felino extends Mamifero {

    protected float tamanoGarras;
    protected int velocidad;

    public Felino() {
    }

    public Felino(String habitat, float altura, float largo, float peso,
                  String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Felino{" +
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
