package ejerciciosBiDi;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {

		int tabla[][] = new int[6][10];

		Random aleatorio = new Random();

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				tabla[i][j] = aleatorio.nextInt(0, 1001);
			}
		}
		
		for(int fila[] : tabla) {
			for(int valor : fila)
				System.out.print(valor + "\t");
			System.out.println();
		}
		
		System.out.println(Arrays.toString(rellenaArray(tabla)));

	}
	
	public static int[] rellenaArray(int tabla[][]) {

		int mayor = Integer.MIN_VALUE;
		
		int menor = Integer.MAX_VALUE;
		
		int resultado[] = new int[2];
		
		for(int fila[] : tabla)
			for(int valor : fila) {
				if(mayor<valor)
					mayor=valor;
				else if(menor>valor)
					menor = valor;
			}
		
		resultado[0] = menor;
		resultado[1] = mayor;
		
		return resultado;
	}

}
