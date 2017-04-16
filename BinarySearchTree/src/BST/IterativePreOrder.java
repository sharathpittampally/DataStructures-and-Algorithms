package BST;

import java.util.Stack;

import Util.Node;
import Util.SimpleBSTUtil;

public class IterativePreOrder {
	public static void main(String[] args)
	{
		SimpleBSTUtil util = new SimpleBSTUtil();
		System.out.println("Iterative pre order traversal: ");
		new IterativePreOrder().iterativePreOrder(util.createSimpleBST());			
	}
	
	public void iterativePreOrder(final Node root)
	{
		Stack<Node> stack = new Stack<>();
		if(root == null)
			return;
		stack.push(root);
		while(!stack.isEmpty())
		{
			Node curr = stack.pop();
			System.out.println(curr.data+", ");
			if(curr.getRight()!= null)
				stack.push(curr.getRight());
			if(curr.getLeft() != null)
				stack.push(curr.getLeft());
		}
	}
}
