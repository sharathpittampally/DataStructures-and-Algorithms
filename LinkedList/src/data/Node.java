package data;

public class Node {
	
		 int data;
		 Node link;
		
		 public Node(int data)
		 {
	 		this.data = data;
	 		this.link = null;
		 }
		 
		 public void setLink(final Node link)
		 {
			 this.link = link;
		 }
		 
		 public Node getLink()
		 {
			return link;
		 }
		 public int getData()
		 {
			return data;
		 }

}
