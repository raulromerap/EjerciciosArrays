package ejerciciosarraysin;

import java.util.Scanner;

/**
 * Esta clase muestra al usuario cuales son los pares e impares de los numeros
 * que ha insertado en una tabla
 * 
 * @author Raúl Romera
 */
public class Ejercicio06 {

	/**
	 * Esta función se encarga de escanear los numeros del usuario, de rellenar el
	 * array con dichos numeros y de imprimir por pantalla los mensajes de cuales
	 * son par y cuales impares
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la función Scanner y se crea un objeto de esta
		Scanner sc = new Scanner(System.in);

		// Se crea una tabla de longitud 8 donde insertaremos los numeros del usuario
		int tabla[] = new int[8];

		// Se crea un variable para guardar los numeros del usuario
		int numU;

		// Se crea un bucle que imprime por pantalla un mensaje para que el usuario
		// inserte los 8 numeros a la vez que se van añadiendo al array
		for (int i = 0; i < tabla.length; i++) {

			// Se imprime por pantalla un mensaje para que introduzca un número
			System.out.print("Introduzca un número: ");
			// Se escanea y se guarda el número del usuario en la variable asociada
			numU = sc.nextInt();

			// Se guarda en la celda correspondiente al indice de la tabla el numero del
			// usuario
			tabla[i] = numU;
		}

		// Se crea un bucle que recorrerá la tabla entera y dirá cuales son los números
		// impares y pares
		for (int par : tabla) {
			// Se indica una condición para que en el caso de que el numero de la celda
			// dividido entre dos, de resto cero se manda un mensaje de que ese numero es
			// par
			if (par % 2 == 0)
				System.out.println(par + " es par");
			// Si no se cumple esta condición se manda el mensaje de que es impar
			else
				System.out.println(par + " es impar");

		}
		// Se cierra el escaner
		sc.close();
	}

}
