package binarytree;

import java.util.Scanner;

import binarytree.SimpleTreeUtil.Node;

public class SearchInBST {

	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleTree();
		System.out.println("Enter element to search:");
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		System.out.println("data found?"+searchTree(root,data));
		scan.close();
	}
	
	public static boolean searchTree(final Node root, final int data)
	{
		if(root==null)
			return false;
		else if(data<root.data)
			return searchTree(root.left,data);
		else if(data>root.data)
			return searchTree(root.right,data);
		else 
			return true;
	}

}
