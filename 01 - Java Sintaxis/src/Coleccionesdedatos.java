import java.util.ArrayList;
import java.util.Vector;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Queue;

public class Coleccionesdedatos {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
    // 1. Array

        // 1.1 Declaración e inicialización separada. Estamos declarando el array y diciendole que va a tener 5 valores int como maximo
    int array[] = new int[5];  // Crea un array de 5 enteros de una forma
    int[] array2 = new int[5]; // Crea un array de 5 enteros de otra forma, esta forma es mejor

        // 1.2 Pero luego tenemos que inicializarlo, es decir, darle datos a los valores
    array[0] = 10;
    array[1] = 20;
    array[2] = 30;
    array[3] = 40;
    array[4] = 50;

        // 1.3 Declaración e inicialización al mismo tiempo. Estamos declarando el array y dandole los valores directamente.
    var array3 = new int[]{10, 20, 30, 40, 50, 60};
        for (int elemento : array3)
            System.out.println(elemento);
            
        // 1.4 Acceder a un elemento del array
    int primerelementoArray3 = array3[0];
        System.out.println(primerelementoArray3);

        // 1.5 Modificar un elemento del array
    array3[1] = 500;
        System.out.println(array3[1]);

        // 1.6 Obtener la longitud de un array
    var longitudarray = array3.length;
        System.out.println(longitudarray);


                // 1.7 Array bidimensional
            int[][] arraybidimensional = new int[3][3]; // Crea un array de 3 enteros en dimension1(filas) y de 3 enteros en dimension2(columnas)

            arraybidimensional[0][0] = 1;
            arraybidimensional[0][1] = 2;
            arraybidimensional[0][2] = 3;

            arraybidimensional[1][0] = 4;
            arraybidimensional[1][1] = 5;
            arraybidimensional[1][2] = 6;

            arraybidimensional[2][0] = 7;
            arraybidimensional[2][1] = 8;
            arraybidimensional[2][2] = 9;


            var arraybidimensional2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
                        /** esto es igual a lo anterior, que al mismo tiempo es esto
                         * 	          Columna 0	  Columna 1	  Columna 2
                            Fila 0	      1	          2	         3
                            Fila 1	      4	          5	         6
                            Fila 2	      7	          8	         9
                        * 
                        */ 
            
                System.out.println(arraybidimensional2[1][1]);


                        // tambien se puede declarar así
            var arraybidimensional3 = new int[][]{
                        {1, 2, 3}, 
                        {4, 5, 6}, 
                        {7, 8, 9}
            };

            
                // 1.8 Array tridimensional
            
            int[][][] arraytridimensional = new int[2][2][3]; 

            var arraytridimensional2 = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
                       /** esto es igual a [dimension][fila][columna]
                        * 
                            DIMENSION 1
                         * 	          Columna 0	  Columna 1	  Columna 2
                            Fila 0	      1	          2	         3
                            Fila 1	      4	          5	         6

                            DIMENSION 2
                            * 	      Columna 0	  Columna 1	  Columna 2
                            Fila 0	      7	          8	          9
                            Fila 1	     10	          11	      12
                        */ 
                System.out.println(arraytridimensional2[1][1][1]);


    // 2. Vector
    
    Vector<Integer> nombredemiVector = new Vector<Integer>();
    nombredemiVector.add(15);
    nombredemiVector.add(25);
    nombredemiVector.add(35);

            System.out.println("Datos del vector: " + nombredemiVector);
            System.out.println("Vector tamaño: " + nombredemiVector.size() + " y capacidad: " + nombredemiVector.capacity());
                /** 
                 * tamaño son los elementos que tiene, capacidad es lo que le entra.
                 * cuando llegamos a la capacidad máxima se crea en la memoria un nuevo array automaticamente (el vector crea array por debajo)
                 * esta copia es muy costosa a nivel de rendimiento, porque hay que copiar el viejo y pegarlo en el nuevo (duplicamos memoria mientras se copia)
                 */ 
           
                 Vector<Integer> nombredemiVector2 = new Vector<Integer>(3, 5);
                    /**
                     * aqui se crea el vector definiendo capacidad e incremento en caso de incremento
                     * por ejemplo si pasamos de 3 elementos, se copia y se crea un array de 3+5 (8), si pasamos de 8 8+5
                     */ 

            // recorriendo el vector con un for each, el for each lee y asigna
        for (int i : nombredemiVector) {
            System.out.println("Valor actual en el vector: " + i);
        }

            // para recorrer un vector en un for usamos .size y no .length porque es el tamaño no la capacidad lo que queremos
        for (int j = 0; j < nombredemiVector.size(); j++) {
            System.out.println("Posición: " + j + ", Valor: " + nombredemiVector.get(j));
        }                                         // aquí el .get(j) busca en nombredemiVector según la posición (j) que toque y devuelve el valor en cada paso del bucle

            // para afeitar la capacidad del vector al tamaño real 
        nombredemiVector.trimToSize();
            System.out.println("Vector tamaño: " + nombredemiVector.size() + " y capacidad: " + nombredemiVector.capacity());


    // 3. ArrayList

        // lo declaramos
    ArrayList<String> nombredemiArrayList = new ArrayList<String>();

        // le añadimos valores o elementos
        nombredemiArrayList.add("ElementoA");
        nombredemiArrayList.add("ElementoB");
        nombredemiArrayList.add("ElementoC");
        nombredemiArrayList.add("ElementoD");
        nombredemiArrayList.add("ElementoE");

                // ojo para obtener elementos en un array string hace falta get, no es como en numeros (int) que es con nombredelarray[posicion]
        System.out.println(" Elemento 3 :" + nombredemiArrayList.get(3));

        // le quitamos elementos
         nombredemiArrayList.remove("ElementoA");
        
        // le quitamos elementos en la posicion que escojamos
        nombredemiArrayList.remove(3);

        for (String elementos : nombredemiArrayList)
            System.out.println(elementos);

        for (int k = 0; k < nombredemiArrayList.size(); k++) {
            System.out.println("Posición = " + k + ", El valor es: " + nombredemiArrayList.get(k));
        }


    // 4. LinkedList
            // El Array es más rápido para buscar y almacenar, para acceder. el linkedlist es más rápido para modificar datos
            // se utiliza linkedlist cuando necesitas insertar y eliminar elementos frecuentemente en cualquier posición

    LinkedList<String> miLinkedList = new LinkedList<String>();


    // 5. HashSet
            // cuando necesitas una coleccion de elementos unicos (no admite duplicados) y no te importa el orden

    HashSet<Integer> hashSetnumerosunicos = new HashSet<>();
        hashSetnumerosunicos.add(1);
        hashSetnumerosunicos.add(2);
        hashSetnumerosunicos.add(1); // No se añade porque ya existe


    // 6. TreeSet 
         // Cuando necesitas una colección ordenada de elementos únicos porque sí importa el orden.

    TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Pera");

        // Los elementos se ordenan alfabéticamente de forma natural
        System.out.println(conjunto); // Imprime: [Banana, Manzana, Pera]

        // Eliminar un elemento
        conjunto.remove("Banana");
        System.out.println(conjunto); // Imprime: [Manzana, Pera]

        // Comprobar si un elemento existe
        if (conjunto.contains("Pera")) {
            System.out.println("La Pera está en el conjunto");
        }
    

    // 7. HashMap 
            // cuando necesitas un mapa para buscar valores por clave rápidamente

    HashMap<String, String> hashMapCapitales = new HashMap<>();
        hashMapCapitales.put("España", "Madrid");
        hashMapCapitales.put("Francia", "París");
            System.out.println(hashMapCapitales.get("España"));
            
            hashMapCapitales.replace("España", "Oviedo");
            hashMapCapitales.remove("España");

    
    // 8. TreeMap 
            // Cuando necesitas un mapa ordenado por claves.

    TreeMap<Integer, String> mapa = new TreeMap<>();
            
        mapa.put(3, "Tres");
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
            
            // Las claves se ordenan de forma ascendente
            System.out.println(mapa); // Imprime: {1=Uno, 2=Dos, 3=Tres}
            
            // Obtener el valor asociado a una clave
            String valor = mapa.get(2);
            System.out.println(valor); // Imprime: Dos
            
            // Obtener una submapa con claves mayores o iguales a 2
            System.out.println(mapa.tailMap(2)); // Imprime: {2=Dos, 3=Tres}    
              
 
    // 9. Pila (Last In, First Out - LIFO)

        // Creamos una pila utilizando LinkedList
    LinkedList<String> pila = new LinkedList<>();
    
        // Agregamos elementos a la pila a través del método (push)
        pila.push("Plato 1");
        pila.push("Plato 2");
        pila.push("Plato 3");
            System.out.println("La pila tiene: " + pila);
    
        // Quitamos el elemento superior de la pila a través del método (pop)
        String plato = pila.pop();
        System.out.println("Plato retirado: " + plato);
    
        System.out.println("La pila ahora tiene: " + pila);
        
        /** peek(): Devuelve el elemento superior de la pila sin eliminarlo.
            isEmpty(): Indica si la pila está vacía.
            earch(Object o): Busca un elemento en la pila y devuelve su posición desde la cima (1 si está en la cima, 2 si está debajo, etc.). 
        */
    


    // 10. Cola (First In, First Out - FIFO)

        // Declaramos una cola utilizando LinkedList
    Queue<String> cola = new LinkedList<>();
    
        // Agregamos elementos a la cola (encolar)
        cola.add("Tarea 1");
        cola.add("Tarea 2");
        cola.add("Tarea 3");
            System.out.println("La cola tiene: " + cola);
    
            // Quitamos el primer elemento de la cola (desencolar)
            String tareaCompletada = cola.poll();
                System.out.println("Tarea completada: " + tareaCompletada);
        
                System.out.println("La cola ahora tiene: " + cola);
          
    }
    

/**

Principales tipos de colecciones en Java:

Listas (List):
    ArrayList: Una lista implementada con un array dinámico, que permite el acceso aleatorio a los elementos y el crecimiento dinámico. Es la lista más comúnmente utilizada.
    LinkedList: Una lista doblemente enlazada, que permite la inserción y eliminación eficientes en cualquier posición de la lista. Es ideal para operaciones de inserción y eliminación frecuentes al principio o al final de la lista.
    Vector: Una versión sincronizada de ArrayList, pero en general se desaconseja su uso debido a su bajo rendimiento en entornos multihilo modernos.

Conjuntos (Set):
    HashSet: Ya lo hemos visto, almacena elementos únicos y no ordenados.
    TreeSet: Almacena elementos únicos y ordenados de acuerdo a un comparador natural o personalizado.
    LinkedHashSet: Mantiene el orden de inserción de los elementos, además de garantizar la unicidad.

Mapas (Map):
    HashMap: Ya lo hemos visto, almacena pares clave-valor, donde las claves deben ser únicas.
    TreeMap: Almacena pares clave-valor ordenados según la clave natural o un comparador personalizado.
    LinkedHashMap: Mantiene el orden de inserción de los pares clave-valor.

Colas (Queue):
    Queue: Una interfaz que representa una cola FIFO (First In, First Out).
    Deque: Una interfaz que representa una doble cola, permitiendo inserciones y eliminaciones por ambos extremos.
    PriorityQueue: Una cola que ordena los elementos según una prioridad.
    
¿Cuándo usar cada una?
    ArrayList: Cuando necesitas una lista de acceso aleatorio y el orden de los elementos no es crítico.
    LinkedList: Cuando necesitas insertar o eliminar elementos con frecuencia al principio o al final de la lista.
    HashSet: Cuando necesitas una colección de elementos únicos sin importar el orden.
    TreeSet: Cuando necesitas una colección ordenada de elementos únicos.
    LinkedHashSet: Cuando necesitas una colección ordenada por inserción de elementos únicos.
    HashMap: Cuando necesitas asociar valores a claves y realizar búsquedas rápidas.
    TreeMap: Cuando necesitas un mapa ordenado por claves.
    LinkedHashMap: Cuando necesitas un mapa que mantenga el orden de inserción.
    Queue: Cuando necesitas una estructura FIFO (First In First Out).
    Deque: Cuando necesitas una estructura que permita inserciones y eliminaciones por ambos extremos.
    PriorityQueue: Cuando necesitas una cola que ordene los elementos según una prioridad.
    
Factores a considerar al elegir:
    Orden de los elementos: ¿Necesitas que los elementos estén ordenados?
    Duplicados: ¿Permites elementos duplicados?
    Acceso: ¿Necesitas acceso aleatorio o solo a los extremos?
    Operaciones frecuentes: ¿Qué operaciones realizarás con más frecuencia (inserción, eliminación, búsqueda)?


Características principales:
    List: Ordenada, permite duplicados, acceso aleatorio por índice. Ideal para secuencias de elementos.
    Set: No ordenada, no permite duplicados. Útil para almacenar elementos únicos sin importar el orden.
    Map: Asocia claves únicas a valores. Ideal para buscar valores a partir de claves.
    Queue: Estructura FIFO (Primero en entrar, primero en salir). Útil para modelar colas de espera.

Resumen
    List: Una lista de elementos ordenados donde puedes tener repetidos.
    Set: Un conjunto de elementos únicos sin un orden específico.
    Map: Un diccionario donde cada clave tiene un valor asociado.
    Queue: Una cola donde los elementos se procesan en el orden en que se añaden.

Ejemplo:
    List: Una lista de compras (orden de los elementos importa).
    Set: Un conjunto de números ganadores de la lotería (sin repetidos, sin orden específico).
    Map: Un diccionario de palabras y sus traducciones (cada palabra es una clave única).
    Queue: Una cola de impresión de documentos (los documentos se imprimen en el orden en que se envían).


 */


}

