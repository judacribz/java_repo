
public class LinkedBinaryTree<T>
{
	protected BTNode<T> root;
	private String line;
	private Comparator<T> comparator;
	private BTNode<T> temp, temp2;
	
	//Create an empty binary tree
	public LinkedBinaryTree() {
		root = null;
	}	
	
	public BTNode<T> getRootElement() throws Exception {
		if(root == null)
			throw new Exception("Get root operation failed. The tree is empty");
		return root;
	}
	
	public LinkedBinaryTree getLeft() throws Exception {
		if(root == null)
			throw new Exception("Get Left tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getLeft();
		return result;
	}
	
	public LinkedBinaryTree getRight() throws Exception {
		if(root == null)
			throw new Exception("Get right tree failed. The tree is empty.");
		LinkedBinaryTree result = new LinkedBinaryTree();
		result.root = root.getRight();
		return result;
	}
	
	public void inorder() {
		inorder(this.root);
	}
	
	public void inorder(BTNode<T> _root) {
		if(_root != null) {
			inorder(_root.getLeft());
			System.out.println(_root.getElement().toString());
			inorder(_root.getRight());
		}
	}
	
	//--------------------------Insert a node-------------------------------------//	
	public void insert(T value) {
		BTNode<T> node = new BTNode<T>(value);
		this.root = this.insert(root, node);
	}
	
	public BTNode<T> insert(BTNode<T> _root, BTNode<T> newNode) {

		if(_root == null)
			_root = newNode;
		else if(comparator.compare(_root.getElement(), newNode.getElement()) ==1)
			_root.setLeft(this.insert(_root.getLeft(), newNode));
		else
			_root.setRight(this.insert(_root.getRight(), newNode));

		return _root;
	}
	//----------------------------End of Insert-----------------------------------//

	//--------------------------Insert a node (with avl)--------------------------//	
	public void insert_avl(T value) {
		BTNode<T> node = new BTNode<T>(value);
		this.root = this.insert_avl(root, node);
	}

	public BTNode<T> insert_avl(BTNode<T> _root, BTNode<T> newNode) {
		if (_root == null)
			_root = newNode;
		else if(_root.getLeft() == null)
			_root.setLeft(newNode);
		else if(_root.getRight() == null)
			_root.setRight(newNode);
		else {
			if(comparator.compare(_root.getElement(), newNode.getElement()) == 1)
				_root.setLeft(this.insert_avl(_root.getLeft(), newNode));
			else
				_root.setRight(this.insert_avl(_root.getRight(), newNode));
		}
		_root = BalanceCheck(_root);

		return _root;
	}

	public BTNode<T> BalanceCheck(BTNode<T> _root) {
		if(_root.getLeft() != null && _root.getRight() != null) {
			if(height(_root.getLeft()) - height(_root.getRight()) >=2) {
				//Right-Left-Heavy Tree 
				if(height(_root.getLeft().getRight()) > height(_root.getLeft().getLeft())) 
					_root = LeftRightRotation(_root);
				else // Left Heavy Tree
					_root = RightRotation(_root);
			}
			else if(height(_root.getRight()) - height(_root.getLeft()) >=2) {
				//Left-Right-Heavy Tree 
				if(height(_root.getRight().getLeft()) > height(_root.getRight().getRight())) 
					_root = RightLeftRotation(_root);
				else // Right Heavy Tree
					_root = LeftRotation(_root);
			}
		}

		return _root;
	}

	public BTNode<T> RightLeftRotation(BTNode<T> _root) {
		temp = _root.getRight();
		_root.setRight(_root.getRight().getLeft());
		temp.setLeft(null);
		_root.getRight().setRight(temp);

		return LeftRotation(_root);
	}
	public BTNode<T> LeftRotation(BTNode<T> _root) {
		temp = _root;
		_root = _root.getRight();
		temp.setRight(null);
		temp2 = _root.getLeft();
		_root.setLeft(temp);
		_root.getLeft().setRight(temp2);

		return _root;
	}

	public BTNode<T> LeftRightRotation(BTNode<T> _root) {
		temp = _root.getLeft();
		_root.setLeft(_root.getLeft().getRight());
		temp.setRight(null);
		_root.getLeft().setLeft(temp);

		return LeftRotation(_root);
	}
	public BTNode<T> RightRotation(BTNode<T> _root) {
		temp = _root;
		_root = _root.getLeft();
		temp.setLeft(null);
		temp2 = _root.getRight();
		_root.setRight(temp);
		_root.getRight().setLeft(temp2);

		return _root;
	}
	//----------------------------End of Insert-----------------------------------//

	//--------------------------Print dot-----------------------------------------//	
	public void print_dot() {
		line = "\ndigraph G {\n";
    	print_dot(this.root);
    	line += "}";	
    	System.out.println(line);
	}	
	
	public void print_dot(BTNode<T> n) {
		if (n == null) 
			return;

		if (n.getLeft() != null && n.getRight() != null) {
			line += (n.getElement() + "\t->\t" + n.getLeft().getElement() + "\t[label=l];\n");
			line += (n.getElement() + "\t->\t" + n.getRight().getElement() + "\t[label=r];\n");
			print_dot(n.getRight());
			print_dot(n.getLeft());
		}
		else {
	    	if (n.getLeft() != null) {
	     		line += (n.getElement() + "\t->\t" + n.getLeft().getElement() + "\t[label=l];\n"); 
	    		print_dot(n.getLeft());
	    	}

	    	else if (n.getRight() != null) {
	      		line += (n.getElement() + "\t->\t" + n.getRight().getElement() + "\t[label=r];\n");
	    		print_dot(n.getRight());
	    	}
		}
	}
	//----------------------------End of Insert-----------------------------------//

	//--------------------------Get height----------------------------------------//
	public int height(BTNode<T> node) {
		if (node == null)
			return 0;
		else {
			if(node.getLeft() != null || node.getRight()!=null) //node is not a leaf
				return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
			else //node is a leaf
				return 0;
		}
	}
	//----------------------------End of Height-----------------------------------//

	public void setComparator(Comparator comparator) {
		this.comparator = comparator;
	}		
}

