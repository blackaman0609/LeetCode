// Memoization

class Solution {
    public int solve(int i,int j,int[][] grid,int[][] memo)
    {
        if(i==0 && j==0 && grid[i][j]==0)
        {
            return 1;
        }
        if(i==-1 || j==-1 || grid[i][j]==1)
        {
            return 0;
        }
        if(memo[i+1][j+1]!=-1)
        {
            return memo[i+1][j+1];
        }
        else 
        {
            memo[i+1][j+1] = solve(i-1,j,grid,memo)+solve(i,j-1,grid,memo);
        }
        return memo[i+1][j+1];
    }
    public int uniquePathsWithObstacles(int[][] grid)
    {
        int n = grid.length; 
        int m = grid[0].length;  
        int[][] memo = new int[n+1][m+1]; 
        int row,col; 
        for(row=0 ; row<=n ; row++)
        {
            for(col=0 ;col<=m ; col++)
            {
                memo[row][col] = -1;
            }
        }
        int res = solve(n-1,m-1,grid,memo); 
        return res;
    }
}

// Recursion

// class Solution {
//     public int solve(int i,int j,int[][] grid)
//     {
//         if(i==0 && j==0 && grid[i][j]==0)
//         {
//             return 1;
//         }
//         else if(i==-1 || j==-1 || grid[i][j]==1)
//         {
//             return 0;
//         }
//         else 
//         {
//             return solve(i-1,j,grid)+solve(i,j-1,grid);
//         }
//     }
//     public int uniquePathsWithObstacles(int[][] grid)
//     {
//         int n = grid.length; 
//         int m = grid[0].length; 
//         int res = solve(n-1,m-1,grid); 
//         return res;
//     }
// }
