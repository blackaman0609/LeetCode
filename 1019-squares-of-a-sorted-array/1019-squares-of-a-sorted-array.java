class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp = 0;
        int n = nums.length;
        for (int i=0;i<n;i++) {
            temp = nums[i];
            nums[i] = temp*temp;
        }
        Arrays.sort(nums);
        return nums;
        
    }
}