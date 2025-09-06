class Solution {
    public int[] searchRange(int[] nums, int target) {   
        int first = findFirst(nums,target);
        int second = findSecond(nums,target);
        return new int[]{first,second};
    }
       private int findFirst(int[] nums ,int target){
        int s = 0; int e = nums.length -1; int ans = -1;
        while(s <= e){
            int m = (s + e)/2;
            if(nums[m] > target){
                e = m-1;
            }else if(nums[m] == target){
                ans = m;
                e = m-1;

                
                }else{
                s = m+1;

            }
        } return ans;
       } 

       private int findSecond(int[] nums,int target){
        int s = 0; int e = nums.length -1; int ans = -1;
        while(s <= e){
            int m = (s+e)/2;
            if(nums[m] == target){
                ans = m;
                s = m+1;

            }else if(nums[m] > target){
                e = m-1;

            }else{
                s = m+1;
            }
        }return ans;
       }       
        
    
}