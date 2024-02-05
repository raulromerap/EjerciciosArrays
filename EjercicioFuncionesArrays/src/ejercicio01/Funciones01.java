package ejercicio01;

/**
 * Esta clase se encarga de hacer la suma de la tabla
 * 
 * @author Raúl Romera
 */
public class Funciones01 {

	/**
	 * Esta función se encarga de recoger la tabla que se ha creado en el main y
	 * saca numero por numero y los suma para luego devolver su resultado
	 * 
	 * @param tabla "La tabla que se ha creado en la funcion main"
	 * @return Devuelve la suma de los numeros que se encuentra en la tabla
	 */
	public int sumaTabla(int tabla[]) {
		// Se crea un variable que almacena la suma de los numeros
		int suma = 0;

		// Se crea un bucle para ir de celda en celda y sumarle el numero que se
		// encuentra en él a la variable de la suma
		for (int numero : tabla) {
			// Se suma e iguala la suma al numero
			suma += numero;
		}

		// Se devuelve la variable de la suma
		return suma;
	}

}
