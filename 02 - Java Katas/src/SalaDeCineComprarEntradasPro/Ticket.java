package SalaDeCineComprarEntradasPro;

public class Ticket {

// 1. atributos

private int fila;
private int butaca;


// 2. constructor

public Ticket(int fila, int butaca){
    this.fila = fila;
    this.butaca = butaca;
}


// 3. metodos

public int getFila() {
    return fila;
}


public void setFila(int fila) {
    this.fila = fila;
}


public int getButaca() {
    return butaca;
}


public void setButaca(int butaca) {
    this.butaca = butaca;
}


}
