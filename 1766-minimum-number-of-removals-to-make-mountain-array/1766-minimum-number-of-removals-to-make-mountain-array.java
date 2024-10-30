class Solution {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        
        // Step 1: Calculate LIS ending at each index
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        
        // Step 2: Calculate LDS starting at each index
        int[] lds = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            lds[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (nums[j] < nums[i]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }
        
        // Step 3: Find maximum mountain array length
        int maxMountainLength = 0;
        for (int i = 1; i < n - 1; i++) {
            if (lis[i] > 1 && lds[i] > 1) { // Ensure it's a peak
                maxMountainLength = Math.max(maxMountainLength, lis[i] + lds[i] - 1);
            }
        }
        
        // Step 4: Calculate minimum removals
        return n - maxMountainLength;
    }
}
