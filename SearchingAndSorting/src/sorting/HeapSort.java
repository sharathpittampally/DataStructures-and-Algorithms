package sorting;

public class HeapSort {
	
 
	public static void main(String[] args) 
	{
		int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
		int[]  res = new HeapSort().heapSort(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+", ");
	}
	
	public int[] heapSort(int[] arr)
	{
		int l = arr.length;
		while(l > 0)
		{
			arr = buildMaxHeap(arr);
			int t = arr[0];
			arr[0] = arr[l-1];
			arr[l-1] = t;
			l--;
		}
		return arr;
	}
	
	private int[] buildMaxHeap(int[] arr)
	{
		int n = arr.length;
		for(int i = n/2-1; i >= 0; i--)
		{
			arr = maxHeapify(arr, i);
		}
		return arr;
	}
	
	private int[] maxHeapify(int[] arr, int i)
	{
		int largest = i;
		while(largest < arr.length /2)
		{
			int l = 2*largest+1;
			int r = 2*largest+2;
			if(l < arr.length && arr[l] > arr[largest])
			{
				largest = l;
			}
			if(r < arr.length && arr[r] > arr[largest])
			{
				largest = r;
			}
			if(largest != i)
			{
				int temp = arr[i];
				arr[i] = arr[largest];
				arr[largest] = temp;
			}
			if(largest == i)
				break;
		}
		return arr;
	}

}
