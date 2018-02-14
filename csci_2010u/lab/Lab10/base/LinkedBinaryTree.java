
public class LinkedBinaryTree<T>
{
	protected BTNode<T> root;
	
	
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
	
	/*--------------------------Insert a node-------------------------------------//	
	public void insert(T value)
	{
		
	}
	
	public BTNode<T> insert(BTNode<T> _root, BTNode<T> newNode)
	{
		
	}
	//----------------------------End of Insert-----------------------------------*/
	
	/*------------------------------Binary Search----------------------------------//
	public BTNode<T> search(T value)
	{
		
	}
	
	public BTNode<T> search(BTNode<T> node, T value)
	{
		
	}
	//------------------------End of Binary Search-------------------------------*/
}