class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];

        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (check(i, n, graph, color) == false) {
                    return false;
                }
            }
        }
        return true;

    }

    private boolean check(int s, int len, int[][] graph, int[] color) {
        color[s] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int i = 0; i < graph[node].length; i++) {
                int nei = graph[node][i];
                if (color[nei] == -1) {
                    color[nei] = 1 - color[node];
                    q.offer(nei);
                } else if (color[nei] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}