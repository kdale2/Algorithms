public class HybridQuicksort {

	//upon calling quick-sort on sub-array with fewer than k
	//elements, let it return without sorting sub-array
	//after top-level call to quick-sort returns, run insertion
	//sort on the entire array to finish sorting process
	
	
	public static int[] HybridQuickSort(int[] array, int p, int r, int k) {

		int size = (r + 1) - p;
		if (size <= k) {
		     InsertionSort(array);	
		}
		
		else {
			int q = Partition(array, p, r);
			HybridQuickSort(array, p, q, k);
			HybridQuickSort(array, q+1, r, k);
		     }
			return array;
		}	

	
	static void InsertionSort(int[] array) {
		
		int n = array.length;
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i-1;
			
			while (j >=0 && array[j] > key) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
	}
	
	static int Partition(int[] array, int p, int r) {
		
		int pivot = array[r];
		int i = p-1;
		for (int j = p; j < r-1; j++) {
			if (array[j] < pivot) {
				i++;
				
			   int temp = array[i];
			   array[i] = array[j];
			   array[j] = temp;
			}
		}
		
		int temp = array[i+1];
		array[i+1] = array[r];
		array[r] = temp;
		
		return i+1;
		
	}
	
	public static void main(String args[]) {

		int[] arr = new int[1024];
		for (int k = 0; k < arr.length; k++) {
			int r = 0 + (int) (Math.random() * 1000) - 100;
			arr[k] = r;
		}
		
		int[] sorted = HybridQuickSort(arr, 0, arr.length-1, 10);
		
		for (int i= 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
