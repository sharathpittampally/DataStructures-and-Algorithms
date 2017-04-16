package BST;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import Util.Node;
import Util.SimpleBSTUtil;

public class KthSmallestElementInBST {

	public static void main(String[] args)
	{
		SimpleBSTUtil bst = new SimpleBSTUtil();
		Node root = bst.createSimpleBST();
		System.out.println("Enter value of K: ");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		inOrderTraversal(root);
		System.out.println("Kth smallest :" + list.get(k-1));
		System.out.println("list: "+list);
		s.close();
	}
	
	static List<Integer> list = new ArrayList<>(); 
	
	public static void inOrderTraversal(Node root)
	{
		if(root == null)
		{
			return;
		}
		inOrderTraversal(root.getLeft());
		list.add(root.data);
		inOrderTraversal(root.getRight());
	}
	
}
