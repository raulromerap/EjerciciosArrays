package ejerciciosBiDi;

public class Ejercicio03 {

	// Atributo constante para el número de columnas
	private static final int COLUMNS = 5;

	// Atributo constante para el número de filas
	private static final int ROWS = 5;

	// Esta  funcion main crea una tabla e imprime por pantalla el
	// valor de la tabla recogido en otra funcion
	public static void main(String[] args) {

		// Se crea un array bidimensional el cual tiene la longitud de los atributos
		int tabla[][] = new int[ROWS][COLUMNS];

		// Se llama a la funcion tablaBiDi para que haga los cambios en la tabla
		tablaBidi(tabla);

		// Se crea un bucle que va fila por fila
		for (int fila[] : tabla) {

			// Se crea un bucle que va columna por columna, pero en este caso solo ira celda
			// por celda de la fila en la que se encuentra
			for (int valor : fila)
				// Se imprime por pantalla el valor de la celda
				System.out.print(valor + "\t");

			// Se imprime por pantalla un salto de linea
			System.out.println();
		}
	}

	// Esta funcion recoge la tabla y la rellena
	public static void tablaBidi(int tabla[][]) {

		// Se crea un bucle que recorre la tabla fila por fila
		for (int n = 0; n < tabla.length; n++)
			// Se crea un bucle que recorre la tabla columna por columna
			for (int m = 0; m < tabla[0].length; m++)
				// Se inserta el valor del calculo en las celdas en la que se encuentra
				tabla[n][m] = 10 * (n + m);

	}

}
