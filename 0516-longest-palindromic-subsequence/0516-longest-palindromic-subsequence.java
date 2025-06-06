class Solution
{
  
    public int longestPalindromeSubseq(String s)
    {
       int[][] dp = new int[s.length()][s.length()];   
     int itr,i,j; 
     for(itr = 1 ; itr<=s.length() ; itr++)
     {
         for(i=0 ; i<=s.length()-itr ; i++)
         {
             j = i-1+itr; 
             if(i==j)
             {
                 dp[i][j] = 1;
             }
             else if(s.charAt(i) == s.charAt(j))
             {
                 dp[i][j] = 2+dp[i+1][j-1]; 
             }
             else 
             {
                 dp[i][j] = Math.max(dp[i][j-1],dp[i+1][j]);
             }
         } 
        
    }
     return dp[0][s.length()-1];
}
}



// Memoization

// class Solution {
//     public int longestPalindromeSubseq(String s) {
//         int len = s.length(); 
//         int[][] memo = new int[len][len]; 
        
//         // Initialize memo array with -1
//         for (int i = 0; i < len; i++) {
//             for (int j = 0; j < len; j++) {
//                 memo[i][j] = -1;
//             }
//         }    

//         return LPS(s, 0, len - 1, memo);
//     }

//     // Move this method outside of longestPalindromeSubseq
//     public int LPS(String s, int i, int j, int[][] memo) {
//         if (i > j) {
//             return 0;
//         }
//         if (i == j) {
//             return 1;
//         }
//         if (memo[i][j] != -1) {
//             return memo[i][j];
//         }
//         if (s.charAt(i) == s.charAt(j)) {
//             memo[i][j] = 2 + LPS(s, i + 1, j - 1, memo); 
//         } else {
//             memo[i][j] = Math.max(LPS(s, i, j - 1, memo), LPS(s, i + 1, j, memo));
//         } 
//         return memo[i][j];
//     }
// }
