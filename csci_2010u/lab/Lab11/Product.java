import java.util.Comparator;

public class Product implements Comparable<String> {
	String name;
	double price;
	int amount;
	
	public Product(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	@Override
	public int compareTo(String name) {
		int one = Integer.parseInt(this.name.substring(3, this.name.length()));
		int two = Integer.parseInt(name.substring(3, name.length()));
		
		if(one >= two)
			return 1;
		else
			return -1;

	}

	public String toString() {
		return name;
	}
}
