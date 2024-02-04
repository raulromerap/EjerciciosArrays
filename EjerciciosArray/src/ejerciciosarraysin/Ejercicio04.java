package ejerciciosarraysin;

/**
 * Esta clase muestra al usuario una tabla con numeros predeterminados
 * 
 * @author Raúl Romera
 */
public class Ejercicio04 {

	/**
	 * Esta función se encarga de hacer un tabla con numeros predeterminados y los
	 * muestra por pantalla, añadiendose ceros en las celdas que no tienen numeros
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea una variable para una tabla de 12 de longitud con numeros
		// predeterminados
		int tabla[] = new int[12];

		// Se le asigna al indice 0 el valor 39
		tabla[0] = 39;
		// Se le asigna al indice 1 el valor -2
		tabla[1] = -2;
		// Se le asigna al indice 4 el valor 0
		tabla[4] = 0;
		// Se le asigna al indice 6 el valor 14
		tabla[6] = 14;
		// Se le asigna al indice 5 el valor 5
		tabla[8] = 5;
		// Se le asigna al indice 9 el valor 120
		tabla[9] = 120;

		// Se crea un bucle for-each para imprimir las celdas del la tabla
		for (int numero : tabla) {
			// Se imprime el valor de cada celda
			System.out.println(numero);
		}
	}

}
