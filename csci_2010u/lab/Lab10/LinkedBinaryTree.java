
public class LinkedBinaryTree<T>
{
	protected BTNode<T> root;
	private Comparator<T> comparator;

	//Create an empty binary tree
	public LinkedBinaryTree()
	{
		root = null;
	}	
	
	public BTNode<T> getRootElement() throws Exception
	{
		if(root == null)
			throw new Exception("Get root operation failed. The tree is empty");
		return root;
	}
	
	public LinkedBinaryTree getLeft() throws Exception
	{
		if(root == null)
			throw new Exception("Get Left tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getLeft();
		return result;
	}
	
	public LinkedBinaryTree getRight() throws Exception
	{
		if(root == null)
			throw new Exception("Get right tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getRight();
		return result;
	}
	
	public void inorder()
	{
		inorder(this.root);
	}
	
	public void inorder(BTNode<T> _root)
	{
		if(_root != null)
		{
			inorder(_root.getLeft());
			System.out.println(_root.getElement().toString());
			inorder(_root.getRight());
		}
	}
	
	//--------------------------Insert a node-------------------------------------	
	public void insert(T value)
	{
		if(root == null)
			root = new BTNode<T>(value);
		else
			insert(root, new BTNode<T>(value));
	}
	
	public BTNode<T> insert(BTNode<T> _root, BTNode<T> newNode)
	{
		if(comparator.compare(newNode.getElement(), _root.getElement()) >= 0) {
			if(_root.getRight()!=null)
				return(insert(_root.getRight(), newNode));
			else 
				_root.setRight(newNode);
		}
		else {
			if(_root.getLeft()!=null)
				return(insert(_root.getLeft(), newNode));
			else 
				_root.setLeft(newNode);
		}
		return newNode;
	}
	//----------------------------End of Insert-----------------------------------
	
	//------------------------------Binary Search----------------------------------
	public BTNode<T> search(T value)
	{
		return search(root, value);
	}
	
	public BTNode<T> search(BTNode<T> node, T value)
	{
		if(node == null)
			return null;
		else if(comparator.compare(value, node.getElement()) == 0)
			return node;
		else if(comparator.compare(value, node.getElement()) >= 0)
			return search(node.getRight(), value);
		else
			return search(node.getLeft(), value);
	}
	//------------------------End of Binary Search-------------------------------
	
	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}
}

interface Comparator<T> {
	public int compare(T a, T b);
}

class ProductComparator implements Comparator<Product> {
	public ProductComparator() {
	}
	
	public int compare(Product a, Product b){
		if(a.compareTo(b) > 0) {
			return 1;
		} 
		if(a.compareTo(b) == 0) {
			return 0;
		}
		else {
			return -1;
		}
	}
}