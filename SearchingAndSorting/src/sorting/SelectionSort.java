package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
		int[] res = new SelectionSort().selectionSort(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+", ");
	}
	
	//In each iteration select the minimum element and put it in right place.
	public int[] selectionSort(int[] arr)
	{
		for(int i=0; i<arr.length;i++)
		{
			int min = i;
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

}
