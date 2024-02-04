package ejerciciosarraysin;

import java.util.Scanner;

/**
 * Esta clase muestra al usuario una tabla de 5 celdas con los números que el
 * usuario ha introducido
 * 
 * @author Raúl Romera
 */
public class Ejercicio02 {

	/**
	 * Esta función main se encarga de escanear los numeros que el usuario
	 * introduzca para luego imprimirlo por pantalla con el uso de un for-each
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea la funcion escaner
		Scanner sc = new Scanner(System.in);

		// Se crea una variable para la tabla/array de decimales de longitud 5
		double tabla[] = new double[5];

		// Se crea una variable para los numeros que inserte el usuario
		double numU;

		// Se crea un bucle para pedirle al usuario que introduzca los numeros y
		// gusrdarlos en la respectiva celda de la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Se imprime un mensaje para que el usuario introduzca el numero
			System.out.print("Introduzca un número: ");
			// Se escanea y se guarda el numero del usuario
			numU = sc.nextDouble();

			// Se guarda en la celda de la tabla el numero del usuario
			tabla[i] = numU;
		}

		// Se crea un bucle for-each para ir imprimiendo todos los numeros de esa tabla
		for (double numero : tabla) {
			// Se imprime los numeros de las celdas
			System.out.println(numero);
		}
		// Se cierra el escaner
		sc.close();
	}

}
