package ejercicio05;

public class Funciones05 {

	int elementosNuevaTabla;

	public int[] buscarTodos(int t[], int valor) {

		elementosNuevaTabla = 0;

		int tablaResultado[] = new int[10];

		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				tablaResultado[elementosNuevaTabla] = i;
				elementosNuevaTabla++;
			}
		}

		return tablaResultado;
	}

}
