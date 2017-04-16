package BST;

import Util.Node;
import Util.SimpleBSTUtil;

public class MorrisInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleBSTUtil util = new SimpleBSTUtil();
		Node root = util.createSimpleBST();
		System.out.println("Inorder traversal: ");
		MorrisInorderTraversal traversal = new MorrisInorderTraversal();
		traversal.inorderTraversal(root);
	}
	
	private void inorderTraversal(Node root)
	{
		Node curr = root;
		
		while(curr != null)
		{
			if(curr.getLeft() == null)
			{
				System.out.print(curr.data+", ");
				curr = curr.getRight();
			}
			else
			{
			Node predecessor = findPredecessor(curr);
			if(predecessor.getRight() == null)
			{
				predecessor.setRight(curr);
				curr = curr.getLeft();
			}
			else
			{
				predecessor.setRight(null);
				System.out.print(curr.data+", ");
				curr = curr.getRight();
			}
			}
		}
	}
	
	private Node findPredecessor(Node c)
	{
		Node left = c.getLeft();
		while(left.getRight()!=null)
			left = left.getRight();
		return left;
	}

}
