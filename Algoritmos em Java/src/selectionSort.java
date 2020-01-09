
public class selectionSort {

	public static void main(String[] args) {

		double[] array = { 1, 4, 6, 2, 3, 2, 4, 0 };

		System.out.println("Array desordenado: ");
		for (double d : array) {
			System.out.print(d + " ");
		}

		System.out.println(" ");
		
		System.out.println("Array ordenado: ");
		ordenacaoPorSelecao(array);

		for (double d : array) {
			System.out.print(d + " ");
		}
	}

	/**
	 * O algoritmo de ordenação por seleção (selection sort), só ira funcionar uma
	 * vez que sabemos qual é o meior número de um determinado array.
	 */

	static int encontraMaior(double[] arr, int ultimo) {
		int max = 0;
		for (int i = 0; i <= ultimo; i++) {
			if (arr[max] < arr[i]) {
				max = i; // Aqui eu quero o endereço de onde o maior elemento esta
			}
		}
		return max;
	}

	static void ordenacaoPorSelecao(double[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int max = encontraMaior(arr, arr.length - i);
			double aux = arr[arr.length - i];
			arr[arr.length - i] = arr[max];
			arr[max] = aux;
		}
	}
}
