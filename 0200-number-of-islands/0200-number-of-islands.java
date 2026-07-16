class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int col = grid[0].length;
        boolean[][] vis = new boolean[rows][col];
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    count++;
                    dfs(grid, vis, i, j);

                }
            }
            
        }return count;
    }

    private void dfs(char[][] grid, boolean[][] vis, int row, int col) {
        vis[row][col] = true;
        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        for (int i = 0; i < 4; i++) {
            int nrow = row + dr[i];
            int ccol = col + dc[i];

            if (nrow >= 0 && nrow < grid.length &&
                    ccol >= 0 && ccol < grid[0].length &&
                    grid[nrow][ccol] == '1' && !vis[nrow][ccol]) {
                dfs(grid, vis, nrow, ccol);

            }
        }
    }
}