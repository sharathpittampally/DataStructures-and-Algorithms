package binarytree;

import java.util.Scanner;

import binarytree.SimpleTreeUtil.Node;

public class BSTIterativeInsertion 
{

	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleTree();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter element to insert:");
		int elem = s.nextInt();
		System.out.println("Pre-order before insertion:");
		DFSTraversal.preOrderTraversal(root);
		System.out.println("\n\nPre-order after insertion:");
		DFSTraversal.preOrderTraversal(insert(root, elem));
		s.close();
	}
	
	public static Node insert(final Node root, final int data)
	{
		Node n = new Node(data);
		Node current = root;
		Node parent = root;
		if(root==null)
			return n;
		while(current != null)
		{
			parent = current;
			if(data > current.data)
			{
				current = current.right;
			}
			else if(data < current.data)
			{
				current = current.left;
			}
		}
		
		if(data > parent.data)
			parent.right = n;
		else
			parent.left = n;
		return root;
	}
}
