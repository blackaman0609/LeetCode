class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length(); 
        int[][] memo = new int[len][len]; 
        
        // Initialize memo array with -1
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                memo[i][j] = -1;
            }
        }    

        return LPS(s, 0, len - 1, memo);
    }

    // Move this method outside of longestPalindromeSubseq
    public int LPS(String s, int i, int j, int[][] memo) {
        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (s.charAt(i) == s.charAt(j)) {
            memo[i][j] = 2 + LPS(s, i + 1, j - 1, memo); 
        } else {
            memo[i][j] = Math.max(LPS(s, i, j - 1, memo), LPS(s, i + 1, j, memo));
        } 
        return memo[i][j];
    }
}
