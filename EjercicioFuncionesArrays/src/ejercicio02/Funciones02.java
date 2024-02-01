package ejercicio02;

public class Funciones02 {

	public int maximo(int t[]) {
		int numF = Integer.MIN_VALUE;
		
		for(int valor : t) {
			
			if(valor > numF)
				numF= valor;
			
		}
		
		return numF;
		
	}
	
}
