package ejerciciosBiDi;

/**
 * Esta clase muestra una tabla con numeros ordenados y luego muestra otra tabla
 * con las columnas y las filas cambiadas
 * 
 * @author Raúl Romera
 */
public class Ejercicio07 {

	public static void main(String[] args) {

		// Se crea una tabla de 4x4 para guardar los numeros
		int tabla[][] = new int[4][4];

		// Se crea un contador
		int cont = 1;

		// Se crea una tabla para el resultado
		int resultado[][];

		// Se crea un bucle que rellena la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = cont;
				cont++;
			}
		}

		// Se crea un bucle que imprime la tabla correcta
		for (int fila[] : tabla) {
			for (int valor : fila)
				System.out.print(valor + "\t");
			System.out.println();
		}

		// Se imprime un salto de linea
		System.out.println();

		// Se iguala el resultado para guardar la tabla invertida
		resultado = transposicion(tabla);

		// Se crea un bucle que imprime la tabla invertida
		for (int fila[] : resultado) {
			for (int valor : fila)
				System.out.print(valor + "\t");
			System.out.println();
		}
	}

	public static int[][] transposicion(int tabla[][]) {
		// Se crea un tabla que será la transpuesta
		int tablaT[][] = new int[4][4];

		// Se crea un bucle para rellenar la tabla con los valores cambiados
		for (int i = 0; i < tablaT.length; i++) {
			for (int j = 0; j < tablaT[i].length; j++) {
				tablaT[i][j] = tabla[j][i];
			}
		}

		// Devuelve la tabla invertida
		return tablaT;
	}

}
