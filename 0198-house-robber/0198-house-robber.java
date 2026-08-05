class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        for(int i =0;i<n+1;i++){
            dp[i] = -1;
        }
        return sum(n-1,nums,dp);
    }
    private int sum(int n,int[] nums,int[] dp){
        int max = 0;
        if(n ==0) return nums[0];
        if(n < 0) return 0;
        if(dp[n] != -1){
            return dp[n];
        }
        int pick = nums[n] + sum(n-2,nums,dp);
        int notPick = 0 + sum(n-1,nums,dp);
        max = Math.max(pick,notPick);
        dp[n] = max;
        return dp[n];

    }
}