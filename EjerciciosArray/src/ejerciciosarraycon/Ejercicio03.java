package ejerciciosarraycon;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Se llama a la función escaner
		Scanner sc = new Scanner(System.in);

		// Se crea una variable para la primer tabla
		int tabla1[] = new int[10];

		// Se crea una variable para la segunda tabla
		int tabla2[] = new int[10];

		// Se crea una variable para los numeros del usuario
		int num;

		for (int i = 0; i < tabla1.length; i++) {
			// Se imprime por pantalla el mensaje para que el usuario inserte los numeros de
			// la primera tabla
			System.out.println("Inserte los numeros para la primera tabla");
			// Se escanea los numeros del usuario
			num = sc.nextInt();

			// Se iguala cada celda de la tabla al numero correspondiente
			tabla1[i] = num;
		}
		for (int i = 0; i < tabla1.length; i++) {
			// Se imprime por pantalla el mensaje para que el usuario inserte los numeros de
			// la segunda tabla
			System.out.println("Inserte los numeros para la segunda tabla");
			// Se escanea los numeros del usuario
			num = sc.nextInt();

			// Se iguala cada celda de la tabla al numero correspondiente
			tabla2[i] = num;
		}

		// Se genera una condición para, en el caso de que Arrays.equals mande true se
		// manda el mensaje de que las tablas son iguales, pero si manda false se manda
		// un mensaje de que las tablas no son iguales
		if (Arrays.equals(tabla1, tabla2))
			System.out.println("Las tablas son iguales");
		else
			System.out.println("Las tablas no son iguales");

		// Se cierra el escaner
		sc.close();
	}

}
