package huffman;

public class Node 
{
	char letter;
	Node left;
	Node right;
	Node parent;
	int prob;
	String leftbit = "0"; String rightbit = "1";
	String code;
	
	Node(char letter, int prob)
	{
		this.prob = prob;
		this.letter = letter;
	}

	public char getLetter() {
		return letter;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public int getProb() {
		return prob;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setProb(int prob) {
		this.prob = prob;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public void setParent(Node parent)
	{
		this.parent = parent;
	}
	
	public Node getParent()
	{
		return parent;
	}
}
