
import java.util.*;

public class sortNumbers {
	public static void main(String[] args) {
		Integer[] arr = new Integer[Integer.parseInt(args[0])];
		for (Integer i = 0; i<Integer.parseInt(args[0]); i++)
			arr[i] = (int)(Math.random()*101);

		if(args[1].equalsIgnoreCase("bubble")) {
			IntegerComparator comparator = new IntegerComparator(true);
			BubbleSortInt bubble = new BubbleSortInt(comparator);
			if(args.length == 1) {
				if(args[2].equalsIgnoreCase("descend")) {
					comparator.ascend = false;
				}
			}

			long time = bubble.iSortTimed(arr);
			System.out.println("Time Taken: " + time + "ms");	

		} 
		else if (args[1].equalsIgnoreCase("merge")) {
			IntegerComparator comparator = new IntegerComparator(true);
			MergeSortInt mergesort = new MergeSortInt(comparator);
			if(args.length == 1) {
				if(args[2].equalsIgnoreCase("descend")) {
					comparator.ascend = false;
				}
			}

			long time = mergesort.iSortTimed(arr);
			System.out.println("Time Taken: " + time + "ms");
		} 
		else if (args[1].equalsIgnoreCase("quick")) {
			IntegerComparator comparator = new IntegerComparator(true);
			QuickSortInt quicksort = new QuickSortInt(comparator);
			if(args.length == 1) {
				if(args[2].equalsIgnoreCase("descend")) {
					comparator.ascend = false;
				}
			}

			long time = quicksort.iSortTimed(arr);
			System.out.println("Time Taken: " + time + "ms");
		}

	}
}





