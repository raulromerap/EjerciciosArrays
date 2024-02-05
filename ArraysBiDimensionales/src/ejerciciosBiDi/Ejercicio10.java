package ejerciciosBiDi;

import java.util.Random;

public class Ejercicio10 {

	/**
	 * Atributo que guarda la longitud
	 */
	private static final int N = 4;

	public static void main(String[] args) {

		// Se llama a la funcion Random y se crea un objeto de este
		Random aleatorio = new Random();

		// Se crea una tabla que guarda la tabla girada
		int resultado[][];
		// Se crea una tabla con la longitud de las constantes
		int tablaInicio[][] = new int[N][N];

		// Se crea un bucle para rellenar las celdas con numeros aleatorios entre 1 y 100
		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				tablaInicio[i][j] = aleatorio.nextInt(1, 101);
			}
		}
		
		// Se iguala en el resultado la tabla girada
		resultado = gira90(tablaInicio);
		
		// Se crea un bucle para imprimir la tabla
		for(int fila[] : tablaInicio) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
		
		// Se imprime por pantalla un salto de linea
		System.out.println();
		
		// Se crea un bucle para imprimir la tabla girada
		for(int fila[] : resultado) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

	}

	public static int[][] gira90(int tablaInicio[][]) {
		// Se crea un tabla para hacer la tabla girada
		int tablaGiro[][] = new int[N][N];
		
		// Se crea una variable para dar valor a la fila girada
		int a = N - 1;
		
		// Se crea un bucle para crear la tabla girada
		for (int i = 0; i < tablaInicio.length; i++) {
			for (int j = 0; j < tablaInicio[i].length; j++) {
				
				tablaGiro[i][j] = tablaInicio[a][i];
				a--;
			}
			a = N - 1;
		}

		// Devuelve la tabla girada
		return tablaGiro;
	}

}
