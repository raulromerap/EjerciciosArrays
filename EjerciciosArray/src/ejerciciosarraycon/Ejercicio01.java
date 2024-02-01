package ejerciciosarraycon;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variable para el primer numero del usuario
		int n;
		
		//Variable para el segundo numero del usuario
		int m;
		
		//Se crea una variable para el array
		int tabla[];
		
		//Se imprime por pantalla un mensaje para que el usuario inserte un valor para la longitud del array
		System.out.print("Introduce la cantidad de celdas que quieres que tenga el array: ");
		//Se escanea el numero que ha insertado el usuario
		n = sc.nextInt();
		
		//Se imprime por pantalla un mensaje para que el usuario inserte el numero que quiere que se rellene el array
		System.out.print("Introduzca un número: ");
		//Se escanea el numero que ha insertado el usuario
		m = sc.nextInt();
		
		//Se le da la longitud del usuario a la tabla
		tabla = new int[n];
		
		//Se rellenan con la clase arrays la tabla con el numero que el usuario ha insertado
		Arrays.fill(tabla, m);
		
		//Se imprime por pantalla el array
		System.out.println(Arrays.toString(tabla));
		
		//Se cierra el escaner
		sc.close();
	}

}
