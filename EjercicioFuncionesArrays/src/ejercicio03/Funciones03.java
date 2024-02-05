package ejercicio03;

import java.util.Random;

/**
 * Esta clase se encarga de crear una tabla con numeros pares aleatorios
 * 
 * @author Raúl Romera
 */
public class Funciones03 {

	/**
	 * Esta funcion recoge la longitud de la tabla y el limite de numero de main y
	 * crea la tabla con numeros pares hasta el limite y devolver esa tabla
	 * 
	 * @param longitud "La longitud para la tablaque el usuario a insertado en main"
	 * @param fin      "El limite superior de los numeros que ha insertado el
	 *                 usuario en main"
	 * @return Devuelve una tabla con numeros pares aleatorios
	 */
	public int[] rellenaPares(int longitud, int fin) {

		// Se llama a la funcion Random y se crea un objeto de este
		Random rand = new Random();

		// Se crea una tabla que tendra la longitud del parametro y guarda los numeros
		// aleatorios
		int tablaPares[] = new int[longitud];

		// Se crea una variable que guarda temporalmente los numeros aleatorios
		int numA;

		// Se crea una variable que sirve como indice en la tabla
		int i = 0;

		// Se crea un bucle que recorre la tabla, genera numeros aleatorios desde el 0
		// hasta el limite del usuario y solo guarda los pares
		while (i < tablaPares.length) {
			numA = rand.nextInt(0, fin + 1);
			// Si el numero aleatorio tiene resto 0 cuando se divide entre 2 se guarda el numero y se suma el indice
			if (numA % 2 == 0) {
				tablaPares[i] = numA;
				i++;
			}
		}
		// Devuelve la tabla creada
		return tablaPares;
	}

}
