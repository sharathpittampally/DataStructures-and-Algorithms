package postfix;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class InfixToPostfix 
{
	static Set<Character> operators = new HashSet<>();
	
	public static void main(String[] args)
	{
		operators.add('+');
		operators.add('-');
		operators.add('*');
		operators.add('/');
		operators.add('(');
		operators.add(')');
		
		System.out.println("Enter the infix expression: ");
		Scanner scan = new Scanner(System.in);
		String expr = scan.next();
		System.out.println("Post fix form: "+ convertToPostfix(expr));
		scan.close();
	}
	
	public static String convertToPostfix(final String expr)
	{
		Stack<Character> stack = new Stack<>();
		StringBuilder postFixExpr = new StringBuilder(20);
		for(int i=0; i<expr.length(); i++)
		{
			char x = expr.charAt(i);
			if(!operators.contains(x))
				postFixExpr.append(x);
			else
			{
				Operators op1 = getOperatorEnum(x);
				if(!stack.isEmpty())
				{
					Operators op2 = getOperatorEnum(stack.peek());
					if(op1.getOp() == '(')
						stack.push(op1.getOp());
					else if(op1.getOp() == ')')
					{
						while(stack.peek() != '(')
						{
							postFixExpr.append(stack.pop());
						}
						stack.pop();
					}
					else if(op2.getOp() == '(')
						stack.push(op1.getOp());
					else if(op2.getRank() < op1.getRank())
					{
						stack.push(op1.getOp());
					}
					else if(op2.getRank() >= op1.getRank())
					{
						postFixExpr.append(stack.pop());
						stack.push(op1.getOp());
					}
				}
				else
				{
					stack.push(x);
				}
			}
		}
		while(!stack.isEmpty())
		{
			postFixExpr.append(stack.pop());
		}
		return postFixExpr.toString();
	}
	
	public static Operators getOperatorEnum(char c)
	{
		Operators op = null;
		switch(c)
		{
			case '+':
				op = Operators.PLUS;
				break;
			case '-':
				op = Operators.MINUS;
				break;
			case '*':
				op = Operators.MUL;
				break;
			case '/':
				op = Operators.DIV;
				break;
			case '(':
				op = Operators.OBRCKT;
				break;
			case ')':
				op = Operators.CBRCKT;
		}
		return op;
	}
	
	enum Operators
	{
		PLUS('+', 1),
		
		MINUS('-', 1),
		
		MUL('*', 2),
		
		DIV('/', 2),
		
		OBRCKT('(', 3),
		
		CBRCKT(')', 3);
		
		int rank;
		char op;
		
		Operators(char op, int rank)
		{
			this.op = op;
			this.rank = rank;
		}
		
		int getRank()
		{
			return rank;
		}
		
		char getOp()
		{
			return op;
		}
	}
}
