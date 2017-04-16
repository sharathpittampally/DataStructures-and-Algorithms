package binarytree;

public class SimpleTreeUtil 
{
	private static final Node root, node10, node20, node30, node50, node60, node70;
	private static final Node rootBt, rnode18, lnode18, rnode20, lnode25, rnode50, rnode60, anode20, lnode40, alnode25, node19, node15, node35, node55, lnode70;
	
	static
	{
		root = new Node(40);
        node20 = new Node(20);
		node10 = new Node(10);
		node30 = new Node(30);
		node60 = new Node(60);
		node50 = new Node(50);
		node70 = new Node(70);
		
		
		rootBt = new Node(25);
		rnode18 = new Node(18);
		node19 = new Node(19);
		node15 = new Node(15);
		rnode20 = new Node(20);
		lnode18 = new Node(18);
		lnode25 = new Node(25);
		rnode50 = new Node(50);
		node35 = new Node(35);
		anode20 = new Node(20);
		alnode25 = new Node(25);
		lnode40 = new Node(40);
		rnode60 = new Node(60);
		node55 = new Node(55);
		lnode70 = new Node(70);
	}
	
	public static Node createSimpleTree()
	{
		root.left = node20;
		root.right = node60;
		node20.left = node10;
		node20.right = node30;
		node60.left = node50;
		node60.right = node70;
		return root;
	}
	
	public static Node createSimpleBinaryTree()
	{
		rootBt.left = rnode18;
		rootBt.right = rnode50;
		rnode18.left = node19;
		rnode18.right = rnode20;
		node19.right = node15;
		node19.left = null;
		node20.left = lnode18;
		node20.right = lnode25;
		rnode50.left = node35;
		rnode50.right = rnode60;
		node35.left = anode20;
		anode20.right = lnode25;
		node35.right = lnode40;
		rnode60.left = node55;
		rnode60.right = lnode70;
		return rootBt;
	}
	
	public static class Node
	{
	    int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data = data;
		}
	}
}
