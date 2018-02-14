
public class questions {
	void q1() 
	{
		LinkedBinaryTree n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13;
		n8 = new LinkedBinaryTree("node_8");
		n9 = new LinkedBinaryTree("node_9");
		n4 = new LinkedBinaryTree("node_4", n8, n9);
		
		n10 = new LinkedBinaryTree("node_10");
		n11 = new LinkedBinaryTree("node_11");
		n5 	= new LinkedBinaryTree("node_5", n10, n11);
		
		n12 = new LinkedBinaryTree("node_12");
		n13 = new LinkedBinaryTree("node_13");
		n6  = new LinkedBinaryTree("node_6", n12, n13);
		
		n7 	= new LinkedBinaryTree("node_7");
		n2  = new LinkedBinaryTree("node_2", n4, n5);
		n3	= new LinkedBinaryTree("node_3", n6, n7);
		
		LinkedBinaryTree root = new LinkedBinaryTree("root", n2, n3);		
		//-------Calculate tree height-----------
		int h = root.height();
		System.out.println("Height is " + h);
		
	}
	
	void q2()
	{
		LinkedBinaryTree n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13;
		n8 = new LinkedBinaryTree("node_8");
		n9 = new LinkedBinaryTree("node_9");
		n4 = new LinkedBinaryTree("node_4", n8, n9);
		
		n10 = new LinkedBinaryTree("node_10");
		n11 = new LinkedBinaryTree("node_11");
		n5 	= new LinkedBinaryTree("node_5", n10, n11);
		
		n12 = new LinkedBinaryTree("node_12");
		n13 = new LinkedBinaryTree("node_13");
		n6  = new LinkedBinaryTree("node_6", n12, n13);
		
		n7 	= new LinkedBinaryTree("node_7");
		n2  = new LinkedBinaryTree("node_2", n4, n5);
		n3	= new LinkedBinaryTree("node_3", n6, n7);
		
		LinkedBinaryTree root = new LinkedBinaryTree("root", n2, n3);
		
		//-----Spin a tree---------
		try {
			BTNode<String> _r0 = root.getRootElement();
			System.out.print(_r0.getLeft().getElement() + "\t");
			System.out.println(_r0.getRight().getElement());
			
			BTNode<String> _r0_l = _r0.getLeft();
			BTNode<String> _r0_r = _r0.getRight();
			System.out.print(_r0_l.getLeft().getElement() + "\t");
			System.out.println(_r0_l.getRight().getElement());
			
			root.spins(root.getRootElement());
			BTNode<String> _r = root.getRootElement();
			System.out.print(_r.getLeft().getElement() + "\t");
			System.out.println(_r.getRight().getElement());
			
			BTNode<String> _r_l = _r.getLeft();
			BTNode<String> _r_r = _r.getRight();
			System.out.print(_r_r.getLeft().getElement() + "\t");
			System.out.println(_r_r.getRight().getElement());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//---------------------------
	}	
}
