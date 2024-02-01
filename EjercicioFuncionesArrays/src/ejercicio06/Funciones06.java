package ejercicio06;

public class Funciones06 {

	public int[] suma(int t[], int numElementos) {
		
		int tablaSumas[] = new int [t.length-numElementos+1];
		
		for(int i=0; i<tablaSumas.length; i++) {
			for(int j=i; j<i+numElementos;j++) {
				tablaSumas[i] += t[j];
			}
		}
		
		return tablaSumas;
		
	}
	
}
