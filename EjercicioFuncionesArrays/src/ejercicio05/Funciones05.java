package ejercicio05;

public class Funciones05 {

	/**
	 * Atributo que guarda el valor de la posicion en la que se encuentra el numero
	 */
	int elementosNuevaTabla;

	public int[] buscarTodos(int t[], int valor) {

		// Se crea un tabla que tendrá la posicion de los numeros
		int tablaResultado[] = new int[10];

		// Se creaub bucle que busca el numero y guarda el indice de este en la tabla
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				tablaResultado[elementosNuevaTabla] = i;
				elementosNuevaTabla++;
			}
		}

		// Devuelve la tabla con los indices
		return tablaResultado;
	}

}
