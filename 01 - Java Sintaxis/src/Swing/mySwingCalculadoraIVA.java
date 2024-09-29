package Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


/**
 * Swing es una biblioteca de Java que nos permite crear interfaces gráficas de usuario que son 
 * interactivas, es decir, reaccionan a las acciones del usuario. Los eventos son el mecanismo 
 * que permite a Swing detectar estas acciones y responder a ellas.
 * 
 * ¿Cómo funcionan los eventos en Swing?
 * Componentes Swing: Cada elemento de una interfaz Swing (botones, campos de texto, etc.) 
 * es un componente que puede generar eventos.
 * 
 * Eventos: Cuando un usuario interactúa con un componente (por ejemplo, hace clic en un botón), 
 * se genera un evento. Este evento es un objeto que contiene información sobre la acción realizada.
 * 
 * Listeners: Los listeners son objetos que escuchan estos eventos. Cuando se produce un evento, 
 * el componente notifica a todos los listeners registrados.
 * 
 * Manejo de eventos: Los listeners implementan métodos específicos para cada tipo de evento. Estos 
 * métodos contienen el código que se ejecutará cuando ocurra el evento.
 */
 


public class mySwingCalculadoraIVA extends JFrame implements ActionListener {
    
    // esto es el equivalente a los atributos de cualquier otra clase (recordemos, programacion orientada a objetos)
    private JTextField txtPrecioBase, txtIVA, txtPrecioTotal;  // JTextField es una clase de Swing que representa campos de texto y creamos las variables txtPrecioBase etc...
    private JButton btnCalcular; // JButton es una clase de Swing que representa los botones y creamos la variable btnCalcular

    // este es el equivalente al constructor en cualquier otra clase
    public mySwingCalculadoraIVA() {
        // crear la ventana base de la interfaz
        super("SwingCalculadoraIVA");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Crear los componentes (etiquetas, campos de texto, botones...)
        JLabel lblPrecioBase = new JLabel("Precio Base:");
        lblPrecioBase.setBounds(20, 20, 100, 20); // setBounds: Este método se utiliza para establecer la posición y tamaño de los componentes en la ventana.
        add(lblPrecioBase); // esto crea la etiqueta Precio Base:

        txtPrecioBase = new JTextField(10);
        txtPrecioBase.setBounds(120, 20, 100, 20);
        add(txtPrecioBase); // esto crea el campo de texto de la etiqueta Precio Base:

        JLabel lblIVA = new JLabel("IVA (%):");
        lblIVA.setBounds(20, 50, 100, 20);
        add(lblIVA); // esto crea la etiqueta IVA:

        txtIVA = new JTextField(10);
        txtIVA.setBounds(120, 50, 100, 20);
        add(txtIVA); // esto crea el campo de texto de la etiqueta IVA:

        JLabel lblPrecioTotal = new JLabel("Precio Total:");
        lblPrecioTotal.setBounds(20, 80, 100, 20);
        add(lblPrecioTotal); // esto crea la etiqueta Precio Total:

        txtPrecioTotal = new JTextField(10);
        txtPrecioTotal.setBounds(120, 80, 100, 20);
        txtPrecioTotal.setEditable(false); // setEditable: Este método se utiliza para habilitar o deshabilitar la edición de un campo de texto.
        add(txtPrecioTotal); // esto crea el campo de texto de la etiqueta Precio Total:

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(120, 110, 100, 20);
        btnCalcular.setForeground(Color.RED); // Cambia el color del texto a azul
        btnCalcular.setBackground(Color.YELLOW); // Cambia el color de fondo a amarillo
        btnCalcular.addActionListener(this); // Asignamos un listener al botón
        add(btnCalcular); // esto crea el boton Calcular
    }


    public void actionPerformed(ActionEvent e) { // esta funcion recibe como parametro una variable (e) del tipo ActionEvent (usamos e de evento segun buenas practicas)
        if (e.getSource() == btnCalcular) { // e.getSource verifica si el evento (e) que ha ocurrido proviene del boton calcular
            try { // esto ejecuta el calculo del precio total (precio base + IVA)
                double precioBase = Double.parseDouble(txtPrecioBase.getText());  // ver explicacion parseDouble abajo
                double iva = Double.parseDouble(txtIVA.getText());
                double precioTotal = precioBase + (precioBase * (iva / 100));
                txtPrecioTotal.setText(String.valueOf(precioTotal));
            } catch (NumberFormatException ex) {  // esto recoge una excepcion en caso de que el usuario no intrudozca un numero en el campo editable
                JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos.");
            }
        }
    }

    /**
     * usamos actionPerformed como nombre de la funcion por convencion y porque es un metodo definido en la interfaz ActionListener, 
     * si no llamas al método actionPerformed, no podrás registrar un objeto como escuchador de eventos de acción, es decir que el 
     * objeto no recibirá notificaciones cuando ocurran eventos en los componentes a los que está asociado como por ejemplo pulsar 
     * el boton calcular.
     * 
     * basicamente actionPerformed se ejecutará siempre que tenga lugar un evento de acción proveniente de cualquier componente que
     * tenga registrado un ActionListener a través de addActionListener, como por ejemplo arriba lo tiene btnCalcular
     */ 

            /**
             * utilizamos el metodo .parseDouble para convertir el valor que introduzca el usuario de string a un double, 
             * y tenemos que convertirlo porque toda entrada de un usuario a traves de una interfaz, como un cuadro de 
             * texto o un scanner, se trata inicialmente como texto (string) por un tema de flexibilidad.
             */


    public static void main(String[] args) { // por ultimo para ejecutar la interfaz que hemos creado (GUI) necesitamos activarla en el main
        SwingUtilities.invokeLater(() -> {   // invokeLater ver explicacion abajo
            new mySwingCalculadoraIVA().setVisible(true); // new mySwintCalculadoraIVA() crea una nueva instancia de la clase mySwingCalculadoraIVA, que representa la ventana principal de nuestra calculadora.
                                                            // .setVisible(true); es el metodo necesario para que la ventana sea visible para el usuario
        });
    }


    /**
     * invokeLater es un método que se usa debido a la programación multihilo. Para entender por qué, imaginemos una fábrica:
     * 
     * Hilos: Son como los trabajadores de la fábrica. Cada trabajador tiene una tarea específica que realizar.
     * Hilo principal (o hilo de eventos): Es el encargado de gestionar la interfaz de usuario, como el mostrador de atención al cliente. Recibe las "órdenes" 
     * de los usuarios (clics, pulsaciones de teclado) y las procesa.
     * 
     * Otras tareas: Son las tareas que se realizan en segundo plano, como calcular resultados, cargar archivos, etc. Estas tareas pueden ejecutarse en otros hilos.
     * 
     * ¿Qué pasa si queremos actualizar la interfaz desde otro hilo?
     * Problemas: Si un trabajador (otro hilo) intenta directamente modificar algo en el mostrador (la interfaz), puede causar un caos y que el sistema se cuelgue.
     * Solución: invokeLater: Es como una bandeja donde los trabajadores dejan sus pedidos para el mostrador. Cuando el trabajador principal tiene un momento, 
     * revisa la bandeja y realiza los pedidos uno por uno.
     * 
     * 
     * Entonces, ¿qué hace exactamente invokeLater?
     * 
     * Pone una tarea en la cola: Cuando llamas a invokeLater, estás diciendo: "Oye, hilo principal, tengo algo que quieres que hagas, pero no ahora mismo. Por 
     * favor, añádelo a tu lista de tareas".
     * Espera su turno: La tarea espera en la cola hasta que el hilo principal esté libre.
     * Se ejecuta en el hilo principal: Cuando el hilo principal tiene un momento, toma la tarea de la cola y la ejecuta.
     * 
     * ¿Por qué es importante?
     * Seguridad: Evita problemas de concurrencia, donde varios hilos intentan modificar la interfaz al mismo tiempo.
     * Consistencia: Garantiza que los cambios en la interfaz se realicen de manera ordenada y secuencial.
     * Eficiencia: Permite que la interfaz siga respondiendo mientras se ejecutan tareas en segundo plano.
     * 
     */


}