package ejerciciosBiDi;

public class Ejercicio08 {

	public static void main(String[] args) {

		int tabla[][] = new int[3][3];

		int contP = 1;

		int contN = 5;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {

				if (contP <= 5) {
					tabla[i][j] = contP;
					contP++;
				}

				if (contP > 5) {
					tabla[i][j] = contN;
					contN--;
				}

			}
		}

		for (int fila[] : tabla) {
			for (int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

	}

}
