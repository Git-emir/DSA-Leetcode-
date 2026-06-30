class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> hs = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    long sum = (long) nums[i] + (long) nums[j];
                    sum += nums[k];
                    long fourth = (long) target - sum;
                    if (fourth >= Integer.MIN_VALUE &&
                            fourth <= Integer.MAX_VALUE &&
                            hs.contains((int) fourth)) {
                        List<Integer> temp = new ArrayList<>();

                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);

                        Collections.sort(temp);
                        st.add(temp);

                    }
                    hs.add(nums[k]);

                }
            }
        }
        return new ArrayList<>(st);

    }
}