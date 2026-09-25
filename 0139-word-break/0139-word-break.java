class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1;i<=n;i++){
            for(int j =0;j < i;j++){
                String sub = s.substring(j,i);
                if(dp[j] && wordDict.contains(sub)){
                    dp[i] = true;
                    break;
                }
            }
        }return dp[n];
    }
}


// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         int n = s.length();
//         boolean[] dp = new boolean[n];
//          return(solve(0, s, wordDict, dp));
//     }

//     private boolean solve(int i, String s, List<String> wordDict, boolean[] dp) {
//         int n = s.length();
//         if (i == n) {
//             return true;
//         }
//         if (dp[i] != false) {
//             return true;
//         }
//         for (int j = i + 1; j <= n; j++) {
//             String sub = s.substring(i, j);
//             if (wordDict.contains(sub) && solve(j, s, wordDict, dp)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }