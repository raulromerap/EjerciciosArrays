package ejerciciosarraycon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase es el ejercicio 1 del tema Array, que utiliza las funciones
 * \"Arrays.\"
 */
public class Ejercicio01 {

	/**
	 * Esta funcion se encarga de crear un array con las celdas que quiera el
	 * usuario y rellenarlo con la funcion \"Arrays.fill\" con el numero que
	 * introduzca el usuario
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		// Variable para el primer numero del usuario
		int numCeldas;

		// Variable para el segundo numero del usuario
		int numRellenar;

		// Se crea una variable para el array
		int tabla[];

		// Se imprime por pantalla un mensaje para que el usuario inserte un valor para
		// la longitud del array
		System.out.print("Introduce la cantidad de celdas que quieres que tenga el array: ");
		// Se escanea el numero que ha insertado el usuario
		numCeldas = lectura.nextInt();

		// Se imprime por pantalla un mensaje para que el usuario inserte el numero que
		// quiere que se rellene el array
		System.out.print("Introduzca un número: ");
		// Se escanea el numero que ha insertado el usuario
		numRellenar = lectura.nextInt();

		// Se le da la longitud del usuario a la tabla
		tabla = new int[numCeldas];

		// Se rellenan con la clase arrays la tabla con el numero que el usuario ha
		// insertado
		Arrays.fill(tabla, numRellenar);

		// Se imprime por pantalla el array
		System.out.println(Arrays.toString(tabla));

		// Se cierra el escaner
		lectura.close();
	}

}
