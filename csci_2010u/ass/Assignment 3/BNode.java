/*
	@author: Jude Sheron Balasingam(100504990)
	@title:  Assignment
*/

class BNode {
	public int value;
	public int index;
	public BNode left;
	public BNode right;

	public BNode() {
		left = right = null;
	}

	public BNode(int value, int index) {
		this.value = value;
		this.index = index;
		left = right = null;
	}

	public String toString() {
		String s = "value = " + this.value + " index = " + this.index;
		if (isLeaf()) {
			s += " (Leaf)";
		}
		return s;
	}

	public boolean isLeaf() {
		return this.left == null && this.right == null;
	}

	public boolean hasTwoKids() {
		return this.left != null && this.right != null;
	}
}
