class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int right =0;
        int max = 0;
        int n = nums.length;
        int count =0;
        while(right < n){
            if(nums[right] == 1){
                count++;
                right++;
                max = Math.max(max,count);
            }else if(nums[right] != 1){
                count =0;
                right++;
            }

        }return max;
        
    }
}