// Memoization

import java.util.Arrays;

class Solution {
    public int solve(int i, int j, int[][] memo) {
        if (i < 0 || j < 0) return 0;
        if (i == 0 && j == 0) return 1;
        if (memo[i][j] != -1) return memo[i][j];

        memo[i][j] = solve(i - 1, j, memo) + solve(i, j - 1, memo);
        return memo[i][j];
    }

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return solve(m - 1, n - 1, memo);
    }
}


// Recursion

// class Solution {
//     public int solve(int i, int j) {
//         if (i < 0 || j < 0) {
//             return 0;
//         } else if (i == 0 && j == 0) {
//             return 1;
//         } else {
//             return solve(i - 1, j) + solve(i, j - 1);
//         }
//     }

//     public int uniquePaths(int m, int n) {
//         return solve(m - 1, n - 1);
//     }
// }
