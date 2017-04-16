package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import binarytree.SimpleTreeUtil.Node;

public class RootToLeafSum 
{

	public static void main(String[] args) 
	{
		Node root = SimpleTreeUtil.createSimpleTree();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the sum:");
		int sum = s.nextInt();
		s.close();
		List<Integer> result = new ArrayList<>();
		if(rootToLeafSum(root, sum, result))
		{
			System.out.println("path: "+result);
		}
		else
		{
			System.out.println("No path");
		}
	}
	
	public static boolean rootToLeafSum(Node root, int sum, List<Integer> result)
	{
		if(root == null)
			return false;
		if(root.left == null && root.right == null)
		{
			if(root.data == sum)
			{
				result.add(root.data);
				return true;
			}
			return false;
		}
		if(rootToLeafSum(root.left, sum - root.data, result))
				{
					result.add(root.data);
					return true;
				}
		if(rootToLeafSum(root.right, sum - root.data, result))
		{
			result.add(root.data);
			return true;
		}
		return false;
	}

}
