package balancedBrackets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets 
{
	static Map<Character, Character> bra = new HashMap<>();
    static
    {
      bra.put('{', '}');
      bra.put('[', ']');
      bra.put('(', ')');
    }
  
  public static boolean isBalanced(String expression) 
  {
      if(expression == null)
          return false;
      Stack<Character> stack = new Stack<>();
      char[] characters = expression.toCharArray();
      stack.push(characters[0]);
      for(int i = 1; i<expression.length(); i++)
          {
          if(characters[i] == bra.get(stack.peek()))
              {
              stack.pop();
          }
          else
              {
              stack.push(characters[i]);
          }
      }
      if(stack.isEmpty())
          return true;
      return false;
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      for (int a0 = 0; a0 < t; a0++) {
          String expression = in.next();
          System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
      }
      in.close();
  }
}
