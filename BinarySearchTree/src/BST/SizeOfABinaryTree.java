package BST;

import Util.ComplexBSTUtil;
import Util.Node;
import Util.SimpleBSTUtil;

public class SizeOfABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SizeOfABinaryTree obj = new SizeOfABinaryTree();
		ComplexBSTUtil util = new ComplexBSTUtil();
		
		System.out.println("Size: "+ obj.getSize(util.createComplexBST()));
		System.out.println("Simple tree size: "+obj.getSize(new SimpleBSTUtil().createSimpleBST()));
	}
	
	private int getSize(Node root)
	{
		if(root == null)
			return 0;
		return 1 + getSize(root.getLeft()) + getSize(root.getRight());
	}

}
