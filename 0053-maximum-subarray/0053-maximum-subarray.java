class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {

            curr_sum += nums[i];
            max_sum = Math.max(curr_sum,max_sum);

            if(curr_sum<0) {
                curr_sum=0;
            }
        }
        return max_sum;
    }
}


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n=nums.length;
//         int max=Integer.MIN_VALUE;
//         for (int i=0;i<n;i++) {
//             int sum=0;
//             for (int j=i;j<n;j++) {
//                 sum += nums[j];
//                 max = Math.max(sum,max);
//             }
//         }
//         return max;
//     }
// }