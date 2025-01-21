class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { map.get(complement), i };
            }
            
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // If no solution is found, throw an exception (problem guarantees a solution)
        throw new IllegalArgumentException("No two sum solution");
        
    }
}

