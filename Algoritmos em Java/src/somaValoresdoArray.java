
public class somaValoresdoArray {

	public static void main(String[] args) {

		double[] arr = {3, 3, 1, 4, 6, 6, 7, 9, 1};
		
		for (double d : arr) {
			System.out.print(d + "  ");
		}
		
		System.out.println("\nSoma de todos os valores do array: " + somaElementos(arr));
		
	}

	static double somaElementos(double[] numero) {
		/**
		 * Soma todos os elementos dentro de uma lista.
		 * Algoritmos linear o(n)
		 * Temos um "problema" aqui, o que aconteceria se a varíavel double chegasse ao limite?
		 * */
		double soma = 0;
		for (int i = 0; i < numero.length; i++) {
			soma += numero[i];
		}
		return soma;
	}
}
