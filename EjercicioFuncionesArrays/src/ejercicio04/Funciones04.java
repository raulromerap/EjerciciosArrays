package ejercicio04;

public class Funciones04 {

	/**
	 * Atributo que sirve como indice para la busqueda del numero
	 */
	int indiceBusqueda;
	
	// Función para buscar de forma secuencial en la tabla
	public int buscar(int t[], int clave) {
		
		 indiceBusqueda = 0;
		
		int pos = -1;
		
		while(indiceBusqueda<t.length && clave != t[indiceBusqueda]) {
			indiceBusqueda++;
		}
		
		if(indiceBusqueda<t.length)
			pos = 0;
		
		return pos;
	}
	
}
