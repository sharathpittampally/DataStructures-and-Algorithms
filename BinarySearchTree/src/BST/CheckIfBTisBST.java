package BST;

import Util.Node;
import Util.SimpleBSTUtil;

public class CheckIfBTisBST 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Node bst = new SimpleBSTUtil().createSimpleBST();
		System.out.println("is BST? : "+isBst(bst, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
	
	public static boolean isBst(Node root, int min, int max)
	{
		if(root == null)
			return true;
		if(root.data > min && root.data < max)
		{
			return (isBst(root.getLeft(), min, root.data) && isBst(root.getRight(), root.data, max));
		}
		return false;
	}
}
