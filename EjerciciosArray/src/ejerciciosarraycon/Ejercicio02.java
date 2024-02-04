package ejerciciosarraycon;

import java.util.Arrays;

/**
 * Esta clase muestra al usuario un tabla con numeros concatenados
 */
public class Ejercicio02 {

	/**
	 * Esta función crea una tabla de 55 numeros y los rellena con numeros repetidos
	 * las veces de ese numero y luego se imprime por pantalla en la consola
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea una variable que indica el inicio de la tabla y esta empezará por
		// cero
		int inicio = 0;

		// Se crea un tabla de longitud 55 que guardará concatenados
		int tabla[] = new int[55];

		/*
		 * Se crea un bucle que irá del numero 1 al diez para rellenar la tabla las
		 * veces del numeros, es decir, el numero 3 se repetirá 3 veces en la tabla, y
		 * para ello utilizamos la funcion Arrays y se rellena con Arrays.fill
		 */
		for (int i = 1; i <= 10; i++) {

			// Se rellena la tabla desde la variable inicio hasta la variable inicio más el
			// numero y se rellenará con el numero que corresponde
			Arrays.fill(tabla, inicio, inicio + i, i);
			// Cada vez que se rellene a inicio se le suma el numero en el que está
			inicio += i;

		}
		// Se imprime por pantalla la tabla con los numeros insertados
		System.out.println(Arrays.toString(tabla));
	}

}
