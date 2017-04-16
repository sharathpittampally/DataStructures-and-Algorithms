package Util;

public class ComplexBSTUtil 
{
	public Node createComplexBST()
	{
		Node n1 = new Node(25,null,null);//
		Node n2 = new Node(18,null,null);//
		Node n3 = new Node(50,null,null);//
		
		Node n4 = new Node(19,null,null);//
		Node n5 = new Node(20,null,null);//
		
		Node n6 = new Node(35,null,null);//
		Node n7 = new Node(60,null,null);//
		Node n8 = new Node(15,null,null);//
		Node n9 = new Node(18,null,null);//
		Node n10 = new Node(25,null,null);//
		Node n11 = new Node(20,null,null);//
		Node n12 = new Node(40,null,null);//
		Node n13 = new Node(55,null,null);//
		Node n14 = new Node(70,null,null);//
		Node n15 = new Node(25,null,null);//
		
		n1.setLeft(n2);n1.setRight(n3);
		
		n2.setLeft(n4);n2.setRight(n5);
		
		n4.setRight(n8);
		
		n5.setLeft(n9); n5.setRight(n10);
		
		n3.setLeft(n6); n3.setRight(n7);
		
		n7.setLeft(n13); n7.setRight(n14);
		
		n6.setLeft(n11); n6.setRight(n12);
		
		n11.setRight(n15);
		
		return n1;
		
	}
}
