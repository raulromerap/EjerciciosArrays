package ejercicio02;

import java.util.Arrays;
import java.util.Random;

public class Main02 {

	public static void main(String[] args) {
		
		Funciones02 fun = new Funciones02();
		
		Random rand = new Random();
		
		int t[] = new int [10];
		
		int numU;
		
		int resultado;
		
		for(int i = 0; i < t.length; i++) {
			numU = rand.nextInt(1,100);
			t[i] = numU;
		}
		
		resultado = fun.maximo(t);
		
		System.out.println(Arrays.toString(t));
		System.out.println("El numero máximo es: " + resultado);
		
	}

}
