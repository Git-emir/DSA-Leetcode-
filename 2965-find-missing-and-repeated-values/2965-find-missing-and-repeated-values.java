class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] ans = new int[2];
        int actualSum = 0;
        int expectedSum = 0;
        Set<Integer> hs = new HashSet<>();
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                actualSum += grid[i][j];

                if (hs.contains(grid[i][j])) {
                    a = grid[i][j];
                    ans[0] = a;

                } else {
                    hs.add(grid[i][j]);
                }
            }
        }
        expectedSum = (n * n) * (n * n + 1) / 2;
        b = expectedSum + a - actualSum;
        ans[1] = b;

        return ans;
    }
}