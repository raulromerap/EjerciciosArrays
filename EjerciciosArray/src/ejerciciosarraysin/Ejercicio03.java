package ejerciciosarraysin;

import java.util.Scanner;

/**
 * Esta clase muestra al usuario un tabla con números que él a introducido pero
 * del revés
 * 
 * @author Raúl Romera
 */
public class Ejercicio03 {

	/**
	 * Esta funcion se encarga de escanear los 10 numeros que inserta el usuario y
	 * los añade al array de derecha a izquierda (del revés) y luego se lo muestra
	 * por pantalla recorriendo el array de izquierda a derecha
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea la función escaner
		Scanner sc = new Scanner(System.in);

		// Se crea una varaible para una tabla/array con la longitud 10
		int tabla[] = new int[10];

		// Se crea una varaible para guardar los numeros insertados por el usuario
		int numU;

		// Se genera un bucle que para cuando llega a cero
		// Se le pregunta por cada vuelta del bucle al usuario que introduzca un numero,
		// se escanea y se guarda el numero en
		for (int i = (tabla.length - 1); i >= 0; i--) {

			// Se imprime por pantalla un mensaje para que el usuario introduzca los numeros
			System.out.print("Introduzca un número: ");
			// Se escanea y se guarda los numeros del usuario
			numU = sc.nextInt();

			// Se guarda en cada celda el numero del usuario
			tabla[i] = numU;
		}

		// Se crea un bucle for-each para recorrer la tabla e imprimer los numeros
		for (int numero : tabla) {
			// Se imprime los numeros de cada celda
			System.out.println(numero);
		}
		// Se cierra el escaner
		sc.close();
	}
}
