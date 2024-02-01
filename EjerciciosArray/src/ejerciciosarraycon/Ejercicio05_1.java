package ejerciciosarraycon;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tabla[] = new int[8];
		
		int puntosJ;
		
		
		for(int i = 0; i < tabla.length; i++) {
			
			System.out.print("Introduzca la puntuación del jugador: ");
			puntosJ = sc.nextInt();
			
			tabla[i] = puntosJ;
		}
		System.out.println();
		Arrays.sort(tabla);
		
		alReves(tabla);
		
		System.out.println(Arrays.toString(tabla));
		
		sc.close();
		
	}
	public static void alReves(int[] tabla){
		 
        int n = tabla.length;
 
        for (int i = 0; i < n / 2; i++) {
 
            int aux = tabla[i];
 
            tabla[i] = tabla[n - i - 1];
            
            tabla[n - i - 1] = aux;
        }
    }
}
