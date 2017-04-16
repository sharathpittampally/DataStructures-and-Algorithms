package arrayLeftRotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ArrayLeftRotation {

	static int[] a;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] res = performRotations(n,k);
        for(int i=0;i<n;i++)
        	System.out.print(res[i]+" ");
    }
    
    static int[] performRotations(int n, int k)
    {
    	List<Integer> list = new ArrayList<>();
    	int fuck=0;
    	for(int i = 0; i<k; i++)
    	{
    		list.add(a[i]);
    	}
    	
    	int[] result  = new int[n];
    	for(int i = 0,j=k; j<n; i++,j++)
    	{
    		result[i] = a[j];
    		fuck = i;
    	}
    	fuck++;
    	for(Integer x : list)
    	{
    		result[fuck++] = x;
    	}
    	return result;
    }

}
