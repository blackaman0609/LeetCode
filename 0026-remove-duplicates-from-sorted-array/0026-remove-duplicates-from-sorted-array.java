class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int k = 1; // Since the first element is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;

        // int j = 1;
        // int n = a.length;
        // for (int i = 0; i < n - 1; i++) {
        //     if (a[i] < a[i + 1]) {
        //         a[j] = a[i + 1];
        //         j++;
        //     }
        // }
        // return j;
    }
}





















