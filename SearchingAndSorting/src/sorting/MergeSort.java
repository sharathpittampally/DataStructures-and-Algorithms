package sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
		int[] res = new MergeSort().mergeSort(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+", ");
	}
	
	public int[] mergeSort(int[] elems)
	{
		return mergeSort(0, elems.length-1, elems);
	}
	
	public int[] mergeSort(int start, int end, int[] elems)
	{
		if(start == end)
			return new int[]{elems[start]};
		int mid = (start+end)/2;
		int[] list1 = mergeSort(start, mid, elems);
		int[] list2 = mergeSort(mid+1, end, elems);
		return merge(list1, list2);
	}
	
	public int[] merge(int[] list1, int[] list2)
	{		
		int i = 0;
		int j = 0;
		int[] temp = new int[list1.length + list2.length];
		int k= 0;
		while(i < list1.length && j < list2.length)
		{
			if(list1[i] < list2[j])
			{
				temp[k] = list1[i];
				k++;
				i++;
			}
			else if(list1[i] == list2[j])
			{
				temp[k++] = list1[i++];
				temp[k++] = list2[j++];	
			}
			else if(list1[i] > list2[j])
			{
				temp[k] = list2[j];
				k++;
				j++;
			}
		}
			while(i < list1.length)
			{
				temp[k] = list1[i];
				k++;i++;
			}
		
			while(j < list2.length)
			{
				temp[k] = list2[j];
				k++;j++;
			}
		
		return temp;
	}

}
