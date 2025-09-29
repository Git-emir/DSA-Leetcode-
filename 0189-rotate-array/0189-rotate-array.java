class Solution {
    public void rotate(int[] nums, int k) {
        /*int temp[] = new int[nums.length];
       
         k = k%nums.length;

        
        for(int i = 0 ;i< nums.length;i++){
          temp[(i + k)%nums.length] = nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            nums[i] = temp[i];


        }*/
        k = k % nums.length;
        reverse(nums,0,nums.length - k - 1);
        reverse(nums,nums.length - k,nums.length-1);
        reverse(nums,0,nums.length-1);

        
    }
    public void reverse(int nums[],int s,int e){
        while(s< e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
}