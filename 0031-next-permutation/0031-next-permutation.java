class Solution {
    public void nextPermutation(int[] nums) {

        int n=nums.length;
        int pivot=-1;
        for (int i=n-2;i>=0;i--) {
            if (nums[i]<nums[i+1]) {
                pivot=i;
                break;
            }
        }

        if (pivot==-1) {
            reverse_array(nums, 0, n-1);
            return;
        }

        for (int i=n-1;i>pivot;i--) {
            if (nums[i]>nums[pivot]) {
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }

        reverse_array (nums, pivot+1, n-1);        
    }

    public void reverse_array(int[] nums, int start, int end) {
        while(start<=end) {
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
        }
    }
}