
	import java.util.Arrays;

	public class Selection {
		public static void main(String[] args) {
			System.out.println("Desordenado: " + Arrays.toString(array));
			SelectionSort();
		}
		static int[] array = { 98,7, 64, 2, 1,75,53,23 };
		

		static void SelectionSort() {
			
			int tam = 8;
			for (int i = 0; i < (tam - 1); i++) {
				int min = i;
			 
				for (int j = (i + 1); j < tam; j++) {
					if (array[j] < array[min])
						min = j;
				}
				if (i != min) {
					int aux = array[i];
					array[i] = array[min];
					array[min] = aux;
				}
				
			}
			System.out.println("   Ordenado: " + Arrays.toString(array));
		}
		
	}

