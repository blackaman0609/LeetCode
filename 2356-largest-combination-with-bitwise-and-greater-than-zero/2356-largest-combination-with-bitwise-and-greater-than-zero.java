class Solution {
    public int largestCombination(int[] candidates) {
        int maxCount = 0;

        // Loop through each bit position from 0 to 23 (since 10^7 < 2^24)
        for (int bit = 0; bit < 24; bit++) {
            int count = 0;
            
            // Count how many numbers have the 'bit' position set to 1
            for (int num : candidates) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }
            
            // Update maxCount with the maximum count of numbers sharing a common bit
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}
