package postfix;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class PostFixToInfix 
{
	static Set<Character> operators = new HashSet<>();
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		operators.add('+');
		operators.add('-');
		operators.add('*');
		operators.add('/');
		
		System.out.println("Enter the post fix expression: ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Infix form: "+convertToInfix(scan.nextLine()));
		scan.close();
	}
	
	public static String convertToInfix(final String expr)
	{
		Stack<String> stack = new Stack<>();
		for(int i=0; i<expr.length(); i++)
		{
			char x = expr.charAt(i);
			if(!operators.contains(x))
			{
				stack.push(String.valueOf(x));
			}
			else
			{
				if(stack.size() < 2)
					throw new RuntimeException("Given expression is an invalid post fix experssion.");
				String l = stack.pop();
				String lbo = stack.pop();
				String s = null;
				if(stack.isEmpty())
					s = lbo+x+l;
				else
					s = "("+lbo+x+l+")";
				stack.push(s);
			}
		}
		return stack.pop();
	}
}
