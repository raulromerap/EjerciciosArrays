package ejerciciosarraycon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase muestra al usuario la tabla que ha insertado ordenada al reves
 * 
 * @author Raúl Romera
 */
public class Ejercicio05_1 {

	/**
	 * Esta función se encarga de crear un tabla con valores que inserte el usuario,
	 * la ordena para luego mostrarsela del revés
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la función Scanner para crear un objeto de esta
		Scanner sc = new Scanner(System.in);

		// Se crea una tabla de longitud 8 que guardará los numeros que inserte el
		// usuario
		int tabla[] = new int[8];

		// Se crea un bucle que muestra al usuario un mensaje para que inserte los
		// numeros que desee
		for (int i = 0; i < tabla.length; i++) {

			// Se imprime por pantalla el mensaje
			System.out.print("Introduzca la puntuación del jugador: ");

			// Se guarda en la celda que se encuentre el numero introducido por el usuario
			tabla[i] = sc.nextInt();
		}
		// Se imprime por pantalla un salto de linea
		System.out.println();

		// Se ordena la tabla del usuario
		Arrays.sort(tabla);

		// Se llama a la funcion para realizar los cambios en la tabla
		alReves(tabla);

		// Se imprime por pantalla la tabla ya del revés
		System.out.println(Arrays.toString(tabla));

		// Se cierra el escaner
		sc.close();

	}

	/**
	 * Esta función se encarga de poner los numeros del usuario de la tabla
	 * ordenados del revés, es decir, de mayor a menor
	 * 
	 * @param tabla La tabla creada en la funcion main
	 */
	public static void alReves(int[] tabla) {

		// Se crea una variable que tendrá como valor la longitud de la tabla
		int n = tabla.length;

		// Se crea una variable auxiliar para no hacer cambios en la tabla
		int aux;

		// Se crea un bucle que recorre la mitad de la tabla y guarda la primera mitad
		// en el auxiliar para luego insertarlos del indice mas mayor hasta la mitad de
		// la tabla, mientras que en la primera mitad se inserta los valores de la
		// segunda mitad
		for (int i = 0; i < n / 2; i++) {

			// Se iguala el auxiliar a la celda en la que nos encontramos
			aux = tabla[i];

			// Se iguala la celda de la tabla a la ultima celda(con el calculo de, en el
			// primer caso, 8 + 0 - 1, es decir, la ultima casilla)
			tabla[i] = tabla[n - i - 1];

			// En este caso se hace lo contrario se iguala, esta vez utilizando el auxiliar
			tabla[n - i - 1] = aux;
		}
	}
}
