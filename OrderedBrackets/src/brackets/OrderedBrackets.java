package brackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class OrderedBrackets 
{
	
	private static Map<Character, Character> map = new HashMap<>();
	static
	{
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		map.put('<', '>');
		
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string:");
		String brackets = s.nextLine();
		System.out.println("Ordered? "+check(brackets));
	}
	
	public static boolean check(final String b)
	{
		Stack<Character> stack = new Stack<>();
		int i=0;
		while(i < b.length())
		{
			//For any values other than brackets.
			if(!(map.keySet().contains(b.charAt(i))) && !(map.values().contains(b.charAt(i))))
			{
				i++;
				continue;
			}
		else if(map.containsKey(b.charAt(i)))
				stack.push(b.charAt(i));
			else if(stack.isEmpty() || map.get(stack.pop()) != b.charAt(i))
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
