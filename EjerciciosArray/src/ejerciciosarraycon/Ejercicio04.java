package ejerciciosarraycon;

import java.util.Arrays;

/**
 * Esta clase muestra al usuario una tabla con 30 numeros aleatorios del 1 al
 * 100 ordenados de menor a mayor
 */
public class Ejercicio04 {

	/**
	 * Esta clase se encarga de crear una tabla de longitud 30 y rellena sus celdas
	 * con numeros aleatorios para finalmente ordenarlos y mostrarlos al usuario
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea una variable tipo array para crear una tabla de tamaño de 30 celdas
		int tabla[] = new int[30];

		// Se crea un bucle desde el indice 0 hasta el final de la tabla para generar un
		// numero aleatorio e igualarlo a la celda de la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 10);

		}

		// Se utiliza Arrays.sort para ordenar la tabla de menor a mayor
		Arrays.sort(tabla);

		// Se imprime por pantalla el array ordenado
		System.out.println(Arrays.toString(tabla));
	}

}
