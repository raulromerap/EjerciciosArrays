package ejercicio05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {

		// Se llama a la funcion donde hacemos la busqueda y se crea un objeto de este
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

		// Se crea un bucle que rellena las celdas de la tabla con numeros aleatorios
		for (int i = 0; i < t.length; i++) {
			t[i] = rand.nextInt(1, 16);
		}

		// Imprime por pantalla un mensaje para que el usuario introduzca el numero que
		// quiere buscar
		System.out.print("Introduce el numero que quiere buscar en la tabla: ");
		// Se escanea y se guarda el numero del usuario
		valor = sc.nextInt();

		// Se guarda en la variable asociada el valor devuelto en la funcion main
		resultado = fun.buscarTodos(t, valor);

		// Se imprime por pantalla la tabla que se ha creado
		System.out.println(Arrays.toString(t));

		// Si el numero no se encuentra en la tabla se manda mensaje de que no se
		// encuentra, si se encuentra se manda otra tabla con el resultado
		if (fun.elementosNuevaTabla == 0)
			System.out.println("El número no se encuentra en la tabla");
		else
			System.out.println(Arrays.toString(resultado));

		// Se cierra el escaner
		sc.close();
	}

}
