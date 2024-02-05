package ejercicio01;

import java.util.Scanner;

/**
 * Esta clase muestra al usuario la suma de los numeros que ha introducido en la
 * tabla
 * 
 * @author Raúl Romera
 */
public class Main01 {

	/**
	 * Esta funcion se encarga de crear una tabla, rellenarla con numeros que
	 * inserte el usuario e imprime por pantalla finalmente la suma de estos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion que hemos creado y se crea un objeto de este
		Funciones01 fun = new Funciones01();

		// Se llama a la funcion Scanner y se crea un objeto de este
		Scanner sc = new Scanner(System.in);

		// Se crea un tabla de longitud 5 que almacenará los numeros del usuario
		int tabla[] = new int[5];

		// Se crea una variable donde se almacenará los cambios que se realiza en la
		int resultado;

		// Se crea un bucle que pide al usuario que inserte un valor y luego guarda ese
		// numero en la celda en la que se encuentra
		for (int i = 0; i < tabla.length; i++) {

			System.out.print("Introduce un número: ");
			tabla[i] = sc.nextInt();

		}

		// Se guarda los cambios de la funcion en la variable asociada
		resultado = fun.sumaTabla(tabla);

		// Se imprime por pantalla un mensaje con el resultado de la suma
		System.out.println("El resultado es: " + resultado);

		// Se cierra el escaner
		sc.close();
	}

}
