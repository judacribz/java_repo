
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
	//----------------------------End of Insert-----------------------------------*/

	/*--------------------------Insert a node (with avl)--------------------------//	
	public void insert_avl(T value)
	{
		
	}	
	//----------------------------End of Insert-----------------------------------*/

	/*--------------------------Print dot-----------------------------------------//	
	public void print_dot()
	{
		// Print out the graph in dot format as follows
		//
		// <root node>
		// <node> -> <child node>
		// ...
		//
		// For more information, see http://www.graphviz.org/Documentation/dotguide.pdf
		
	}	
	//----------------------------End of Insert-----------------------------------*/
		
}