//Tabulation
class Solution
{
   
    public int longestCommonSubsequence(String text1, String text2)
    {
       int len1 = text1.length(); 
       int len2 = text2.length(); 
       int[][] dp = new int[len1+1][len2+1];  
       int row,col; 
       for(row=0 ; row<len1+1 ; row++)
       {
        for(col=0 ; col<len2+1 ; col++)
        {
            if(row == 0 || col == 0)
            {
                dp[row][col] = 0;
            }
            else if(text1.charAt(row-1) == text2.charAt(col-1))
            {
             dp[row][col] = 1+dp[row-1][col-1];
            }
            else 
            {
             dp[row][col] = Math.max(dp[row][col-1],dp[row-1][col]);
            }
        }
       }
       return dp[len1][len2];  
    }
}

// Memoization

// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int len1 = text1.length();
//         int len2 = text2.length();
//         int[][] memo = new int[len1 + 1][len2 + 1];

//         // Initialize all values to -1
//         for (int i = 0; i <= len1; i++) {
//             for (int j = 0; j <= len2; j++) {
//                 memo[i][j] = -1;
//             }
//         }

//         return LCS(text1, text2, len1 - 1, len2 - 1, memo);
//     }

//     private int LCS(String text1, String text2, int i, int j, int[][] memo) {
//         if (i < 0 || j < 0) return 0;

//         if (memo[i + 1][j + 1] != -1) {
//             return memo[i + 1][j + 1];
//         }

//         if (text1.charAt(i) == text2.charAt(j)) {
//             memo[i + 1][j + 1] = 1 + LCS(text1, text2, i - 1, j - 1, memo);
//         } else {
//             memo[i + 1][j + 1] = Math.max(
//                 LCS(text1, text2, i - 1, j, memo),
//                 LCS(text1, text2, i, j - 1, memo)
//             );
//         }

//         return memo[i + 1][j + 1];
//     }
// }
