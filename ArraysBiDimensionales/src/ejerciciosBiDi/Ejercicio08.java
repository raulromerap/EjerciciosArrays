package ejerciciosBiDi;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Se crea un tabla bidimensional 2x2 asimetrica
		int tabla[][] = { { 1, 3 }, { 2, 1 } };

		// Si la funcion manda true se manda mensaje de que es simetrica
		if (simetrica(tabla))
			System.out.println("Es simetrica");
		// Si la funcion manda false se manda mensaje de que no es simetrica
		else
			System.out.println("No es simetrica");
	}

	public static boolean simetrica(int tabla[][]) {
		// Se crea un booleano que se inicia con true
		boolean simetrico = true;

		// Se crea un bucle para identificar si la tabla es simetrica
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] != tabla[j][i]) {
					simetrico = false;
				}
			}
		}

		// Devuelve el booleano
		return simetrico;
	}

}
