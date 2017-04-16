package compress;

import java.util.Scanner;
import java.util.Stack;

public class StringCompresser 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s = scan.next();
		System.out.println("Compressed string not using stack: "+new StringCompresser().compress(s));
		System.out.println("Compressed string using stack: "+new StringCompresser().compressUsingStack(s));
		scan.close();
	}
	
	public String compress(final String str)
	{
		int[] countHolder = new int[26];
		char[] result = new char[str.length()];
		int j = 0;
		for(int i = 0;i<str.length();i++)
		{
			int index = str.charAt(i) - 'a';
			countHolder[index]++;
		}
		
		for(int i = 0; i<str.length(); i++)
		{
			if(j == 0)
			{
				result[j++] = str.charAt(i);
				int index = str.charAt(i) - 'a';
				if(countHolder[index] > 1)
					result[j++] = String.valueOf(countHolder[index]).toCharArray()[0];
			}
			else if(j==1 && result[j-1] != str.charAt(i))
			{
				result[j++] = str.charAt(i);
				int index = str.charAt(i) - 'a';
				if(countHolder[index] > 1)
					result[j++] = String.valueOf(countHolder[index]).toCharArray()[0];
			}
			else if(j > 1 && result[j-2] != str.charAt(i))
			{
				result[j++] = str.charAt(i);
				int index = str.charAt(i) - 'a';
				if(countHolder[index] > 1)
					result[j++] = String.valueOf(countHolder[index]).toCharArray()[0];
			}
		}
		return new String(result);
	}
	
	public String compressUsingStack(final String str)
	{
		Stack<Character> stack = new Stack<>();
		stack.push(str.charAt(0));
		int count = 1;
		char[] result = new char[str.length()];
		int j=0;
		for(int i=1;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c == stack.peek())
			{
				count++;
			}
			else
			{
				result[j++] = stack.pop();
				if(count > 1)
					result[j++] = String.valueOf(count).toCharArray()[0];
				count = 1;
				stack.push(str.charAt(i));
			}
		}
		result[j++] = stack.pop();
		if(count > 1)
			result[j++] = String.valueOf(count).toCharArray()[0];
		
		return new String(result);
	}
}
