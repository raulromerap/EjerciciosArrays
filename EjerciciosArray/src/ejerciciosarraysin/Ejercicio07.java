package ejerciciosarraysin;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Se llama a la funcion escanerç
		Scanner sc = new Scanner(System.in);

		// Se crea una variable para una tabla de longitud 12
		int tabla[] = new int[12];

		// Se crea una variable para guardar la temperatura que ha introduxido el
		// usuario
		int temp;

		//Se crea una variable para los meses escritos
		String mesNom;
		
		// Se crea una variable para los meses
		int mes = 0;

		// Se crea un bucle para asociar los meses con las temperaturas
		for (int i = 0; i < tabla.length; i++) {
			mes++;
			mesNom = mesesEs(mes);

			// Se imprime por pantalla el mensaje para que el usuario inserte la temperatura
			System.out.print("Introduzca la temperatura de " + mesNom + ": ");
			// Se escanea el numero
			temp = sc.nextInt();

			// Se iguala el valor de la temperatura con cada celda correspondiente
			tabla[i] = temp;
		}

		mes = 0;
		for(int pos : tabla) {
			mes++;
			mesNom = mesesEs(mes);
			
			System.out.print(mesNom + "\t|");
			
			for(int j = 0; j < pos; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

	static String mesesEs(int mesNum) {
		String mesEs = switch (mesNum) {
		case 1 -> "Enero";
		case 2 -> "Febrero";
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio";
		case 7 -> "Julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		default -> "";
		};
		return mesEs;
	}
}
