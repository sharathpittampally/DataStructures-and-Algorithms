package sorting;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
		int[] res = new BubbleSort().bubbleSort(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+", ");
	}
	
	//In each iteration bubble up largest element to the end of array. O(n^2). 
	//This algo runs O(n^2) even when the entire array is sorted. So you can optimize it by breaking if your inner
	//loop did not cause any swap.
	public int[] bubbleSort(int[] arr)
	{
		int l = arr.length;
		while(l > 0)
		{
			for(int j = 0; j < l-1; j++)
			{
				if(arr[j+1] < arr[j])
				{
					int t = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = t;
				}
			}
			l--;
		}
		return arr;
	}
}
