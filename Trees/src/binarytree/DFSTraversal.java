package binarytree;

import binarytree.SimpleTreeUtil.Node;

/**
 * Preorder - root-left-right
 * Inorder - left-root-right
 * postorder - left-right-right
 * @author sharath
 */
public class DFSTraversal 
{

	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleTree();
		System.out.println("Pre-order-traversal:");
		preOrderTraversal(root);
		System.out.println("\n\nIn-order-traversal:");
		inOrderTraversal(root);
		System.out.println("\n\nPost-order-traversal");
		postOrderTraversal(root);
	}
	
	public static void preOrderTraversal(final Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+", ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	
	public static void inOrderTraversal(final Node root)
	{
		if(root==null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.data+", ");
		inOrderTraversal(root.right);
	}
	
	public static void postOrderTraversal(final Node root)
	{
		if(root==null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data+", ");
	}

}
