import logica.*;

public class Main {

    public Main() {

        Tablero tablero = new Tablero();

        Figura peon = new Peon(2, 4);
        Figura torre = new Torre(4, 4);
        Figura caballo = new Caballo(4, 4);

        System.out.println("Movimientos Peón: " + peon.calcularMovimientos(tablero));
        System.out.println("Movimientos Torre: " + torre.calcularMovimientos(tablero));
        System.out.println("Movimientos Caballo: " + caballo.calcularMovimientos(tablero));
    }

    public static void main(String[] args) {
        new Main();
    }
}
