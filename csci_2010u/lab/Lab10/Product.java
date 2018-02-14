public class Product implements Comparable<Product> {
	String name;
	double price;
	int amount;

	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public int compareTo(Product p) {
		return this.name.compareTo(p.name);
	}
}