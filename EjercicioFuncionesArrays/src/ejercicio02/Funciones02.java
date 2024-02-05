package ejercicio02;

/**
 * Esta clase se encarga de registrar cual es el numero mas grande de la tabla
 * 
 * @author Raúl Romera
 */
public class Funciones02 {

	/**
	 * Esta funcion recibe la tabla creada en main y va registrando celda por celda
	 * cual el numero maximo y devuelve este
	 * 
	 * @param t "La tabla creada en main con los numeros aleatorios en él"
	 * @return Devuelve la variable con el numero maximo de la tabla
	 */
	public int maximo(int t[]) {
		// Se crea una variable que almacena el numero maximo de la tabla, para ello se
		// utiliza la funcion Integer para así igualarlo al numero más pequeño que se
		// puede registrar en un int
		int numF = Integer.MIN_VALUE;

		// Se crea un bucle que recorre la tabla celda por celda y registra mediante una
		// condicion el numero maximo
		for (int valor : t) {

			// Se usa una condicion para saber si el numero de la celda en la que se
			// encuentra el bucle es mayor a nuestro numero mayor registrado, si es mas
			// pequeño se almacena dicho numero en la variable asociada
			if (valor > numF)
				numF = valor;

		}

		// Se devuelve la variable con el numero maximo
		return numF;

	}

}
