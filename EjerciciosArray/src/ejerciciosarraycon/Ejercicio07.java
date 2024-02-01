package ejerciciosarraycon;

import java.util.Arrays;

import java.util.Random;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int i = 0;
		int j = 0;
		
		int ganadora[] = {2,12,26,29,34,48};
		
		int apuesta[] = new int[6];
		
		int aleatorio;
		
		int cont = 0;
		
		while(i<apuesta.length) {
			
			aleatorio = rand.nextInt(1,50);
			
			while(j<apuesta.length && aleatorio != apuesta[i]) {
				j++;
			}
			
			if(j> apuesta.length - 1)
				apuesta[i] = aleatorio;
			
			j = 0;
			i++;
		}
		
		for(int valor : apuesta) {
			if(Arrays.binarySearch(ganadora, valor) >=0) {
				cont++;
			}
		}
		
		System.out.println(Arrays.toString(apuesta));
		System.out.println(Arrays.toString(ganadora));
		
		System.out.println("Tienes " + cont + " aciertos");
		
	}

}
