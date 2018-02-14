public abstract class ArraySort<T> {
	public final int NANO_TO_MILLI = 1000000;

	abstract public void iSort(T[] inArray);
	abstract public T[] oSort(T[] inArray);

	public long iSortTimed(T[] inArray) {
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		return (endTime-startTime)/NANO_TO_MILLI;
	}

	public void setComparator(Comparator<T> comparator) {
	}
}
