package ejerciciosarraysin;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Se llama a la clase escaner
		Scanner sc = new Scanner(System.in);

		// Se crea una variable para la tabla con longitud 10
		int tabla[] = new int[10];

		// Se crea una variable para los numeros del usuario
		int numU;

		// Se crea una variable para el resultado de la suma
		int res = 0;

		// Se crea una variable para guardar el numero maximo
		int max = Integer.MIN_VALUE;

		// Se crea una variable para guardar el numero mínimo
		int min = Integer.MAX_VALUE;

		// Se crea un bucle para que el usuario introduzca los numeros y se guarden en
		// la tabla
		for (int i = 0; i < tabla.length; i++) {

			// Se imprime por pantalla el mensaje para que inserte el numero
			System.out.print("Introduzca un número: ");

			// Se escanea el numero del usuario
			numU = sc.nextInt();

			// Se guarda en cada celda el numero del usuarioç
			tabla[i] = numU;
		}

		// Se crea un bucle for-each para que haga la suma de los numeros
		for (int numero : tabla) {
			res = res + numero;

			// Si el numero es mayor que el numero maximo registra este mismo como el nuevo
			// maximo
			if (numero > max)
				max = numero;

			// Si el numero es menor que el numero minimo registra este mismo como el nuevo
			// minimo
			if (numero < min)
				min = numero;
		}

		// Se imprime por pantalla el resultado de la suma
		System.out.println(res);
		// Se imprime por pantalla el máximo de la tabla
		System.out.println("El numero máximo es: " + max);
		// Se imprime por pantalla el mínimo de la tabla
		System.out.println("El numero mínimo es: " + min);

		// Se cierra el escaner
		sc.close();
	}

}
