package ejerciciosarraycon;

import java.util.Arrays;

import java.util.Random;

/**
 * Esta clase muestra cuantos aciertos ha tenido el usuario con su combinacion a
 * una combinacion insertada por la consola
 * 
 * @author Raúl Romera
 */
public class Ejercicio07 {

	/**
	 * Esta función se encarga de generar dos tablas (la ganadora y la del usuario),
	 * rellena la del usuario y las compara para despues mostrar el numero de
	 * aciertos que este ha tenido
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Random para hacer un objeto de este
		Random rand = new Random();

		// Se crea una variable que indica el indice de la tabla del numero ganador
		int i = 0;

		// Se crea una variable que indica el indice de la tabla de la apuesta del
		// usuario
		int j = 0;

		// Se crea una tabla que tiene insertado los numeros del cupon ganador
		int ganadora[] = { 2, 12, 26, 29, 34, 48 };

		// Se crea una tabla de longitud 6 para rellenarla con numeros aleatorios
		int apuesta[] = new int[6];

		// Se crea una variable que guarda los numeros aleatorios
		int aleatorio;

		// Se crea una variable que funciona de contador
		int cont = 0;

		// Se crea un bucle para rellenar la tabla de la apuesta y conprueba si los
		// numeros son iguales a los de la combinacion ganadora
		while (i < apuesta.length) {

			aleatorio = rand.nextInt(1, 50);

			while (j < apuesta.length && aleatorio != apuesta[i]) {
				j++;
			}

			if (j > apuesta.length - 1)
				apuesta[i] = aleatorio;

			j = 0;
			i++;
		}

		for (int valor : apuesta) {
			if (Arrays.binarySearch(ganadora, valor) >= 0) {
				cont++;
			}
		}

		// Se imprime por pantalla la tabla de la combinacion del usuario
		System.out.println(Arrays.toString(apuesta));
		// Se imprime por pantalla la tabla de la combinacion ganadora
		System.out.println(Arrays.toString(ganadora));

		// Se imprime por pantalla el numero de aciertos
		System.out.println("Tienes " + cont + " aciertos");

	}

}
