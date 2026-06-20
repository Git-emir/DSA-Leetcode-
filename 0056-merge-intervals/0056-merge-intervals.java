class Solution {
    public int[][] merge(int[][] intervals) {
        // sort
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // store the merged intervals
        List<int[]> ans = new ArrayList<>();

        // traverse all the intervals
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // if ans list is empty
            if (ans.isEmpty()) {
                ans.add(new int[] { start, end });
            }
            // get last merged intervals
            else {
                int[] lastinterval = ans.get(ans.size() - 1);

                // check overlap
                if (start <= lastinterval[1]) {
                    lastinterval[1] = Math.max(lastinterval[1], end);
                }

                // no overlap
                else {
                    ans.add(new int[] { start, end });
                }
            }

        }
        return ans.toArray(new int[ans.size()][]);

    }
}