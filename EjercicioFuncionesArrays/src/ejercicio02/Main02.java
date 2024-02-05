package ejercicio02;

import java.util.Arrays;
import java.util.Random;

/**
 * Esta clase muestra al usuario una tabla y cual es el numero mayor que se ha
 * insertado en esta
 * 
 * @author Raúl Romera
 */
public class Main02 {

	/**
	 * Esta funcion se encarga de crear un tabla, insertarle numeros aleatorios del
	 * 1 al 99 y luego le muestra la tabla y su numero maximo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion que hemos creado y se crea un objeto de este
		Funciones02 fun = new Funciones02();

		// Se llama a la funcion Random y se crea un objeto de este
		Random rand = new Random();

		// Se crea un tabla de longitud 10 que almacena los numeros aleatorios
		int t[] = new int[10];

		// Se crea una variable que almacena los cambios realizados en la funcion
		int resultado;

		// Se crea un bucle que inserta en cada celda en la que se encuentre el indice
		// un numero aleatorio del 1 al 99
		for (int i = 0; i < t.length; i++) {
			t[i] = rand.nextInt(1, 100);
		}

		// Se guarda los cambios en la variable asociada
		resultado = fun.maximo(t);

		// Se imprime por pantalla la tabla que se ha creado
		System.out.println(Arrays.toString(t));
		// Se imprime por pantalla un mensaje con el numero maximo
		System.out.println("El numero máximo es: " + resultado);

	}

}
