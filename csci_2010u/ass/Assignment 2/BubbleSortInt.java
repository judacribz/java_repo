public class BubbleSortInt extends ArraySort<Integer> {
	Comparator<Integer> c;

	public BubbleSortInt(IntegerComparator c) {
		setComparator(c);
	}

	public void setComparator(IntegerComparator c) {
		this.c = c;
	}

	public void iSort(Integer[] inArray) {
		Integer len = inArray.length;
		boolean flag = true;

		while(flag) {
			flag = false;
			for(Integer i=0; i<len-1; i++) {
				if(inArray[i]>inArray[i+1]) {
					Integer temp = inArray[i];
					inArray[i] = inArray[i+1];
					inArray[i+1] = temp;
					flag = true;
				}
			}
		}
	}

	public Integer[] oSort(Integer[] inArray) {
		Integer len = inArray.length;
		Integer[] newArr = new Integer[len];

		for (Integer i=0; i<len; i++) {
			newArr[i] = inArray[i];
		}

		this.iSort(newArr);
		return newArr;
	}

	public long iSortTimed(Integer[] inArray) {
		long startTime = System.nanoTime();
		this.iSort(inArray);
		long endTime = System.nanoTime();
	
		if (inArray.length<10)
			for(int i = 0; i < inArray.length; i++)
				System.out.print(inArray[i] + " ");
		System.out.println();
	
		return (endTime-startTime)/NANO_TO_MILLI;
	}
}