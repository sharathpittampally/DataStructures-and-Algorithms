package Util;

public class SimpleBSTUtil 
{
	public Node createSimpleBST()
	{
		Node n1 = new Node(8,null,null);
		Node n2 = new Node(12,null,null);
		Node n3 = new Node(10,null,null);
		Node n4 = new Node(15,null,null);
		Node n5 = new Node(17,null,null);
		Node n6 = new Node(20,null,null);
		Node n7 = new Node(25,null,null);
		
		n4.left = n3;
		n4.right = n6;
		n3.left = n1;
		n3.right = n2;
		n6.left = n5;
		n6.right = n7;
		n1.left = null;
		n1.right = null;
		n2.left = null;
		n2.right = null;
		n5.left = null;
		n5.right = null;
		n7.left = null;
		n7.right = null;
		
		return n4;
	}
}
