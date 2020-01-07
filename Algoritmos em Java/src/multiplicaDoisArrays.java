
public class multiplicaDoisArrays {

	public static void main(String[] args) {

		double[] arr = { 1, 3, 4, 5 };

		double[] brr = { 3, 2, 3, 2 };

		System.out.println("Primeiro array: ");
		for (double d : arr) {
			System.out.print(d + " ");
		}
		System.out.println(" ");
		System.out.println("Segundo array: ");
		for (double d : brr) {
			System.out.print(d + " ");
		}
		
		System.out.println("\nMultiplicação e soma dos dois array's: " + multiplica(arr, brr));
		
	}

	static double multiplica(double[] a, double[] b) {
		/**
		 * Aqui é uma simples multiplicação e soma de dois array's.
		 * É um algoritmo Quadratico -> o(n)^2.
		 * 
		 * */
		double mult = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				mult += a[i] * b[j];
			}
		}
		return mult;
	}
}
