package ejerciciosarraysin;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double tabla[] = new double[100];
		
		double num;
		
		double numA;
		
		int posiciones = 0;
		
		for(int i = 0; i < tabla.length; i++) {
			
			numA = 1 + Math.random()*10;
			
			tabla[i] = numA;
			
		}
		
		System.out.print("Introduzca un número del 1 al 10");
		num = sc.nextDouble();
		
		for(double pos : tabla) {
			
			if(num == pos)
			posiciones++;
			
		}
		System.out.println("Ese numero esta en la tabla " + posiciones + " veces");
		
		sc.close();
	}
	
}
