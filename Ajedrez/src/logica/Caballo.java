package logica;

public class Caballo extends Figura {

    public Caballo(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularMovimientos(Tablero tablero) {

        int movimientos = 0;

        int[][] desplazamientos = {
            {2, 1}, {2, -1},
            {-2, 1}, {-2, -1},
            {1, 2}, {1, -2},
            {-1, 2}, {-1, -2}
        };

        for (int i = 0; i < desplazamientos.length; i++) {

            int nuevaFila = fila + desplazamientos[i][0];
            int nuevaColumna = columna + desplazamientos[i][1];

            if (tablero.posicionValida(nuevaFila, nuevaColumna)) {
                movimientos++;
            }
        }

        return movimientos;
    }
}
