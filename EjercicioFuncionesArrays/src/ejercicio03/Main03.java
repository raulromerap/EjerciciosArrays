package ejercicio03;

import java.util.Arrays;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		
		Funciones03 fun = new Funciones03();
		
		Scanner sc =new Scanner(System.in);
		
		int longitud;
		
		int fin;
		
		int resultado[];
		
		System.out.print("Introduce la longitud de la tabla: ");
		longitud = sc.nextInt();
		
		System.out.print("Introduce el limite del numero par más alto: ");
		fin= sc.nextInt();
		
		resultado = fun.rellenaPares(longitud, fin);
		
		Arrays.sort(resultado);
		
		System.out.println(Arrays.toString(resultado));
		
		sc.close();
		
	}

}
