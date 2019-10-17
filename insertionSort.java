public class SortingAlgorithms {
	
	//Insertion Sort: Time complexity is O(n^2). Moves elements one at a time to correct position.
	//Good choice for small n or final finishing-off alg for other sorts like merge or quicksort
	
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
	
	
	//Bubble Sort: time complexity of O(n^2), not used for large/medium sized data sets
	//Iterates over a list comparing each value to its immediate neighbor.
	//If out of order, the higher value is swapped to the right position. On each iteration one
	//value is moved ('bubbled up') to its proper location, reducing the set to be sorted by 1.
	
	public static int[] bubbleSort(int arr[]) {
		
		if (arr.length == 1) {
			return arr;
		}
		
		int temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j=1; j < arr.length-1; j++ ) {
				if (arr[j-1] > arr[j]) {
					//swap
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;	
	}
}
