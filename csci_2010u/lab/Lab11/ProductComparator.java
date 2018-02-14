public class ProductComparator implements Comparator<Product> {
	public ProductComparator() {
	}
	
	public int compare(Product a, Product b) {
		// TODO Auto-generated method stub
		return a.compareTo(b.name);
	}
}

interface Comparator<T> {
	public int compare(T a, T b);
}
