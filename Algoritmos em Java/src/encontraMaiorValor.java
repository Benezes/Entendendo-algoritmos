
public class encontraMaiorValor {

	public static void main(String[] args) {

		double[] arr = { 1, 3, 4, 1, 5, 12 };

		for (double d : arr) {
			System.out.print(d + " ");
		}

		System.out.println("\nMaior valor da lista: " + encontraMaior(arr));
	}

	static double encontraMaior(double[] numero) {
		/**
		 * Apenas uma s�mples busca linear, o(n).
		 * Aqui tomos duas situa��es;
		 * a boa que seria achar o maior n�mero na primeira intera��o.
		 * a ruim � percorrer toda a lista 1 por 1 at� achar o maior n�mero.
		 * � boa quando o tamanho da entrada � baixa
		 * */
		double max = numero[0];
		for (int i = 0; i < numero.length; i++) {
			if (max < numero[i]) {
				max = numero[i];
			}
		}
		return max;
	}
}
