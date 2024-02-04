package ejerciciosarraysin;

import java.util.Scanner;

/**
 * Esta clase pide al usuario que introduzca un numero del 1 al 10 y le dirá
 * cuantas veces se encuentra ese numero en la tabla
 * 
 * @author Raúl Romera
 */
public class Ejercicio08 {

	/**
	 * Esta función crea una tabla de 100 celdas y las rellena con numeros
	 * aleatorios del 1 al 10, luego le pide al usuario que inserte un numero y le
	 * muestra cuantas veces se encuentra ese numero en la tabla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la función Scanner para crear un objeto de esta
		Scanner sc = new Scanner(System.in);

		// Se crea una tabla de longitud 100 para guardar los numeros aleatorios
		int tabla[] = new int[100];

		// Se crea una variable para guardar el numero del usuario
		int num;

		// Se crea una variable para contar las veces que el numero del usuario se ha
		// encontrado en la tabla
		int posiciones = 0;

		// Se crea un bucle para añadir los numeros aleatorios del 1 al 10 en la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Se iguala el valor de la celda a un numero aleatorio entre 1 y 11 (11
			// excluido)
			tabla[i] = (int) (1 + Math.random() * 10);

		}

		// Se imprime por pantalla un mensaje para que el usuario inserte el numero que
		// quiere buscar en la tabla
		System.out.print("Introduzca un número del 1 al 10: ");
		// Se escanea y se guarda el numero en la variable asociada anteriormente
		num = sc.nextInt();

		// Se crea un bucle que recorre la tabla y comprueba si el numero del usuario
		// está y se cuenta cuantas veces está
		for (int pos : tabla) {

			// Se añade un condicion que incrementa en uno el contador si el numero del
			// usuario es igual al numero de la celda en la que se encuentra
			if (num == pos)
				// Se incrementa el contador
				posiciones++;

		}
		// Se imprime por pantalla cuantas veces está el numero en la tabla
		System.out.println("Ese numero esta en la tabla " + posiciones + " veces");

		// Se cierra el escaner
		sc.close();
	}

}
