package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		// Se llama a la funcion que utilizamos para hacer la busqueda y se crea un
		// objeto de este
		Funciones04 fun = new Funciones04();

		// Se crea el objeto para generar numeros aleatorios llamando a la funcion
		// random
		Random rand = new Random();

		// Se crea el objeto escaner llamando a la funcion escaner
		Scanner sc = new Scanner(System.in);

		// Se crea una tabla de longitud 10
		int t[] = new int[10];

		// Se crea una variable para guardar el numero que el usuario quiere buscar
		int clave;

		// Se crea una variable para el resultado final
		int resultado;

		// Se crea una variable para guardar la posicion del numero
		int posicion;

		for (int i = 0; i < t.length; i++) {
			t[i] = rand.nextInt(1, 16);
		}

		// Se imprime por pantalla el mensaje para que el usuario inserte un valor
		System.out.print("Inserte un numero para buscar en la tabla");
		// Se escanea el numero que ha insertado el usuario
		clave = sc.nextInt();

		// Se iguala el resultado a lo que devuelve la funcion
		resultado = fun.buscar(t, clave);

		// Se guarda la posicion
		posicion = fun.indiceBusqueda;

		// Si el numero existe muestra mensaje de si está y la posicion
		if (resultado == 0)
			System.out.println("El numero " + clave + " está en la posicion " + posicion);
		else
			System.out.println("El numero " + clave + " no está en la tabla");

		// Se cierra el escaner
		sc.close();
	}

}
