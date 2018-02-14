
public class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product a, Product b) {
		// TODO Auto-generated method stub
		return a.compareTo(b.name);
	}
}
