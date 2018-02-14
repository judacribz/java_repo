import java.util.Random;

class HeapSortLab {
	public static void print(String name, int[] arr) {
		System.out.print(name);
		System.out.print("[" + arr.length + "]: ");
		for (int i=0; i<arr.length-1; ++i) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length-1]);
	}

	public static void fillRandom(int[] arr) {
		final int LargestNumber = 128000;

		Random g = new Random();
		for (int i=0; i<arr.length; ++i) {
			arr[i] = g.nextInt(LargestNumber);
		}
	}

	public static boolean isSorted(int[] arr, boolean ascending) {
		for (int i=1; i<arr.length; ++i) {
			if (ascending) {
				if (arr[i-1] > arr[i]) return false;
			}
			else {
				if (arr[i-1] < arr[i]) return false;
			}
		}
		return true;
	}

	public static int[] sortAscendingUsingHeapSort(int[] arr) {
		HeapSort heapSortEngine = new HeapSort();
		return heapSortEngine.sort(arr, true);
	}

	public static int[] sortDescendingUsingHeapSort(int[] arr) {
		HeapSort heapSortEngine = new HeapSort();
		return heapSortEngine.sort(arr, false);
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Usage: java HeapSortLab <size of array>");
			//System.exit(1);
		}

		int n = Integer.parseInt(args[0]);

		int[] arr = new int[n];
		fillRandom(arr);
		print("arr", arr);
		System.out.println("arr is sorted: " + isSorted(arr, true));

		// TO DO - 1
		int[] arr1 = sortAscendingUsingHeapSort(arr);
		print("\narr1", arr1);
		System.out.println("arr1 is sorted (ascending): " + isSorted(arr1, true));
		
		// TO DO - 2
		int[] arr2 = sortDescendingUsingHeapSort(arr);
		print("\narr2", arr2);
		System.out.println("arr2 is sorted (descending): " + isSorted(arr2, false));
	}	
}