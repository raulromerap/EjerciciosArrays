package ejerciciosarraycon;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		// Se crea una variable tipo array para crear una tabla de tamaño de 30 celdas
		double tabla[] = new double[30];

		// Se crea una variable para guardar los numeros aleatorios
		double numA;

		// Se crea un bucle desde el indice 0 hasta el final de la tabla para generar un
		// numero aleatorio e igualarlo a la celda de la tabla
		for (int i = 0; i < tabla.length; i++) {
			numA = Math.random() * 10;

			tabla[i] = numA;

		}

		// Se utiliza Arrays.sort para ordenar la tabla de menor a mayor
		Arrays.sort(tabla);

		// Se imprime por pantalla el array ordenado
		System.out.println(Arrays.toString(tabla));
	}

}
