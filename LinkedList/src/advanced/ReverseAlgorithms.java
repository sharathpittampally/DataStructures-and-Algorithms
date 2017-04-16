package advanced;

import java.util.Stack;

import data.Node;
import data.SimpleLinkedListUtil;

public class ReverseAlgorithms 
{
	public static void printReverseIterative(final Node head)
	{
		Stack<Integer> stack = new Stack<>();
		Node temp = head;
		while(temp != null)
		{
			stack.push(temp.getData());
			temp = temp.getLink();
		}
		
		while(!stack.isEmpty())
		{
			System.out.print(stack.pop()+", ");
		}
	}
	
	public static void printReverseRecursive(final Node head)
	{
		if(head.getLink() == null)
		{
			System.out.print(head.getData()+", ");
			return;
		}
		printReverseRecursive(head.getLink());
		System.out.print(head.getData()+", ");
	}
	
	public static void reverseTheLinkedListIterative(final Node head)
	{
		Node prev = null;
		Node curr = head;
		Node next = head.getLink();
		
		while(curr != null)
		{
			curr.setLink(prev);
			prev = curr;
			curr = next;
			if(next != null)
			next = next.getLink();
		}
		//Now printing the reversed linked list
		while(prev != null)
		{
			System.out.print(prev.getData()+", ");
			prev = prev.getLink();
		}
	}
	
	static Node newHead = null;
	public static Node reverseLinkedListRecursive(final Node head)
	{
		if(head.getLink() == null)
		{
			newHead = head;
			return head;
		}
		Node temp = reverseLinkedListRecursive(head.getLink());
		temp.setLink(head);
		head.setLink(null);
		return head;
	}
	
	public static void main(String[] args)
	{
		SimpleLinkedListUtil listUtil = new SimpleLinkedListUtil();
		Node list = listUtil.createLinkedList();
		//print the elements in the linked list in reverse order using iterative method.
		System.out.println("Elements in reverse order iterative:");
		printReverseIterative(list);
		//print the elements in the linked list in reverse order using the recursive method.
		System.out.println("\nElements in reverse order recursive:");
		printReverseRecursive(list);
		//Now reverse the linked list iterative
		System.out.println("\n");
		reverseTheLinkedListIterative(list);
		//Now reverse linked list recursive way.
		reverseLinkedListRecursive(new SimpleLinkedListUtil().createLinkedList());
		System.out.println("\n Reversed linked list using recursive way:");
		while(newHead != null)
		{
			System.out.print(newHead.getData()+ ", ");
			newHead = newHead.getLink();
		}
	}
}
