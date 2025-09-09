class Solution {
    public int pivotIndex(int[] nums) {
        

        int prefix[] = new int[nums.length];
        int suffixsum[] = new int[nums.length];
        prefix[0] = nums[0];
        
        for(int i= 1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
            
        }
        suffixsum[nums.length -1] = nums[nums.length -1];
        for(int i = nums.length -2;i>0;i--){
            suffixsum[i] = suffixsum[i +1] + nums[i];
           
        }
            for(int i = 0;i<nums.length;i++){
                int right = (i == nums.length -1) ? 0 : suffixsum[i+1];
                int left = (i == 0)? 0: prefix[i-1];
                if(right == left){
                return i;
            
            }
            
            
        }return -1;
        
    }
}