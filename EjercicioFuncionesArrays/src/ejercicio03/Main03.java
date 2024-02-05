package ejercicio03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase pide al usuario una longitud para la tabla y el numero limite de
 * relleno, y luego muestra por pantalla la tabla rellena con numeros aleatorios
 * pares
 * 
 * @author Raúl Romera
 */
public class Main03 {

	/**
	 * Esta funcion se encarga de recoger los valores del usuario que luego manda a
	 * la funcion que creamos y se muestra la tabla con los numeros pares aleatorios
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion que hemos creado y se crea un objeto de este
		Funciones03 fun = new Funciones03();

		// Se llama a la funcion Scanner y se crea un objeto de este
		Scanner sc = new Scanner(System.in);

		// Se crea una variable que guarda la longitud que quiera el usuario
		int longitud;

		// Se crea una variable que guarda el limite de numero que quiera el usuario
		int fin;

		// Se crea una tabla que guarda la tabla que se crea en la otra clase
		int resultado[];

		// Se imprime por pantalla un mensaje para que el usuario inserte la longitud de
		// la tabla
		System.out.print("Introduce la longitud de la tabla: ");
		// Se escanea y guarda el numero del usuario
		longitud = sc.nextInt();

		// Se imprime por pantalla un mensaje para que el usuario inserte el limite de
		// numeros
		System.out.print("Introduce el limite del numero par más alto: ");
		// Se escanea y guarda el numero del usuario
		fin = sc.nextInt();

		// Se iguala la tabla resultado a lo que devuelve la funcion para guardar los
		// valores la tabla creada en esta
		resultado = fun.rellenaPares(longitud, fin);

		// Se ordena la tabla de mayor a menor
		Arrays.sort(resultado);

		// Se imprime ppr pantalla la tabla
		System.out.println(Arrays.toString(resultado));

		// Se cierra el escaner
		sc.close();

	}

}
