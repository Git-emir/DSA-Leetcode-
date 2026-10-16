class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return robber(n - 1, nums, dp);

    }

    private int robber(int id, int[] nums, int[] dp) {
        int count = 0;
        if (id == 0)
            return nums[0];
        if (id < 0)
            return 0;
        if (dp[id] != -1) {
            return dp[id];
        }
        int pick = nums[id] + robber(id - 2, nums, dp);
        int notpick = 0 + robber(id - 1, nums, dp);
        count = Math.max(pick, notpick);
        dp[id] = count;
        return dp[id];
    }
}