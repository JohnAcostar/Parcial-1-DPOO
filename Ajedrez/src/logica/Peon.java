package logica;

public class Peon extends Figura {

    public Peon(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularMovimientos(Tablero tablero) {

        int movimientos = 0;

        // Un paso hacia adelante
        if (tablero.posicionValida(fila + 1, columna)) {
            movimientos++;
        }

        // Dos pasos si está en fila inicial (fila 2)
        if (fila == 2 && tablero.posicionValida(fila + 2, columna)) {
            movimientos++;
        }

        return movimientos;
    }
}
