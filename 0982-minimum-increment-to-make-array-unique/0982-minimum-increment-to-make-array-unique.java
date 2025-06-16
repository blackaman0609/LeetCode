class Solution {
    public int minIncrementForUnique(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int count=0,i;
        for(i=1;i<n;i++) {
            if(nums[i-1]>=nums[i]) {
                count=count+(nums[i-1]-nums[i]+1);
                nums[i]=nums[i-1]+1;
            }
        }

        return count;
    }
}




// class Solution {
//     public int minIncrementForUnique(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {
//             int current = nums[i];
//             while (set.contains(current)) {
//                 current++;
//                 count++;
//             }
//             set.add(current);
//         }

//         return count;
//     }
// }