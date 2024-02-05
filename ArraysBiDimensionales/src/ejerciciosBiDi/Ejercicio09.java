package ejerciciosBiDi;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Se crea un tabla predeterminada de 3x3
		int tabla[][] = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

		// Si el booleano es true se manda mensaje de que la tabla es magica, si es
		// false se manda mensaje de que no es magica
		if (esMagica(tabla)) {
			System.out.println("La matriz es magica");
		} else {
			System.out.println("La matriz no es magica");
		}

	}

	public static boolean esMagica(int tabla[][]) {
		// Se crea un booleano con valor inicial true
		boolean magico = true;

		// Se crea una variable para la suma de la columna
		int sumaCol = 0;
		// Se crea una variable para la suma de la fila
		int sumaFila = 0;
		// Se crea una variable para tener fijo una suma de una fila
		int fijo = 0;

		// Se crea un bucle para hacer la suma de la primera fila
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
			}
			fijo = sumaFila;
		}

		// Se crea un bucle para hacer la comparación entre la suma de las columnas y
		// las filas con la suma fija
		for (int i = 0; i < tabla.length; i++) {
			sumaCol = 0;
			sumaFila = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
				sumaCol += tabla[j][i];
			}
			if (fijo != sumaCol) {
				magico = false;
			}
			if (fijo != sumaFila) {
				magico = false;
			}
		}

		// Devuelve el booleano
		return magico;
	}

}
