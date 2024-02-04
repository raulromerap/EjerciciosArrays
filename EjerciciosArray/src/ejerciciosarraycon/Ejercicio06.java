package ejerciciosarraycon;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Se llama a la funcion Scanner para crear un objeto de este
		Scanner sc = new Scanner(System.in);

		// Se crea un tabla de tamaño 1000 para luego guardar los numeros aleatorios a
		// él
		int tabla[] = new int[1000];

		// Se crea una variable que funcionará como contador de apariciones
		int cont = 0;

		// Se crea una variable booleana para saber si el numero existe en la tabla,
		// desde el principio será false
		boolean si = false;

		// Se crea una varaible para guardar el numero del usuario
		int numU;

		// Se crea un bucle para generar los numeros aleatorios del 1 al 1000 y luego
		// los inserta en la tabla
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}

		// Se imprime por pantalla el mensaje para que el usuario inserte el numero que
		// quiere saber si es existente
		System.out.print("Inserte numero: ");
		// Se escanea y se guarda el valor en la variable asociada
		numU = sc.nextInt();

		// Se crea un bucle que recorre la tabla para igualar el numero del usuario a
		// todas la celdas de la tabla y saber si es existenrte o no, si es existente se
		// suma el contador
		for (int numero : tabla) {
			if (numero == numU) {
				cont++;
				si = true;
			}
		}

		// Se añade una condicion que verifica si el numero existe, si la booleana es
		// true se manda el mensaje de que existe y ademas se le muestra las veces que
		// está
		if (si)
			System.out.println("El numero exite " + cont + " veces");
		// Si no se da el caso se manda un mensaje de que no existe el numero en la
		// tabla
		else
			System.out.println("El numero no existe");

		// Se cierra el escaner
		sc.close();
	}

}
