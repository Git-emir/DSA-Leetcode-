class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int currSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < n; i++) {
            currSum += nums[i];
            int reqSum = currSum - k;
            if (hm.containsKey(reqSum)) {
                count += hm.get(reqSum);
            }
            if (hm.containsKey(currSum)) {
                hm.put(currSum,hm.get(currSum) + 1);

            } else {
                hm.put(currSum, 1);
            }
        }
        return count;
    }
}