package SubsetSum;

public class SubsetSum 
{

	public static void main(String[] args) 
	{
		System.out.println(new SubsetSum().subSetSum(new int[]{2,3,7,8,10}, 11));
	}
	
	public boolean subSetSum(int[] vals, int sum)
	{
		int rows = vals.length+1;
		int cols = sum+2;
		boolean[][] mat = new boolean[rows][cols];
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<cols;j++)
			{
				if(j == 1)
					mat[i][j] = true;
				else if(j < vals[i-1])
				{
					mat[i][j] = mat[i-1][j];
				}
				else
				{
					mat[i][j] = mat[i-1][j-vals[i-1]];
				}
			}
		}
		return mat[rows-1][cols-1];
	}

}
