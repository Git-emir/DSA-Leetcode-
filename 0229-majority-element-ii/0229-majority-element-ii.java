class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        int ct1 = 0;
        int ct2 = 0;
        int el1 = 0;
        int el2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (ct1 == 0 && nums[i] != el2) {
                ct1 = 1;
                el1 = nums[i];
            } else if (ct2 == 0 && nums[i] != el1) {
                ct2 = 1;
                el2 = nums[i];

            } else if (el1 == nums[i]) {
                ct1++;
            } else if (el2 == nums[i]) {
                ct2++;
            }

            else {
                ct1--;
                ct2--;
            }
        }
        ct1 = 0;
        ct2 = 0;
        for (int i = 0; i < n; i++) {
            if (el1 == nums[i])
                ct1++;
            else if (el2 == nums[i])
                ct2++;
        }
        if (ct1 > n / 3)
            ls.add(el1);
        if (ct2 > n / 3)
            ls.add(el2);

        return ls;

    }
}