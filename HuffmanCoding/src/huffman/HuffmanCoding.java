package huffman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HuffmanCoding 
{
	public static void main(String[] args) 
	{	
		HuffmanCoding hc = new HuffmanCoding();
		char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
		int[] probs = new int[]{5,9,12,13,16,45};
		
		Node n1 = new Node('a', probs[0]);
		Node n2 = new Node('b', probs[1]);
		Node n3 = new Node('c', probs[2]);
		Node n4 = new Node('d', probs[3]);
		Node n5 = new Node('e', probs[4]);
		Node n6 = new Node('f', probs[5]);
		
		List<Node> nodes = new ArrayList<>();
		
		nodes.add(n1);
		nodes.add(n2);
		nodes.add(n3);
		nodes.add(n4);
		nodes.add(n5);
		nodes.add(n6);
		
		final Comparator<Node> nodesComparator = (node1, node2) -> {
			if(node1.getProb() > node2.getProb())
				return 1;
			else if(node1.getProb() == node2.getProb())
				return 0;
			return -1;
		};
		
		Collections.sort(nodes, nodesComparator);
		Node root = hc.createTree(nodes.get(0), nodes.get(1));
		Node finalRoot = hc.buildTree(root, nodes);
		hc.assignCodes(finalRoot);
		
		//print codes
		for(Node node : nodes)
		{
			System.out.println(node.getLetter() +" : "+node.getCode());
		}
		
	}
	
	
	
	Node createTree(Node nod1, Node nod2)
	{
		Node n = new Node('\n', nod1.getProb() + nod2.getProb());
		n.setLeft(nod1);
		n.setRight(nod2);
		nod1.setParent(n);
		nod2.setParent(n);
		return n;
	}
	
	Node buildTree(Node root, List<Node> nodes)
	{
		Node current = root;
		for(int i = 2; i< nodes.size(); i++)
		{
			Node temp = nodes.get(i);
			if(temp.getProb() < current.getProb())
			{
				Node newNode = new Node('\n', current.getProb() + temp.getProb());
				newNode.setLeft(temp);
				newNode.setRight(current);
				temp.setParent(newNode);
				current.setParent(newNode);
				current = newNode;
			}
			else
			{
				Node newNode = new Node('\n', current.getProb() + temp.getProb());
				newNode.setLeft(current);
				newNode.setRight(temp);
				temp.setParent(newNode);
				current.setParent(newNode);
				current = newNode;
			}
		}
		return current;
	}
	
	void assignCodes(Node root)
	{
		if(root == null)
			return;
		if(root.getParent() == null)
		{
			root.setCode("noop");
			return;
		}
		if(root.equals(root.getParent().getLeft()))
		{
			String code = null;
			if(root.getParent().getCode() != "noop")
			{
				code = root.getParent().getCode() + root.getParent().leftbit;
			}
			else
			{
				code = root.getParent().leftbit;
			}
			root.setCode(code);
		}
		else if(root.equals(root.getParent().getRight()))
		{
			String code = null;
			if(root.getParent().getCode() != "noop")
			{
				code = root.getParent().getCode() + root.getParent().rightbit;
			}
			else
			{
				code = root.getParent().rightbit;
			}
			root.setCode(code);
		}
		assignCodes(root.getLeft());
		assignCodes(root.getRight());
	}
	
}
