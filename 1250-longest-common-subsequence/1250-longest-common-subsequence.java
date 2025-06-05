class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] memo = new int[len1 + 1][len2 + 1];

        // Initialize all values to -1
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                memo[i][j] = -1;
            }
        }

        return LCS(text1, text2, len1 - 1, len2 - 1, memo);
    }

    private int LCS(String text1, String text2, int i, int j, int[][] memo) {
        if (i < 0 || j < 0) return 0;

        if (memo[i + 1][j + 1] != -1) {
            return memo[i + 1][j + 1];
        }

        if (text1.charAt(i) == text2.charAt(j)) {
            memo[i + 1][j + 1] = 1 + LCS(text1, text2, i - 1, j - 1, memo);
        } else {
            memo[i + 1][j + 1] = Math.max(
                LCS(text1, text2, i - 1, j, memo),
                LCS(text1, text2, i, j - 1, memo)
            );
        }

        return memo[i + 1][j + 1];
    }
}
