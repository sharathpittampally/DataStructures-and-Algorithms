package BST;

import Util.Node;
import Util.SimpleBSTUtil;

public class SimpleOperations 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node simpleBst = new SimpleBSTUtil().createSimpleBST();
		
		//insert a node
		Node newTree = insert(simpleBst, 16);
		//delete a node
		
		//search a node
		System.out.println(search(newTree, 16));
		
		//min
		System.out.println("minimum element in the BST: "+findMin(simpleBst));
		System.out.println("maximum element in the BST: "+findMax(simpleBst));
		
		//height
		System.out.println("height of BST: "+ height(simpleBst));
	}
	
	public static Node insert(Node root, int data)
	{	
		if(root == null)
		{
			return new Node(data, null, null);
		}
		if(data > root.data)
			root.setRight(insert(root.getRight(), data));
		else if(data < root.data)
			root.setLeft(insert(root.getLeft(), data));
		return root;
	}
	
	public static boolean search(Node root, int data)
	{
		if(root == null)
			return false;
		if(data == root.data)
			return true;
	    if(data > root.data)
			return search(root.getRight(), data);
		else
			return search(root.getLeft(), data);
	}
	
	public static int findMin(Node root)
	{
		//left most is the minimum
		if(root.getLeft() == null)
			return root.data;
		return findMin(root.getLeft());
	}
	
	public static int findMax(Node root)
	{
		//right most is the maximum
		if(root.getRight() == null)
			return root.data;
		return findMax(root.getRight());
	}
	
	public static int height(Node root)
	{
		if(root == null)
			return -1;
		int left = 1 + height(root.getLeft());
		int right = 1 + height(root.getRight());
		return Math.max(left, right);
	}
}
