package ejercicio01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		
		Funciones01 fun = new Funciones01();
		
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[5];
		
		int numU;
		
		int resultado;
		
		for(int i = 0; i<tabla.length; i++) {
			
			System.out.print("Introduce un número: ");
			numU = sc.nextInt();
			
			tabla[i]  = numU;
			
		}
		
		resultado = fun.sumaTabla(tabla);
		
		System.out.println("El resultado es: " + resultado);
		
		sc.close();
	}

}
