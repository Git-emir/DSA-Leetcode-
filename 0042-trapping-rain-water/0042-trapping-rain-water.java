class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int prefixmax[] = new int[l];
        int suffixmax[] = new int[l];

        prefixmax[0] = height[0];

        for(int i =1;i<l;i++){
            prefixmax[i] = Math.max(prefixmax[i-1],height[i]);

        }
        suffixmax[l-1] = height[l-1];
         for(int i =l-2;i>=0;i--){
            suffixmax[i] = Math.max(suffixmax[i+1],height[i]);
            
        }int total =0;
        for(int i= 0;i<l;i++){
            if(height[i] < prefixmax[i] && height[i] < suffixmax[i]){
                int water = Math.min(prefixmax[i],suffixmax[i]) - height[i];
                 if (water > 0) {
                 total += water;
            }
            }
        }return total;
    }
}