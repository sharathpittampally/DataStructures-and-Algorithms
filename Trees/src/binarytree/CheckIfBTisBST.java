package binarytree;

import binarytree.SimpleTreeUtil.Node;

public class CheckIfBTisBST 
{

	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleTree();
		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	public static boolean isBST(final Node root, final int min, final int max)
	{
		if(root == null)
			return true;
		
		if(root.data <= min || root.data >= max)
			return false;
		
		return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
	}
}
