package ejerciciosBiDi;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Se crea una variable para generar una tabla bidimensional
		int tabla [][] = new int [3][6];
		
		// Se rellena las celdas en la tabla
		tabla[0][0] = 0;
		tabla[0][1] = 30;
		tabla[0][2] = 2;
		tabla[0][5] = 5;
		tabla[1][0] = 75;
		tabla[1][4] =0;
		tabla[2][2] = -2;
		tabla[2][3] = 9;
		tabla[2][5] = 11;
		
		// Se imprime por pantalla la tabla
		for(int i=0; i<tabla.length;i++) { // Filas
			for(int j=0; j<tabla[i].length;j++) {// Columnas
				// Se imprime por pantalla
				System.out.print(tabla[i][j]+ "\t");
			}
			// Salto de linea de una fila a otra
			System.out.println();
		}
		
	}

}
