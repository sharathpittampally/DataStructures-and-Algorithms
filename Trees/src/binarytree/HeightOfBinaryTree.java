package binarytree;

import binarytree.SimpleTreeUtil.Node;

public class HeightOfBinaryTree 
{

	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleTree();
		System.out.println("Height of the tree: "+height(root));
	}
	
	public static int height(final Node root)
	{
		if(root == null)
			return -1;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
}
