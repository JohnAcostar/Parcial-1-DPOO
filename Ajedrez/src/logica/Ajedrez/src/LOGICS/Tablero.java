package LOGICS;

public class Tablero {

    public static final int TAMANIO = 8;

    public boolean posicionValida(int fila, int columna) {
        return fila >= 1 && fila <= TAMANIO &&
               columna >= 1 && columna <= TAMANIO;
    }
}

