package BST;

import Util.ComplexBSTUtil;
import Util.Node;

public class LargestBSTinBT 
{

	public static void main(String[] args) 
	{
		ComplexBSTUtil util = new ComplexBSTUtil();
		Node bst = util.createComplexBST();
		LargestBSTinBT lbst = new LargestBSTinBT();
		MinMax m = lbst.largestBst(bst);
		System.out.println("Size: "+m.size);

	}
	
	private MinMax largestBst(Node root)
	{
		if(root == null)
			return new MinMax();
		
		MinMax left = largestBst(root.getLeft());
		MinMax right = largestBst(root.getRight());
		
		MinMax m = new MinMax();
		
		if(left.isBst == false || right.isBst == false || root.data <= left.max || root.data >= right.min)
		{
			m.isBst = false;
			m.size = Math.max(left.size, right.size);
			return m;
		}
		
		m.isBst = true;
		m.size = 1+left.size + right.size;
		m.min = root.getLeft() != null ? left.min : root.data;
		m.max = root.getRight() != null ? right.max : root.data;
		
		return m;
	}
	
	class MinMax
	{
		boolean isBst;
		int size;
		int min;
		int max;
		
		MinMax()
		{
			isBst = true;
			size = 0;
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
		}
	}
}
