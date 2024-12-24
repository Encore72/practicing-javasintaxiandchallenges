package ProyectoThreads;

public class AlfaNumericTask implements Runnable {

    private final Type type;


    public AlfaNumericTask(Type type) {
        this.type = type;
    }

    @Override
    public void run() {
        if (type == Type.NUMBER) {
            showNumbers();
        } else if (type == Type.LETTER) {
            showLetters();
        }
    }

    private void showNumbers() {
        for (int i = 1; i < 10; i++) {
            System.out.println("Number = " + i);
        }
    }

    private void showLetters() {
        for  (char c = 'A'; c <= 'Z'; c++) {
            System.out.println("Letter = " + c);
        }
    }

}
