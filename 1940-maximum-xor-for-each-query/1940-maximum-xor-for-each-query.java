class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Maximum value for the XOR operation with maximumBit bits (e.g., for maxBit=3, max_num=7)
        int max_num = (1 << maximumBit) - 1;
        
        // Compute the total XOR of all elements in nums
        int totalXor = 0;
        for (int num : nums) {
            totalXor ^= num;
        }
        
        // Fill the answer array in reverse order
        for (int i = 0; i < n; i++) {
            // The value of k that maximizes the XOR with totalXor
            answer[i] = totalXor ^ max_num;
            
            // Update totalXor by removing the last element (nums[n-1-i])
            totalXor ^= nums[n - 1 - i];
        }
        
        return answer;
    }
}
