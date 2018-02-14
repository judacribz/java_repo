public class MergeSortInt extends ArraySort<Integer> {
	Comparator<Integer> c;
	
	public MergeSortInt(IntegerComparator c) {
		setComparator(c);
	}

	public void setComparator(IntegerComparator c) {
		this.c = c;
	}

	public void iSort(Integer[] inArray) {
		inArray = oSort(inArray);
	}

	public Integer[] oSort(Integer[] inArray) {
		Integer len = inArray.length;
		if (len <= 1)
			return inArray;

		Integer mid = len/2;
		
		Integer[] left = new Integer[mid];
		Integer[] right = new Integer[mid+len%2]; //if odd, then mid+1

		Integer j = 0;
		for(Integer i=0; i<mid; i++)
			left[i] = inArray[i];
		for(Integer i=mid; i<len; i++)
			right[j++] = inArray[i];

		return merge(oSort(left), oSort(right));
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

	public Integer[] merge(Integer[] left, Integer[] right) {
		Integer lenL = left.length;
		Integer lenR = right.length;
		Integer len = lenL+lenR;
		Integer iL = 0, iR = 0, iB = 0;

		Integer[] both = new Integer[len];

		while(iL<lenL || iR<lenR) {
			if(iL<lenL && iR<lenR) {
				if(left[iL]<=right[iR])
					both[iB++] = left[iL++];
				else
					both[iB++] = right[iR++];
			}
			else if(iL<lenL)
				both[iB++] = left[iL++];
			else
				both[iB++] = right[iR++];
		}

		return both;
	}
}