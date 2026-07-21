class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxindx =0;
        for(int i =0;i<nums.length;i++){
            if(i > maxindx) return false;
            maxindx = Math.max(maxindx,i+nums[i]);
            if(maxindx >= n){
                return true;
            }

        }return true;

    }
}