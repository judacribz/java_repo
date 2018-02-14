import java.util.*;

public class questions {
	public static int count = 0;
	void q1()
	{
		int value = 0, index;
		String line;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number array, make sure the elements are in order");
		line = scan.nextLine();

		String[] arr = line.split(" ");
		int[] anArray = new int[arr.length];

		for (int i = 0; i < arr.length; i++)
			anArray[i] = Integer.parseInt(arr[i]);

		System.out.println("Please enter a number to search:");
		value = scan.nextInt();

		index = binarySearch(anArray, 0, anArray.length-1, value);
		if (index == -1)
			System.out.println("I cannot find it!");
		else {
			//count = Math.abs(anArray.length/2 - index) + 1;
			System.out.println("I find it! Its index is " + index + " in " + count + " step(s)");
		}
	}	
	
	public int binarySearch(int anArray[], int first, int last, int value) {
		int mid = (last-first)/2 + first;

		count++;

		if(anArray[mid] == value) //base case
			return mid;
		if (last - first <= 0) //if the value does not exist
			return -1;
		else {
			if(anArray[mid] < value)
				return binarySearch(anArray, mid+1, last, value);
			else
				return binarySearch(anArray, 0, mid-1, value);
		}

	}
}
