package ejercicio03;

import java.util.Random;

public class Funciones03 {

	public int[] rellenaPares(int longitud, int fin) {
		
		Random rand = new Random();
		
		int tablaPares[] = new int[longitud];
		
		int numA;
		
		int i = 0;
		
		while(i<tablaPares.length) {
			numA = rand.nextInt(2,fin);
			if(numA%2==0) {
				tablaPares[i] = numA;
				i++;
			}
		}
		return tablaPares;
	}
	
}
