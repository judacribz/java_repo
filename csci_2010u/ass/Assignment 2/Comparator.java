public interface Comparator<T> {
	public int compare(T a, T b);
}

class IntegerComparator implements Comparator<Integer> {
	public boolean ascend;

	public IntegerComparator(boolean ascend) {
		this.ascend = ascend;

	}
	public int compare(Integer a, Integer b) {
		if(a>b)
			return 1;
		else if (a==b)
			return 0;
		else
			return -1;
	}
}

class FloatComparator implements Comparator<Float> {
	public boolean ascend;

	public FloatComparator(boolean ascend){
		this.ascend = ascend;
	}

	public int compare(Float a, Float b) {
		if(a>b)
			return 1;
		else if (a==b)
			return 0;
		else
			return -1;
	}
}

class StringComparator implements Comparator<String> {
	public boolean ascend;

	public StringComparator(boolean ascend){
		this.ascend = ascend;
	}

	public int compare(String a, String b){
		if(a.compareTo(b) > 0) {
			return 1;
		} 
		else if (a.compareTo(b) == 0) {
			return 0;
		} 
		else {
			return -1;
		}
	}

}