class Solution { 
    public int min(int a,int b,int c)
    {
        if(a<=b && a<=c)
        {
            return a;
        }
        else if(b<=a && b<=c)
        {
            return b;
        }
        else 
        {
            return c;
        }
    }
    public int maximalSquare(char[][] matrix)
    {
         int n = matrix.length; 
         int m = matrix[0].length; 
         int[][] dp = new int[n][m]; 
         int i,j; 
         for(i=0 ; i< n ;i++)
         {
            for(j=0 ; j<m; j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j] = matrix[i][j]-48;
                }
                else 
                {
                    if(matrix[i][j]=='1')
                    {
                        dp[i][j] = min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1])+1; 
                    }
                    else 
                    {
                        dp[i][j] = 0;
                    }
                }
            }
         }
         int max = 0; 
         for(i=0;i<n;i++)
         {
            for(j=0;j<m;j++)
            {
                if(max<dp[i][j])
                {
                    max = dp[i][j];
                }
            }
          //  System.out.println();
         }
         return (max*max);
    }
}