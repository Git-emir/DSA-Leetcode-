class Solution {
    public int coinChange(int[] coins, int amount) {
       int n = coins.length;
       int[] dp = new int[amount+1];
       Arrays.fill(dp,amount+1);
       dp[0] = 0;
       for(int i =1;i<=amount;i++){
        for(int j = 0;j<n;j++){
            if(coins[j] <= i)
            dp[i] = Math.min(dp[i],1+dp[i-coins[j]]);
        } 
       }return dp[amount] > amount ? -1 : dp[amount];
    }
}

//  int n = coins.length;
//         int[][] dp = new int[n][amount + 1];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j <= amount; j++) {
//                 dp[i][j] = -1;
//             }
//         }
//         int ans = f(n - 1, coins, amount, dp);
//         if (ans >= 1_000_000_000) {
//             return -1;
//         }
//         return ans;

//     }

//     private int f(int i, int[] coins, int T, int[][] dp) {
//         if (i == 0) {
//             if (T % coins[i] == 0)
//                 return T / coins[i];
//             return 1_000_000_000;
//         }
//         if (dp[i][T] != -1)
//             return dp[i][T];

//         int notTake = 0 + f(i - 1, coins, T, dp);
//         int take = Integer.MAX_VALUE;
//         if (T >= coins[i]) {
//             take = 1 + f(i, coins, T - coins[i], dp);
//         }
//         dp[i][T] = Math.min(take, notTake);
//         return dp[i][T];