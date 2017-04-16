package LongestSubsequece;

public class LongestCommonSubsequence {

	public int lcsDynamic(final String a, final String b)
	{
		int rows = b.length() + 1;
		int cols = a.length() + 1;
		
		int[][] mat = new int[rows][cols];
		
		for(int i = 0 ; i < rows; i++)
		{
			for(int j = 0; j < cols; j++)
			{
				if(i == 0 || j == 0)
					mat[i][j] = 0;
				else if(b.charAt(i-1) == a.charAt(j-1))
				{
					mat[i][j] = 1 + Math.max(mat[i-1][j], mat[i][j-1]);
				}
				else
				{
					mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
				}
			}
		}
		return mat[rows-1][cols-1];
	}
    
    public static void main(String args[]){
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        
        int result = lcs.lcsDynamic(str1, str2);
        System.out.print(result);
    }
}
