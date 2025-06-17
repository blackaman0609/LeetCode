class Solution {
    public int lengthOfLIS(int[] nums)
    {
        int n = nums.length; 
        int i,j; 
        int[] dp = new int[n]; 
        for(i=0;i<n;i++)
        {
            dp[i] = 1;
        }
        for(i=1 ; i<=n-1 ; i++)
        {
            for(j=0 ; j<=i-1 ; j++)
            {
               if(nums[i]>nums[j])
               {
                dp[i] = Math.max(dp[j]+1 , dp[i]);
               }
            }
        } 
        int max = 0; 
        for(i=0 ; i<n ; i++)
        {
            if(max<dp[i])
            {
                max = dp[i];
            }
        }
        return max;

    }
}