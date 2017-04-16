package binarytree;

import binarytree.SimpleTreeUtil.Node;

public class MorrisInorderTraversal 
{

	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleBinaryTree();
		System.out.println("Inorder with morris traversal method:");
		MorrisInorderTraversal m = new MorrisInorderTraversal();
		m.inorder(root);
	}
	
	public void inorder(final Node root)
	{
		Node current = root;
		while(current != null)
		{
			if(current.left == null)
			{
				System.out.print(current.data+", ");
				current = current.right;
			}
			else
			{
				Node predecessor = current.left;
				while(predecessor.right != current && predecessor.right != null)
				{
					predecessor = predecessor.right;
				}
				
				if(predecessor.right == null)
				{
					predecessor.right = current;
					current = current.left;
				}
				else
				{
					predecessor.right = null;
					System.out.print(current.data+", ");
					current = current.right;
				}
			}
		}
	}

}
