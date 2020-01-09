
public class margeSort {

	public static void main(String[] args) {

		double[] array = { 1, 9, 0, 4 };

		System.out.println("Array desordenado: ");
		for (double d : array) {
			System.out.print(d + " ");
		}

		System.out.println(" ");

		System.out.println("Array ordenado: ");
		ordenacaoMesclada(array, 0, array.length - 1);
		for (double d : array) {
			System.out.print(d + " ");
		}
	}

	static void ordenacaoMesclada(double[] arr, int i, int f) {
		int quantidade = f - i + 1;

		if (quantidade > 1) {
			int m = i + (quantidade - 1) / 2;

			// esquerda
			ordenacaoMesclada(arr, i, m);

			// direita
			ordenacaoMesclada(arr, m + 1, f);

			junta(arr, i, m, f);
		} else {
			// RESOLVIDO
		}
	}

	static void junta(double[] v, int i, int m, int f) {

		int a = i;
		int b = m + 1;
		int c = 0;

		double[] aux = new double[f - i + 1];

		while (a <= m && b <= f) {
			if (v[a] <= v[b]) {
				aux[c] = v[a];
				a++;
			} else {
				aux[c] = v[b];
				b++;
			}
			c++;
		}

		while (a <= m) {
			aux[c] = v[a];
			a++;
			b++;
		}

		while (b <= f) {
			aux[c] = v[b];
			b++;
			c++;
		}

		for (int k = i; k <= f; k++) {
			v[k] = aux[k - i];
		}
	}
}
