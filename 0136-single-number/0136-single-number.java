// class Solution {
//     public int singleNumber(int[] nums) {
//         for(int i=0; i<nums.length; i++) {
//             int sum = 1;
//             if(nums[i]==nums[i+1]) {
//                 sum = sum + 1;
//             } if(sum==1) {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i] && i!=j) {
                count++;
                break;
                }
            }
            if (count == 0) {
                return arr[i];
            }
        }
        return -1;
    }
}

















