class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int product[] = new int[n];
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;

        for (int i=1;i<n;i++) {
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        for (int i=n-2;i>=0;i--) {
            suffix[i] = suffix[i+1]*nums[i+1];
        }

        for (int i=0;i<n;i++) {
            product[i] = prefix[i] * suffix[i];
        }

        return product;

    }
}

// time limit exceeded

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n= nums.length;
//         int temp[] = new int[n];
//         for (int i=0;i<n;i++) {
//             int product = 1;
//             for (int j=0;j<n;j++) {
//                 if (i!=j) {
//                     product *= nums[j];
//                 }
//             }
//             temp[i] = product;
//         }
//         return temp; 
//     }
// }