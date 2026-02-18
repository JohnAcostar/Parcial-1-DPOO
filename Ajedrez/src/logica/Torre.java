package logica;

public class Torre extends Figura {

    public Torre(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularMovimientos(Tablero tablero) {

        int movimientos = 0;

        movimientos += (Tablero.TAMANIO - fila); // arriba
        movimientos += (fila - 1);               // abajo
        movimientos += (Tablero.TAMANIO - columna); // derecha
        movimientos += (columna - 1);               // izquierda

        return movimientos;
    }
}
