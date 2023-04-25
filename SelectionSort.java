public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	public static void main(String[] args) {
		int[] positive = {1,7,12,4,13,19};
		int[] negative = {-1,-7,-12,-4,-13,-19};
		int[] mixed = {-1,7,-12,4,-13,19};
		selectionSort(positive);
		System.out.println("Positive: ");
		for(int index : positive) {
			System.out.println(index + " ");
		}
		selectionSort(negative);
		System.out.println("Negative: ");
		for(int index : negative) {
			System.out.println(index + " ");
		}
		selectionSort(mixed);
		System.out.println("Mixed: ");
		for(int index : mixed) {
			System.out.println(index + " ");
		}
		System.out.println();
	}
}
