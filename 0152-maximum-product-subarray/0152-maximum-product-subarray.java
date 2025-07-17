class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1, suffix = 1;
        int max_product = Integer.MIN_VALUE;

        for (int i=0;i<n;i++) {
            if (prefix==0)  prefix=1;
            if (suffix==0)  suffix=1;

            prefix *= nums[i];
            suffix *= nums[n-i-1];
            max_product = Integer.max(max_product, Integer.max(prefix, suffix));
        }
        return max_product;
        
    }
}
