package ejercicio04;

public class Funciones04 {

	int indiceBusqueda;
	
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
