package ejerciciosarraycon;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Se crea un tabla de tamaño 100
		int tabla[] = new int[1000];
		
		int cont = 0;
		
		boolean si= false;
		
		// Se crea una varaible para guardar el numero del usuario
		int numU;
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random()*100);
		}
		
		System.out.print("Inserte numero:");
		numU = sc.nextInt();
		
		for(int numero : tabla) {
			if(numero==numU) {
				cont++;
				si=true;
			}
		}
		
		if(si)
			System.out.println("El numero exite " + cont + " veces");
		else
			System.out.println("El numero no existe");
	
		
		sc.close();
	}

}
