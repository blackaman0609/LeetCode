class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        
        // Phase 1: Find the candidate for majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        // Phase 2: Return the majority element (guaranteed by the problem statement)
        return candidate;
    }
}
