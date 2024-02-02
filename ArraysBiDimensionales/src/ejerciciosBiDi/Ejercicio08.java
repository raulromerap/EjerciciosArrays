package ejerciciosBiDi;

public class Ejercicio08 {

	public static void main(String[] args) {

		int tabla[][] = {{3,2} , {2,1}};
		
		if(simetrica(tabla))
			System.out.println("Es simetrica");
		else
			System.out.println("No es simetrica");
	}

	public static boolean simetrica(int tabla[][]) {
		boolean simetrico = true;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] != tabla[j][i])
					simetrico = false;
			}
		}

		return simetrico;
	}

}
