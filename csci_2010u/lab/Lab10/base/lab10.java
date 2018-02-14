import java.util.Scanner;


public class lab10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Banana", 1.5, 5000);
		Product p2 = new Product("Apple", 2.0, 100000);
		Product p3 = new Product("Tomato", 0.9, 7800000);
		Product p4 = new Product("Milk", 2, 80000000); 
		Product p5 = new Product("Orange", 1.3, 60000000);
		
		Product[] lists = new Product[5];
		lists[0] = p1;
		lists[1] = p2;
		lists[2] = p3;
		lists[3] = p4;
		lists[4] = p5;
		
		/*LinkedBinaryTree<Product> bt= new LinkedBinaryTree<Product>();		
		bt.setComparator(new ProductComparator());
		
		for(int i=0; i < lists.length; i++)
		{			
			bt.insert(lists[i]);
		}
		
		System.out.println("Please enter a product name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		Product p = new Product(name, 0, 0);
		
		BTNode<Product> result = bt.search(p);
		System.out.println("============Result==========");
		if(result == null)
			System.out.println("No such product");
		else
		{			
			System.out.println("name:\t" + result.getElement().name);
			System.out.println("amount:\t" + result.getElement().amount);
			System.out.println("price:\t" + result.getElement().price);
		}*/
	}

}
