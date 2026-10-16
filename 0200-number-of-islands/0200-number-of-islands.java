class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    count++;
                    dfs(i, j, grid, vis);
                }
            }
        }
        return count;

    }

    private void dfs(int row,int col,char[][] grid,boolean[][] vis){
        vis[row][col] = true;
        int[] r = {1,0,-1,0};
        int[] c = {0,1,0,-1};

        for(int i = 0;i<4;i++){
            int nrow = row + r[i];
            int ccol = col + c[i];
            
            if (nrow >= 0 && nrow < grid.length &&
                    ccol >= 0 && ccol < grid[0].length &&
                    grid[nrow][ccol] == '1' && !vis[nrow][ccol]) {
                dfs(nrow,ccol,grid,vis);

        }
        }


    }
}