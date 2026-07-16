class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int right = 0;
        int count = 0;
        int max = 0;

        while(right < nums.length){

            if(nums[right] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }

            right++;
        }

        return max;
    }
}