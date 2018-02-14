import java.util.*;

public class QuickSortInt extends ArraySort<Integer> {
	Comparator<Integer> c;

	public QuickSortInt(IntegerComparator c) {
		setComparator(c);
	}

	public void setComparator(IntegerComparator c) {
		this.c = c;
	}
	
	public void iSort(Integer[] inArray) {

	}

	public Integer[] oSort(Integer[] inArray) {
		return inArray;
	}

	public long iSortTimed(Integer[] inArray) {
		long startTime = System.nanoTime();
		iSort(inArray);
		long endTime = System.nanoTime();
	
		if (inArray.length<10)
			for(int i = 0; i < inArray.length; i++)
				System.out.print(inArray[i] + " ");
		System.out.println();

		return (endTime-startTime)/NANO_TO_MILLI;
	}


	public void quickSort(Integer[] inArray, Integer p, Integer s, Integer e) { 
		
	}

	public Integer[] partition(Integer[] inArray, Integer p, Integer s, Integer e) {
		// p for pivot, s for start, e for end
		p = (int)Math.random()*inArray.length;

		if(p == 0)
			s = 1;
		else if(p==inArray.length-1)
			e = inArray.length -2;

		if(s>=e)
			return inArray;

		while(inArray[s]<=inArray[p] && s<e) {
			s++;
			System.out.println("s"+s);
		}

		while(inArray[p]<inArray[e] && s<e) {
			--e;
			System.out.println("e"+e);
		}
		
		if(inArray[s]>=inArray[p] && inArray[e]<=inArray[p])
			inArray = swap(inArray, s, e);

		this.quickSort(inArray,p,s,e);	
		return inArray;	
	}

	public Integer[] swap(Integer[] inArray, Integer s, Integer e) {
		Integer temp = inArray[s];
		inArray[s] = inArray[e];
		inArray[e] = temp;
		return inArray;
	}
	
}