package ejerciciosBiDi;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int tabla[][] = new int [4][4];
		
		int cont = 1;
		
		int resultado[][];
		
		for(int i = 0; i < tabla.length;i++) {
			for(int j = 0; j<tabla[i].length; j++) {
				tabla[i][j] = cont;
				cont++;
			}
		}
		
		for(int fila[] : tabla) {
			for(int valor : fila)
				System.out.print(valor + "\t");
			System.out.println();
		}
		
		System.out.println();
		
		resultado = transposicion(tabla);
		
		for(int fila[] : resultado) {
			for(int valor : fila)
				System.out.print(valor + "\t");
			System.out.println();
		}
	}
	
	public static int[][] transposicion (int tabla[][]){
		int tablaT[][] = new int [4][4];
		
		for(int i = 0; i < tablaT.length;i++) {
			for(int j = 0; j<tablaT[i].length; j++) {
				tablaT[i][j] = tabla[j][i];
			}
		}
		
		return tablaT;
	}

}
