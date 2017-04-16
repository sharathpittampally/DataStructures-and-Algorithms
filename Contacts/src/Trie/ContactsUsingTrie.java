package Trie;

import java.util.Scanner;

public class ContactsUsingTrie {

	
	class Node
	{
		Node[] children = new Node[26];
		int noOfChildren;
		
		private void add(final String word, int index)
		{
			noOfChildren++;
			if(index == word.length())
				return;
			char x = word.charAt(index);
			int indexOfChar = x - 'a';
			Node nodeAtThatIndex = children[indexOfChar];
			Node child = null;
			if(nodeAtThatIndex == null)
			{
				child = new Node();
				children[indexOfChar] = child;
			}
			children[indexOfChar].add(word, index+1);
		}
		
		private int findWordCount(String prefix, int index)
		{
			if(index == prefix.length())
				return noOfChildren;
			char c = prefix.charAt(index);
			int indexOfC = c - 'a';
			Node child = children[indexOfC];
			if(child != null)
			{
				return child.findWordCount(prefix, index+1);
			}
			else
				return 0;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the strings");
		ContactsUsingTrie trie = new ContactsUsingTrie();
		Node root = trie.new Node();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++)
		{
			String word = s.next();
			root.add(word, 0);
		}
		System.out.println("Enter the starting prefix: ");
		String pref = s.next();
		System.out.println("starting with "+pref+": "+root.findWordCount(pref, 0));
		s.close();
	}

}
