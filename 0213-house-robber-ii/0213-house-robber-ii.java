class Solution {
    public int solve(int[] nums) {
        int n = nums.length;
        return sum(n-1,nums);

    }
    private int sum(int n,int[] nums){
        int prev = nums[0];
        int prev2 = 0;
        for(int i =1;i<nums.length;i++){
            int take = nums[i]; 
            if(i>1){
                take += prev2;
            } 
            int notTake = 0+prev;
            int curi = Math.max(take,notTake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
   


    public int rob(int[] nums) {
        int n = nums.length;
        if(n ==1) return nums[0];
        int[] temp1 = new int[n-1];
        int[] temp2 = new int[n-1];
        for(int i =0;i<n;i++){
            if(i!=0) temp1[i -1] = nums[i];
        }
        for(int i =0;i<n;i++){
            if(i != n-1) temp2[i] = nums[i];
        }

        return Math.max(solve(temp1),solve(temp2));

        
    }
}