class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int V = numCourses;
        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: prerequisites){
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u);
        }
        int[] indegree = new int[V];
        for(int i = 0;i<V;i++){
            for(int j =0;j<adj.get(i).size();j++){
                int nei = adj.get(i).get(j);
                indegree[nei]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<V;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
       while(!q.isEmpty()){
        int node = q.poll();
        ans.add(node);
        for(int i = 0;i<adj.get(node).size();i++){
            int nei = adj.get(node).get(i);
            indegree[nei]--;
            if(indegree[nei] == 0){
                q.offer(nei);
            }
        }
       }if(ans.size() == V) return true;
       return false;
    }
}