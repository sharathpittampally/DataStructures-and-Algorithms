package data;

public class SimpleLinkedListUtil 
{
	public Node createLinkedList()
	{
		Node temp = null;
		Node head = null;
		for(int i=0;i<10;i++)
		{
			Node n = new Node(i);
			if(i==0)
			{
				head = n;
				temp = n;
			}
			else
			{
				temp.link = n;
				temp = n;
			}
		}
		return head;
	}
}