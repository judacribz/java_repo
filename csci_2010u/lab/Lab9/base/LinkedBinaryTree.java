
public class LinkedBinaryTree
{
	protected BTNode<String> root;
	
	//Create an empty binary tree
	public LinkedBinaryTree()
	{
		root = null;
	}
	
	//Create a binary tree with specified element as root
	public LinkedBinaryTree(String element)
	{
		root = new BTNode<String>(element);
	}
	
	//Create a binary tree with two specified subtrees
	public LinkedBinaryTree(String element, LinkedBinaryTree left, LinkedBinaryTree right)
	{
		root = new BTNode<String>(element);
		root.setLeft(left.root);
		root.setRight(right.root);
	}
	
	public BTNode<String> getRootElement() throws Exception
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
	
	/*-------------Calculate height of tree--------------
	public int height()
	{
		
	}
	----------------------------------------------------*/
	
	/*--------------Spin a tree here-------------------------
	
	--------------------------------------------------*/
}