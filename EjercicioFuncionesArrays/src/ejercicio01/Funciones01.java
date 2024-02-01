package ejercicio01;

public class Funciones01 {

	public int sumaTabla(int tabla[]) {
		int suma = 0;
		
		for(int numero : tabla) {
			suma = suma + numero;
		}
		
		return suma;
	}
	
}
