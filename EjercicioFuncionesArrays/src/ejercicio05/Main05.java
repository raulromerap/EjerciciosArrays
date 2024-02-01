package ejercicio05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {

		Funciones05 fun = new Funciones05();

		// Se crea el objeto para generar numeros aleatorios llamando a la funcion
		// random
		Random rand = new Random();

		// Se crea el objeto escaner llamando a la funcion escaner
		Scanner sc = new Scanner(System.in);

		// Se crea una tabla de longitud 10
		int t[] = new int[10];

		// Se crea una variable para guardar el numero que el usuario quiere buscar
		int valor;

		// Se crea una variable para el resultado final
		int[] resultado;

		int numA;

		for (int i = 0; i < t.length; i++) {
			numA = rand.nextInt(1, 16);

			t[i] = numA;
		}

		System.out.print("Introduce el numero que quiere buscar en la tabla: ");
		valor = sc.nextInt();

		resultado = fun.buscarTodos(t, valor);

		System.out.println(Arrays.toString(t));

		if (fun.elementosNuevaTabla == 0)
			System.out.println("El número no se encuentra en la tabla");
		else
			System.out.println(Arrays.toString(resultado));

		sc.close();
	}

}
