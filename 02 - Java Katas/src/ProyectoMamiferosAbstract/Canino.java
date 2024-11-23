package ProyectoMamiferosAbstract;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamanoColmillos;

    public Canino() {
    }

    public Canino(String habitat, float altura, float largo, float peso,
                  String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

    @Override
    public String toString() {
        return "Canino{" +
                "color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
