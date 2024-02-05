package ejerciciosBiDi;

import java.util.Scanner;

/**
 * Esta clase muestra una tabla creada con las notas de los alumnos y la nota
 * maxima, media y minima de cada uno de ellos
 * 
 * @author Raúl Romera
 */
public class Ejercicio02 {

	/**
	 * Esta función se encarga de crear una tabla de alumnos y notas y pregunta al
	 * usuario cuanta nota ha sacado el alumno para luego imprimir por pantalla la
	 * tabla
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea un objeto Scanner a partir de llamar a la funcion Scanner
		Scanner sc = new Scanner(System.in);

		// Se crea una variable para la tabla bidimensional y se les da el valor de la
		// cantidad de alumnos y la cantidad de asignaturas
		int tabla[][] = new int[4][5];

		// Se crea una variable para las notas
		int nota;

		// Se crea una variable que servirá de auxiliar para no cambiar la variable
		// principal
		int aux = 0;

		// Se crea una variable para guardar la nota más alta del alumno
		int notaMax = 0;

		// Se crea una variable para guardar la nota más baja del alumno
		int notaMin = 10;

		// Se crea una variable para guardar la nota media del alumno, el cual es la
		// suma de sus notas entre la cantidad de asignaturas
		int notaMed = 0;

		// Se crea una variable para la suma de las notas
		int suma = 0;

		// Se crea una variable que servirá de contador para saber a que alumno estamos
		// añadiendo la nota
		int cont = 1;

		// Se crea un bucle para recorrer las filas de la tabla
		for (int i = 0; i < 4; i++) {

			// Se crea un bucle para recorrer las columnas de la tabla
			for (int j = 0; j < 5; j++) {

				// Se crea un bucle para que el usuario inserte las notas de los alumnos, estas
				// notas ser entre 0 y 10, si no se da el caso, le vuelve a preguntar
				do {
					// Se imprime por pantalla un mensaje al usuario para que inserte la nota de los
					// alumnos
					System.out.print("Inserte la nota de Alumno " + cont + " : ");
					// Se escanea el numero entero que ha insertado el usuario
					nota = sc.nextInt();
				} while (nota < 0 || nota > 10);

				// Se guarda en la celda en la que esté la nota del alumno
				tabla[i][j] = nota;

			}

			// Se incrementa en uno el valor del contador para que se muestre al siguiente
			// alumno
			cont++;
		}

		// Se imprime por pantalla un salto de linea para separar los mensajes de la
		// tabla
		System.out.println();
		// Se pone el contador a 1 otra vez
		cont = 1;

		// Se crea un bucle, en este caso de for-each, para recorrer las filas de la
		// tabla
		for (int fila[] : tabla) {
			// En cada fila se imprime por pantalla el mensaje del alumno al que le
			// pertenece la fila de notas
			System.out.print("Alumno " + cont + "\t");
			// Se crea un bucle for-each para recorrer las columnas de la tabla
			for (int valor : fila) {
				// Se imprime por pantalla las celdas de la tabla que contienen las notas
				System.out.print(valor + "\t");
			}

			// Se imprime por pantalla un salto de linea
			System.out.println();
			// Se incrementa el contador
			cont++;
		}
		// Se imprime por pantalla un salto de linea
		System.out.println();

		// Se iguala el contador a 1
		cont = 1;

		// Se crea un bucle for-each, para recorrer las filas de la tabla
		for (int fila[] : tabla) {
			// Se iguala la variable suma a 0
			suma = 0;
			// Se iguala la nota maxima a 0
			notaMax = 0;
			// Se iguala la nota minima a 10
			notaMin = 10;

			// Se crea un bucle for-each para recorrer las columnas de la tabla
			for (int valor : fila) {
				// Se iguala el auxiliar a la nota de la celda en la que se encuentra
				aux = valor;
				// Se hace una condicion para cuando el auxiliar sea mayor a la nota maxima se
				// iguale la nota maxima al numero del auxiliar
				if (aux > notaMax)
					notaMax = aux;

				// Se hace una condicion para cuando el auxiliar sea menor a la nota minima se
				// iguale la nota minima al numero del auxiliar
				if (aux < notaMin)
					notaMin = aux;
				// Se suma las notas de cada alumno
				suma = suma + aux;
				// Se hace la media de las notas del alumno
				notaMed = suma / 5;
			}

			// Se imprime por pantalla la nota máxima del alumno correspondiente
			System.out.println("La nota maxima del Alumno " + cont + " es: " + notaMax);
			// Se imprime por pantalla la nota minima del alumno correspondiente
			System.out.println("La nota minima del Alumno " + cont + " es: " + notaMin);
			// Se imprime por pantalla la nota media del alumno correspondiente
			System.out.println("La nota media del Alumno " + cont + " es: " + notaMed);

			// Se incrementa el contador
			cont++;
			// Se imprime un salto de linea
			System.out.println();
		}

		// Se cierra el escaner
		sc.close();
	}

}
