class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet <Integer> hs = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        
        int maxlength =0;
        for (int x : hs) {
            if (!hs.contains(x - 1)) {
                //int currentNum = x;
                int count = 1;

            while (hs.contains(x + count)) {
                    //currentNum++;
                    count++;
                
                } maxlength = Math.max(maxlength, count);


        }
        }return maxlength;
            
            
        
    }
}
