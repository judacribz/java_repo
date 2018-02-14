import java.lang.*;

public class Node {

	public int id;
	public Object value;
	public Node nextNode;
	public Node previousNode;
	

	public void setNext(Node node) {
		nextNode = new Node;
		this.node = nextNode;
	}

	public void setPrevious(Node node) {
		previousNode = new Node;
		this.node = previousNode;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getNext {
		return nextNode;
	}

	public Node getPrevious {
		return previousNode;
	}

	public Object getValue {
		return value;
	}
}