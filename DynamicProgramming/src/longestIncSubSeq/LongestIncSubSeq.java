package longestIncSubSeq;

import java.util.Scanner;

public class LongestIncSubSeq 
{
	public static void main(String[] args) 
	{
		LongestIncSubSeq liss = new LongestIncSubSeq();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of sequence: ");
		int l = s.nextInt();
		int[] seq = new int[l];
		System.out.println("Enter the sequence: ");
		for(int i = 0;i<l;i++)
		{
			seq[i] = s.nextInt();
		}
		
		System.out.println("Max length inc sub sequence: "+liss.lengthOfLongestIncSubSeq(seq));
		
	}
	
	public int lengthOfLongestIncSubSeq(int[] seq)
	{
		int size = seq.length;
		int[] res = new int[size];
		
		for(int i = 0; i< size; i++)
			res[i] = 0;
		for(int i = 0; i < size; i++)
		{
			for(int j = 0 ; j <= i; j++)
			{
				if(seq[i] > seq[j])
					res[i]++;
			}
		}
		
		int max = res[0];
		for(int i = 1; i< size; i++)
		{
			if(res[i] > max)
				max = res[i];
		}
		return max;
	}
}
