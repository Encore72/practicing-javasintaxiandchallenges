package ProyectoThreads;

public class EjemploThreads {

    public static void main(String[] args) {

        AlfaNumericTask taskNumbers = new AlfaNumericTask(Type.NUMBER);
        AlfaNumericTask taskLetters = new AlfaNumericTask(Type.LETTER);

        Thread threadNumbers = new Thread(taskNumbers);
        Thread threadLetters = new Thread(taskLetters);

        threadNumbers.start();
        threadLetters.start();


    }

}
