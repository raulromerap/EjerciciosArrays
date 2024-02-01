package ejerciciosarraysin;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[8];
		
		int numU;
		
		for(int i = 0; i < tabla.length; i++) {
			
			System.out.print("Introduzca un número: ");
			numU = sc.nextInt();
			
			tabla[i] = numU;
		}
		
		for(int par : tabla) {
			if(par % 2 == 0) {
				System.out.println(par + " es par");
			}else {
				System.out.println(par + " es impar");
			}
		}
		sc.close();
	}

}
