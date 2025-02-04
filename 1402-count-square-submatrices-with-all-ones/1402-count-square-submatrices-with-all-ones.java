class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int totalSquares = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        // If we're in the first row or first column, the max square ending here is just itself
                        dp[i][j] = 1;
                    } else {
                        // Check the minimum square size from the left, top, and top-left cells
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    totalSquares += dp[i][j];
                }
            }
        }
        return totalSquares;
    }
}
