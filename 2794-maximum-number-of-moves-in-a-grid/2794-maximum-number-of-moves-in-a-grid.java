class Solution {
    public int maxMoves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        int maxMoves = 0;

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                dp[i][j] = -1; // initialize with -1 to mark unvisited cells
                // check previous column cells and update dp[i][j] if a valid move exists
                if (i > 0 && grid[i - 1][j - 1] < grid[i][j] && dp[i - 1][j - 1] != -1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
                if (grid[i][j - 1] < grid[i][j] && dp[i][j - 1] != -1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + 1);
                }
                if (i < m - 1 && grid[i + 1][j - 1] < grid[i][j] && dp[i + 1][j - 1] != -1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i + 1][j - 1] + 1);
                }
                maxMoves = Math.max(maxMoves, dp[i][j]);
            }
        }

        return maxMoves;
    }
}
