package sorting;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
		int[] res = new InsertionSort().insertionSort(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+", ");
	}
	
	public int[] insertionSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int j = i-1;
			int t = arr[i];
			while(j >=0 && arr[j] > t)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = t;
		}
		return arr;
	}

}
