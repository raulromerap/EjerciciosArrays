package ejerciciosarraysin;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Se crea la función random para generar numeros aleatorios
		Random ale = new Random();

		// Se crea una variable para crear una tabla/array de 10 numeros reales
		int tabla[] = new int[10];

		// Se crea una variable para guardar los numeros aleatorios
		int nums;

		// Un bucle para generar numeros aleatorios e imprimirlos por consola y para
		// cuando llega al la longitud de la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Se guardan los numeros aleatorios del 1 a 100 en la variable asociada
			// anteriormente
			nums = ale.nextInt(1, 101);

			// Se guarda en cada celda de la tabla, que tiene el valor de i, los numeros
			// aleatorios guardados
			tabla[i] = nums;

			//Se imprime por pantalla los numeros de la celda
			System.out.println(tabla[i]);

		}

	}

}
