class Solution {
    public int[][] merge(int[][] intervals) {
      int n = intervals.length;
      Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
      List<int[]> ans = new ArrayList<>();
      int[] arr = intervals[0];
      int start = arr[0];
      int end = arr[1];

      for(int i =1;i<n;i++){
        int[] temp = intervals[i];
        if(end >= temp[0]){
            end = Math.max(end,temp[1]);
            start = Math.min(start,temp[0]);
        }
        else{
            ans.add(new int[]{start,end});
    
            start = temp[0];
            end = temp[1];
        }
      }
      ans.add(new int[]{start,end});
    return ans.toArray(new int[ans.size()][]);
    }
}