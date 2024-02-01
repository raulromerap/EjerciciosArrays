package ejercicio06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {

		
		Funciones06 fun = new Funciones06();
		
		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		
		int t[];
		
		int numA;
		
		int tam;
		
		int numElementos;
		
		int[] resultado;
		
		System.out.print("Inserte el valor del array que quieres generar: ");
		tam = sc.nextInt();
		
		t = new int [tam];
		
		for(int i=0; i<t.length;i++) {
			numA = rand.nextInt(1,11);
			
			t[i] = numA;
		}
		
		System.out.println(Arrays.toString(t));
		
		System.out.print("Inserte el numero de elementos que quieres sumar: ");
		numElementos = sc.nextInt();
		
		resultado = fun.suma(t, numElementos);
		
		System.out.println(Arrays.toString(resultado));
		
		sc.close();
		
	}

}
