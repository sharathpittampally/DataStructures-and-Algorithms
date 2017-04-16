package BST;

import java.util.ArrayList;
import java.util.List;

import Util.Node;
import Util.SimpleBSTUtil;

public class RootToLeafSumBT 
{
	List<Integer> path = new ArrayList<>();
	public static void main(String[] args) 
	{
		RootToLeafSumBT obj = new RootToLeafSumBT();
		
		SimpleBSTUtil util = new SimpleBSTUtil();
		
		System.out.println("Path: "+obj.findRootToLeafSum(util.createSimpleBST(), 37));
	}
	
	private List findRootToLeafSum(Node root, int sum)
	{
		if(root.getLeft() == null && root.getRight() == null && sum == root.data)
		{
			path.add(root.data);
		}
		
		if(root.getLeft() != null)
		{
			path = findRootToLeafSum(root.getLeft(), sum - root.data);
			if(path.size() > 0)
			{
				path.add(root.data);
				return path;
			}
		}
		
		if(root.getRight() != null)
		{
			path = findRootToLeafSum(root.getRight(), sum - root.data);
			if(path.size() > 0)
			{
				path.add(root.data);
				return path;
			}
		}
		return path;
	}
}
