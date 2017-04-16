package BST;

import java.util.Stack;

import Util.Node;
import Util.SimpleBSTUtil;

public class IterativeInorderTraversal 
{

	public static void main(String[] args) 
	{
		SimpleBSTUtil util = new SimpleBSTUtil();
		System.out.println("Iterative inorder traversal");
		IterativeInorderTraversal iit = new IterativeInorderTraversal();
		iit.inorderTraversal(util.createSimpleBST());
	}
	
	public void inorderTraversal(Node root){
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty())
		{
			if(root == null)
			{
				Node temp = stack.pop();
				System.out.print(temp.data);
				root = temp.getRight();
			}
			else
			{
				stack.push(root.getLeft());
				root = root.getLeft();
			}
		}
	}
}
