public class SortingAlgorithms {
	
	public static int[] insertionSort(int arr[]) {
		
		for (int i = 1; i < arr.length -1; i ++) {
			int value = arr[i];
			int j = i-1;
			
			while (j >= 0 && arr[j] > value) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = value;
		}
		return arr;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {1, 6, 75, 8, 2, 12, 65, 2, 10};
		int[] sorted = insertionSort(arr);
		
		for (int i = 0; i < sorted.length -1; i++) {
			System.out.println(sorted[i]);

		}		
	}
}
