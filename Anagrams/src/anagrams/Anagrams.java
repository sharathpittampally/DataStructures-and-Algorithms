package anagrams;

import java.util.Scanner;

public class Anagrams 
{
	 public static int numberNeeded(String first, String second) 
	    {
	        int count = 0;
	        char[] f = first.toCharArray();
	        char[] s = second.toCharArray();
	        
	        int[] fascii = new int[150];
	        int[] sascii = new int[150];
	        
	        for(int i = 0; i < first.length(); i++)
	            {
	            char c = f[i];
	            int cascii = c - 'a';
	            fascii[cascii]++;
	        }
	        
	        for(int i = 0; i < second.length(); i++)
	            {
	            char c = s[i];
	            int cascii = c - 'a';
	            sascii[cascii]++;
	        }
	        
	        for(int i = 0; i < 100; i++)
	            {
	        	if(fascii[i] > sascii[i])
	        	{
	        		count = count + (fascii[i] - sascii[i]);
	        	}
	            if(fascii[i] < sascii[i])
	            {
	            	count = count + (sascii[i] - fascii[i]);
	            }       
	        }
	        return count;
	    }
	  
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String a = in.next();
	        String b = in.next();
	        System.out.println(numberNeeded(a, b));
	        in.close();
	    }
}
