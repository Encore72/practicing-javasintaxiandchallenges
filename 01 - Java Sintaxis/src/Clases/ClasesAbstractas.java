package Clases;

public class ClasesAbstractas {

    // clases abstractas (no se pueden instanciar, solo instancian las clases hijas)

    /*
     * Una abstracta se usa para definir una estructura común (como en las clases
     * normales) pero que por sí sola esa estructura común no es suficiente para 
     * ser independiente, pero sí para ser la base común de otros objetos. 
     * Por ejemplo, el chasis de un coche, faltaría implementarle las ruedas, las 
     * puertas… O el forjado de una casa.
     */

    /*
     * La jerarquía es la siguiente:
     * 1. CLASE ABSTRACTA (ej: ANIMAL)
     * 2. CLASE PADRE (ej: MAMIFERO)
     * 3. CLASE HIJA (ej: PERRO o GATO, heredan de MAMIFERO)
     */


// 1. CLASE ABSTRACTA
public abstract class Animal {
    
    // atributo
    private String nombre;

    // constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // metodos
    public String getNombre() {
        return nombre;
    }

    public abstract void hacerRuido(); // <---- Método abstracto
}


// 2. CLASE PADRE 
public class Mamifero extends Animal {
    
    // constructor
    public Mamifero(String nombre) {
        super(nombre);
    }
    
    // metodos
    @Override
    public void hacerRuido() { 
        System.out.println("El mamífero hace un sonido genérico."); // <---- Método abstracto
    }
}

// 3. CLASES HIJAS
public class Perro extends Mamifero {
    
    // constructor
    public Perro(String nombre) {
        super(nombre);
    }
    
    // metodos
    @Override
    public void hacerRuido() {
        System.out.println("¡Guau!"); // <---- Método abstracto
    }
}

public class Gato extends Mamifero {
    
    // constructor
    public Gato(String nombre) {
        super(nombre);
    }
    
    // metodos
    @Override
    public void hacerRuido() {
        System.out.println("¡Miau!"); // <---- Método abstracto
    }
}



}
