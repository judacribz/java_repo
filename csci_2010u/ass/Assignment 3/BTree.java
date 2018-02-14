/*
	@author: Jude Sheron Balasingam(100504990)
	@title:  Assignment
*/

import java.util.ArrayList;

class BTree {
  	public BNode root;
  	public BNode temp;
  	public BNode temp2;
  	public String line;
  	public ArrayList<Integer> results;
  	public ArrayList<Integer> list; //list of numbers

  	public BTree() {
    	root = null;
  	}

  	//---------------------------------Insert----------------------------------------------
  	public void insert(int value, int index) {
    	if (root == null)
   	  		root = new BNode(value, index);
    	else
      		insert(root, value, index);
  	}

  	public void insert(BNode node, int value, int index) {
    	if (value <= node.value) {
      		if (node.left == null)
        		node.left = new BNode(value, index);
      		else
        		insert(node.left, value, index);
    	}
   	 	else {
      		if (node.right == null)
        		node.right = new BNode(value, index);
      		else
        		insert(node.right, value, index);
    	}
	}
	//---------------------------------End of Insert----------------------------------------

	//---------------------------------Insert AVL-------------------------------------------
  	public void insertAVL(int value, int index) {
    	BNode node = new BNode(value, index);
		this.root = insertAVL(this.root, node, index);
	}

	public BNode insertAVL(BNode _root, BNode newNode, int index) {
		if(_root == null)
			_root = newNode;
		else if(_root.left == null && _root.right != null && _root.right.isLeaf()) {
			if(newNode.value > _root.value) {
				_root.left = new BNode(_root.value, _root.index);
				_root.value = newNode.value;
				_root.index = newNode.index;
			}
			else
				_root.left = newNode;
		}
		else if(_root.right == null && _root.left != null && _root.left.isLeaf() ) {
			if(newNode.value <= _root.value) {
				_root.right = new BNode(_root.value, _root.index);
				_root.value = newNode.value;
				_root.index = newNode.index;
			}
			else
				_root.right = newNode;
		}
		else {
			if(newNode.value <= _root.value)
				_root.left = this.insertAVL(_root.left, newNode, index);
			else
				_root.right = this.insertAVL(_root.right, newNode, index);
		}

		return BalanceCheck(_root);
	}

	//---------------Checks for AVL Condition---------------
	public BNode BalanceCheck(BNode _root) {
		if(_root.hasTwoKids()) {
			if(height(_root.left) - height(_root.right) ==2) {
				if(height(_root.left.right) > height(_root.left.left)) 
					_root = LeftRightRotation(_root); //Right-Left-Heavy Tree 
				else if(height(_root.left.right) < height(_root.left.left))
					_root = RightRotation(_root); // Left Heavy Tree
			}
			else if(height(_root.right) - height(_root.left) ==2) {
				if(height(_root.right.left) > height(_root.right.right))
					_root = RightLeftRotation(_root); //Left-Right-Heavy Tree 
				else if(height(_root.right.left) < height(_root.right.right))
					_root = LeftRotation(_root); // Right Heavy Tree
			}
		}

		return _root;
	}
	//---------------End of AVL Condition Check---------------

	//------------------Rotation methods------------------
	public BNode RightLeftRotation(BNode _root) {
		temp = _root.right;
		_root.right = _root.right.left;
		if(_root.right.left == null) {
			temp2 = _root.right;
			_root.right = _root.right.right;
			temp2.right = null;
			_root.right.left = temp2;
		}
		temp.left = null;
		_root.right.right = temp;

		return LeftRotation(_root);
	}
	public BNode LeftRotation(BNode _root) {
		temp = _root;
		_root = _root.right;
		temp.right = null;
		temp2 = _root.left;
		_root.left = temp;
		_root.left.right = temp2;

		return _root;
	}

	public BNode LeftRightRotation(BNode _root) {
		temp = _root.left;
		_root.left = _root.left.right;
		if(_root.left.right == null) {
			temp2 = _root.left;
			_root.left = _root.left.left;
			temp2.left = null;
			_root.left.right = temp2;
		}
		temp.right = null;
		_root.left.left = temp;

		return RightRotation(_root);
	}

	public BNode RightRotation(BNode _root) {
		temp = _root;
		_root = _root.left;
		temp.left = null;
		temp2 = _root.right;
		_root.right = temp;
		_root.right.left = temp2;

		return _root;
	}
	//---------------End of Rotation methods---------------
	//---------------------------End of Insert AVL-------------------------------------

  	public void show() {
    	show(root);
  	}

  	public void show(BNode node) {
    	if (node != null) {
      		show(node.left);
      	System.out.println(node);
      		show(node.right);
    	}
  	}

  	public int height(BNode node) {
		if (node == null)
			return 0;
		else {
			if(node.isLeaf()) //node is not a leaf
				return 0;
			else //node is a leaf
				return 1 + Math.max(height(node.left), height(node.right));
		}
	}

	//---------------------------------Search function-------------------------------------------
	public void search(int value) {
		this.results = new ArrayList<Integer>();
		search(value, this.root);
	}

	private void search(int value, BNode node) {
		if(node==null) {
			if(results.size() == 0)
				results.add(-1);
			
			return;
		}

		if(node.value == value) {
			results.add(node.index);
			search(value, node.left);
			search(value, node.right);
		}
		else if(value <= node.value)
			search(value, node.left);
		else
			search(value, node.right);
	}
	//---------------------------------end of Search-------------------------------------------

	//-----------------------------------At function-------------------------------------------
	public void at(int index) {
		this.results = new ArrayList<Integer>();
		this.at(this.root, index);
	}

	public void at(BNode node, int index) {
		if(node==null)
			return;

		if(node.index == index) {
			this.results.add(node.value);
			return;
		}
		at(node.left, index);
		at(node.right, index);
	}
	//-----------------------------------End of At-------------------------------------------

	public void print_dot() {
		line = "\ndigraph G {\n";
    	print_dot(this.root);
    	line += "}";	
    	System.out.println(line);
	}	
	
	public void print_dot(BNode n) {
		if (n == null) 
			return;

		if (n.hasTwoKids()) {
			line += (n.value + "(" + n.index + ")" + "\t->\t" + n.left.value + "(" + n.left.index + ")\t[label=l];\n");
			line += (n.value + "(" + n.index + ")" + "\t->\t" + n.right.value + "(" + n.right.index + ")\t[label=r];\n");
			print_dot(n.right);
			print_dot(n.left);
		}
		else {
	    	if (n.left != null) {
	     		line += (n.value + "(" + n.index + ")" + "\t->\t" + n.left.value + "(" + n.left.index + ")\t[label=l];\n"); 
	    		print_dot(n.left);
	    	}

	    	else if (n.right != null) {
	      		line += (n.value + "(" + n.index + ")" + "\t->\t" + n.right.value + "(" + n.right.index + ")\t[label=r];\n");
	    		print_dot(n.right);
	    	}
		}
	}
}