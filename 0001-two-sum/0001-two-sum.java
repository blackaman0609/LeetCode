class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int k = target - nums[i];

            if (m.containsKey(k)) {
                return new int[] { m.get(k), i };
            } else {
                m.put(nums[i], i);
            }
        }
        return null;
    }
}



// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = i+1; j < n; j++) { 
//                 if (nums[i] + nums[j] == target) {
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return null; 
//     }
// }