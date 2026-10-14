class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = temperatures[i];
            if (st.isEmpty()) {
                st.push(i);
            } else {
                while (!st.isEmpty() && temperatures[st.peek()] < temp) {
                    int prev = st.pop();
                    ans[prev] = i - prev;

                }

                st.push(i);
            }

        }
        return ans;
    }
}