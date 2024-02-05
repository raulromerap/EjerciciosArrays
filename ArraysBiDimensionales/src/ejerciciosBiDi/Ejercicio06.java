package ejerciciosBiDi;

import java.util.Arrays;
import java.util.Random;

/**
 * Esta clase muestra una tabla con numeros aleatorios y muestra otra tabla con
 * el numero menor y mayor
 * 
 * @author Raúl Romera
 */
public class Ejercicio06 {

	public static void main(String[] args) {

		// Se crea una tabla bidimensional de 6 filas y 10 columnas que guarda los
		// numeros aleatorios
		int tabla[][] = new int[6][10];

		// Se llama la funcion Random y se crea un objeto de este
		Random aleatorio = new Random();

		// Se crea un bucle que rellena las celdas del 1 a 1000 aleatoriamente
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = aleatorio.nextInt(0, 1001);
			}
		}

		// Se crea un bucle que imprime la tabla en la consola
		for (int fila[] : tabla) {
			for (int valor : fila)
				System.out.print(valor + "\t");
			System.out.println();
		}

		// Se imprime la tabla unidimensional que tiene los numeros mayor y menor
		System.out.println(Arrays.toString(rellenaArray(tabla)));

	}

	public static int[] rellenaArray(int tabla[][]) {

		int mayor = Integer.MIN_VALUE;

		int menor = Integer.MAX_VALUE;

		int resultado[] = new int[2];

		for (int fila[] : tabla)
			for (int valor : fila) {
				if (mayor < valor)
					mayor = valor;
				else if (menor > valor)
					menor = valor;
			}

		resultado[0] = menor;
		resultado[1] = mayor;

		return resultado;
	}

}
