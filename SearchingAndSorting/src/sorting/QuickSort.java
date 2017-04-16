package sorting;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] quickSort(int[] arr)
	{
		int start = 0;
		int end = arr.length-1;
		return quickSort(start, end, arr);
	}
	
	public int[] quickSort(int start, int end, int[] arr)
	{
		int pivotIndex = partition(arr);
		
		quickSort(0,pivotIndex, arr);
		quickSort(pivotIndex+1, arr.length-1, arr);
	}
	
	int partition(int[] arr)
	{
		int pivot = arr.length-1;
		int i=0,j=0;
		while(j<arr.length)
		{
			if(arr[j] < pivot && i==j)
			{
				i++;
				j++;
			}
			else if(arr[j] > pivot)
			{
				j++;
			}
			else if(arr[j] < pivot && i < j)
			{
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
				j++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp;
		return i;
	}

}
