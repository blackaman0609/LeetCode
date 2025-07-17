class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int min_element = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
        
            if (nums[start] <= nums[mid]) {
                min_element = Integer.min(min_element, nums[start]);
                start = mid + 1;
            } else {
                min_element = Integer.min(min_element, nums[mid]);
                end = mid - 1;
            }
        }
        return min_element;
    }
}