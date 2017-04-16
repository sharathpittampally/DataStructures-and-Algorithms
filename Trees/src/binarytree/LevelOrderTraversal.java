package binarytree;

import java.util.LinkedList;
import java.util.Queue;

import binarytree.SimpleTreeUtil.Node;

public class LevelOrderTraversal 
{

	public static void main(String[] args) 
	{
		final Node root = SimpleTreeUtil.createSimpleTree();
		levelOrderTraversal(root);
	}
	
	public static void levelOrderTraversal(final Node root)
	{
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty() && queue.peek() != null)
		{
			Node temp = queue.peek();
			System.out.print(queue.poll().data+", ");
			queue.add(temp.left);
			queue.add(temp.right);
			
		}
	}

}
