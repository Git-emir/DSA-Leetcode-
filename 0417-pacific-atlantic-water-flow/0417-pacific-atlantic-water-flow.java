class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        for(int i =0;i<n;i++){
            dfs(i,0,heights,pacific);
        }
         for(int j =0;j<m;j++){
            dfs(0,j,heights,pacific);
        }
         for(int i =0;i<n;i++){
            dfs(i,m-1,heights,atlantic);
        }
        for(int j =0;j<m;j++){
            dfs(n-1,j,heights,atlantic);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }
        return ans;
    }
    private void dfs(int r,int c,int[][] heights,boolean[][] ocean){
        ocean[r][c] = true;
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,1,-1};

        for(int i =0;i<4;i++){
            int nr = r + dr[i];
            int nc = c + dc[i];

            if(nr >= 0 && nr < heights.length && nc >= 0 && nc < heights[0].length && !ocean[nr][nc] && heights[nr][nc] >= heights[r][c])
            dfs(nr,nc,heights,ocean);
        }
    }
}