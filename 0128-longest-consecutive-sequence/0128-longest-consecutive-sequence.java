class Solution {
    public int longestConsecutive(int[] nums) {
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
                
                }if(count>maxlength){
                    maxlength = count;
                }


        }
        }return maxlength;
            
            
        
    }
}
