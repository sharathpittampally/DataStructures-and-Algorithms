package binarytree;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Difference in the heights of left subtree and right subtree will never be greater than one.
 * @author sharath
 *
 */
public class RunningMedian 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the input array:");
		int s = in.nextInt();
		int[] input = new int[s];
		System.out.println("Enter the array:");
		for(int i=0;i<s;i++)
		{
			input[i] = in.nextInt();
		}
		
		RunningMedian rm = new RunningMedian();
		System.out.println("Medians: ");
		double[] medians = rm.getMedians(input);
		for(int i=0; i < medians.length; i++)
		{
			System.out.print(medians[i]+", ");
		}
	}
	
	public double[] getMedians(int[] input)
	{
		Comparator<Integer> comparator = (a,b) -> -1 * a.compareTo(b);
		PriorityQueue<Integer> lowers = new PriorityQueue<>(comparator);// Heap of lower elements.
		PriorityQueue<Integer> highers = new PriorityQueue<>(); // Heap of higher elements.
		double[] medians = new double[input.length];
		for(int i=0; i<input.length; i++)
		{
			int number = input[i];
			addToHeap(number, lowers, highers);
			rebalance(lowers,highers);
			
			//This happens if there are even number of elements. 
			if(lowers.size() == highers.size())
			{
				medians[i] = (double)(lowers.peek() + highers.peek()) / 2;
			}
			//If there are odd number of elements which side is having more elements return the head of it. 
			else if(lowers.size() > highers.size())
			{
				medians[i] = lowers.peek();
			}
			else
				medians[i] = highers.peek();
		}
		return medians;
	}
	
	public void addToHeap(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers)
	{
		
		if(lowers.size() == 0 || number <= lowers.peek())
			lowers.add(number);
		else
			highers.add(number);
	}
	
	public void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers)
	{
		PriorityQueue<Integer> biggerHeap = lowers.size() > highers.size() ? lowers : highers;
		PriorityQueue<Integer> smallerHeap = lowers.size() > highers.size() ? highers : lowers;
		
		if(biggerHeap.size() - smallerHeap.size() >=2)
		{
			while(biggerHeap.size() - smallerHeap.size() >= 2)
			{
				smallerHeap.add(biggerHeap.poll());
			}
		}
	}
}
