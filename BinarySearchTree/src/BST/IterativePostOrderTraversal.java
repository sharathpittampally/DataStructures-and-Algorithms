package BST;

import java.util.Stack;

import Util.ComplexBSTUtil;
import Util.Node;

public class IterativePostOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterativePostOrderTraversal pot = new IterativePostOrderTraversal();
		ComplexBSTUtil util = new ComplexBSTUtil();
		pot.postOrderTraversal(util.createComplexBST());
	}
	
	private void postOrderTraversal(Node root)
	{
		Stack<Node> stack = new Stack<>();
		
		stack.push(root);
		Node curr = root;
		while(!stack.isEmpty())
		{
			curr = curr.getLeft();
			if(curr == null)
			{
				curr = stack.peek().getRight();
				if(curr == null)
				{
					System.out.println(stack.pop().data);
					curr = stack.peek().getRight();
					if(curr == null)
						System.out.println(stack.pop().data);
				}
			}
			else
			{
				stack.push(curr);
			}
		}
	}

}
