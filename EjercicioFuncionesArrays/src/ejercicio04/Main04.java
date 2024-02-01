package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {

		Funciones04 fun = new Funciones04();
		
		// Se crea el objeto para generar numeros aleatorios llamando a la funcion random
		Random rand = new Random();
		
		// Se crea el objeto escaner llamando a la funcion escaner
		Scanner sc = new Scanner(System.in);

		// Se crea una tabla de longitud 10
		int t[] = new int[10];

		// Se crea una variable para guardar el numero que el usuario quiere buscar
		int clave;
		
		// Se crea una variable para el resultado final
		int resultado;
		
		int posicion;
		
		int numA;
		
		for(int i=0;i<t.length;i++) {
			numA = rand.nextInt(1,16);
			
			t[i] = numA;
		}
		
		// Se imprime por pantalla el mensaje para que el usuario inserte un valor
		System.out.print("Inserte un numero para buscar en la tabla");
		// Se escanea el numero que ha insertado el usuario
		clave = sc.nextInt();
		
		resultado = fun.buscar(t, clave);
		
		posicion = fun.indiceBusqueda;
		
		if(resultado == 0) 
			System.out.println("El numero " + clave + " está en la posicion " + posicion );
		else
			System.out.println("El numero " + clave + " no está en la tabla");
		
		sc.close();
	}

}
