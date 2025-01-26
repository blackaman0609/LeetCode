class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor1 = xor1 ^ (i + 1);
            xor2 = xor2 ^ nums[i];
        }
        return (xor1 ^ xor2);
    }
}


// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int sum1 = n * (n + 1) / 2;
//         int sum2 = 0;
//         for (int i : nums)
//         sum2 += i;
//         return sum1 - sum2;
//     }
// }


// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//     int hash[] = new int[n + 1];

//     for (int i = 0; i < n; i++) {
//       hash[nums[i]]++;
//     }

//     for (int i = 0; i < n + 1; i++) {
//       if (hash[i] == 0) {
//         return i;
//       }
//     }
//     return -1;
//     }
// }