package ejerciciosarraysin;

import java.util.Scanner;

/**
 * Esta clase muestra un gráfico de la temperatura de cada mes del año
 * 
 * @author Raúl Romera
 */
public class Ejercicio07 {

	/**
	 * Esta función se encarga de imprimir por pantalla un grafico de la temperatura
	 * de cada mes, la temperatura la inserta el usuario y se muestra el grafico
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea una tabla que contiene valores constantes del nombre de los meses del
		// año
		final String MESES[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		// Se crea un tabla con la longitud de la tabla de los meses la cual almacenará
		// la temperatura de cada mes
		int[] temperaturas = new int[MESES.length];

		// Se llama a la funcion Scanner para crear un objeto de este
		Scanner sc = new Scanner(System.in);

		// Se crea un bucle que mandará un mensaje de la temperatura de cada mes, donde
		// el usuario insertará el valor de esta y lo guardará en la celda que le
		// corresponde
		for (int i = 0; i < temperaturas.length; i++) {
			// Se imprime por pantalla el mensaje para que el usuario inserte el valor de la
			// temperatura de cada mes
			System.out.println("Introduzca la temperatura de " + MESES[i]);

			// Se escanea y guarda el valor insertado en la tabla según que lugar esté en el
			// indice
			temperaturas[i] = sc.nextInt();
		}

		// Se crea un bucle que imprime por pantalla los meses con su temperatura, la
		// cual se hará un gráfico con asteriscos
		for (int i = 0; i < MESES.length; i++) {

			// Se añade una condición para cuando la tabla de los meses llegue al indice 9
			// se imprime el nombre del mes y se imprime una tabulación
			if (MESES[i].length() >= 9) {
				// Se imprime por pantalla mes y tabulacion
				System.out.print(MESES[i] + "\t");
			}
			// Si no se cumple el caso se añade el mes y dos tabulaciones
			else {
				System.out.print(MESES[i] + "\t\t");
			}
			// Se crea un bucle para añadir asteriscos para simular un grafico de
			// temperatura, en este caso tendrá el valor del numero de la temperatura
			for (int j = 1; j <= temperaturas[i]; j++) {
				// Se imprime por pantalla un asterisco
				System.out.print("*");
			}
			// Se imprime un salto de linea
			System.out.println();
		}

		// Se cierra el escaner
		sc.close();

	}
}
