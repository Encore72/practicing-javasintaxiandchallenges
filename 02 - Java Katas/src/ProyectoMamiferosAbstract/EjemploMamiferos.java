package ProyectoMamiferosAbstract;

public class EjemploMamiferos {

    public static void main(String[] args) {

    Mamifero[] mamiferos = new Mamifero[5];

    Mamifero tigre = new Tigre("China", 84.3f, 160.89f, 140.5f, "tigretus", 21.4f, 90, "tigretusChino");
    Mamifero leon = new Leon("Africa", 60.5f, 180.4f, 284, "leonidus", 12.4f, 60, 8, 50);
    Mamifero guepardo = new Guepardo ("Estados Unidos", 55.0f, 121.4f, 38.4f, "gueopardus", 9.4f, 120);
    Mamifero lobo = new Lobo ("Espana", 57.2f, 93.4f, 57.5f, "lobus", "azabache", 6.4f, 12, "espanol");
    Mamifero perro = new Perro ("España", 175.4f, 60.4f, 72.4f, "perrus", "negro", 3.4f, 80);

    mamiferos[0] = tigre;
    mamiferos[1] = leon;
    mamiferos[2] = guepardo;
    mamiferos[3] = lobo;
    mamiferos[4] = perro;


        for (Mamifero animal : mamiferos) {
            System.out.println(animal.toString());
        }

        System.out.println(lobo.dormir());

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Colmillos:" + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }
    }
}


