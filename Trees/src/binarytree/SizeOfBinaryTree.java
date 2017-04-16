package binarytree;

import binarytree.SimpleTreeUtil.Node;

public class SizeOfBinaryTree 
{	
	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleTree();
		System.out.println("Size: "+size(root));
	}
	
	public static int size(final Node root)
	{
		if(root==null)
			return 0;
		 int leftSize = size(root.left);
		 int rightSize = size(root.right);
		 return leftSize + rightSize + 1;
	}
}
