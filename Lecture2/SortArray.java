import java.util.Arrays;

public class SortArray {

	private static int[] arr;

	public static void main(String[] args) {
		int[] arrtmp;

		fillArray(100);
		System.out.println("Unsorted array:");
		System.out.println(Arrays.toString(arr));

		arrtmp = arr;
		System.out.println("Bubble sort:");
		bubbleSort(arrtmp);
		System.out.println(Arrays.toString(arrtmp));

		arrtmp = arr;
		System.out.println("Quick sort:");
		quickSort(arrtmp, 0, arrtmp.length - 1);
		System.out.println(Arrays.toString(arrtmp));

		/*
		 * Output:
		 * 
		 * Unsorted array: [83, 57, 61, 90, 65, 26, 47, 11, 30, 49, 91, 38, 35,
		 * 38, 60, 71, 94, 14, 2, 23, 38, 65, 17, 99, 50, 32, 10, 57, 77, 53,
		 * 20, 59, 97, 2, 30, 8, 43, 38, 38, 15, 92, 94, 99, 80, 92, 9, 85, 43,
		 * 2, 50, 41, 21, 44, 24, 88, 81, 32, 86, 36, 83, 91, 59, 70, 35, 11,
		 * 71, 22, 8, 64, 57, 27, 36, 5, 90, 16, 96, 11, 6, 78, 22, 97, 88, 46,
		 * 82, 66, 71, 16, 72, 85, 84, 45, 39, 32, 47, 68, 31, 42, 79, 18, 60]
		 * 
		 * Bubble sort: [2, 2, 2, 5, 6, 8, 8, 9, 10, 11, 11, 11, 14, 15, 16, 16,
		 * 17, 18, 20, 21, 22, 22, 23, 24, 26, 27, 30, 30, 31, 32, 32, 32, 35,
		 * 35, 36, 36, 38, 38, 38, 38, 38, 39, 41, 42, 43, 43, 44, 45, 46, 47,
		 * 47, 49, 50, 50, 53, 57, 57, 57, 59, 59, 60, 60, 61, 64, 65, 65, 66,
		 * 68, 70, 71, 71, 71, 72, 77, 78, 79, 80, 81, 82, 83, 83, 84, 85, 85,
		 * 86, 88, 88, 90, 90, 91, 91, 92, 92, 94, 94, 96, 97, 97, 99, 99]
		 * 
		 * Quick sort: [2, 2, 2, 5, 6, 8, 8, 9, 10, 11, 11, 11, 14, 15, 16, 16,
		 * 17, 18, 20, 21, 22, 22, 23, 24, 26, 27, 30, 30, 31, 32, 32, 32, 35,
		 * 35, 36, 36, 38, 38, 38, 38, 38, 39, 41, 42, 43, 43, 44, 45, 46, 47,
		 * 47, 49, 50, 50, 53, 57, 57, 57, 59, 59, 60, 60, 61, 64, 65, 65, 66,
		 * 68, 70, 71, 71, 71, 72, 77, 78, 79, 80, 81, 82, 83, 83, 84, 85, 85,
		 * 86, 88, 88, 90, 90, 91, 91, 92, 92, 94, 94, 96, 97, 97, 99, 99]
		 */

	}

	public static int randomFill() {
		return (int) (Math.random() * 99 + 1);
	}

	public static int[] fillArray(int size) {
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = randomFill();
		}
		return arr;
	}

	public static void bubbleSort(int[] numArray) {

		int n = numArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (numArray[j - 1] > numArray[j]) {
					temp = numArray[j - 1];
					numArray[j - 1] = numArray[j];
					numArray[j] = temp;
				}

			}
		}
	}

	public static void quickSort(int array[], int start, int end) {
		int i = start;
		int k = end;

		if (end - start >= 1) {
			int pivot = array[start];

			while (k > i) {
				while (array[i] <= pivot && i <= end && k > i)
					i++;
				while (array[k] > pivot && k >= start && k >= i)
					k--;
				if (k > i)
					swap(array, i, k);
			}
			swap(array, start, k);

			quickSort(array, start, k - 1);
			quickSort(array, k + 1, end);
		}
		return;
	}

	public static void swap(int array[], int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

}
