class Solution {
    public int maxArea(int[] height) {
        int l = height.length;
        int maxarea = 0;
        int le= 0;
        int r= l-1;

        while(le<r){
            int area = (r-le)* Math.min(height[le],height[r]);
            if(height[le]>=height[r]){
                r--;
            }else if(height[le]<= height[r]){
                le++;
                
            }

          if(area>maxarea){
            maxarea = area;
          }
        }return maxarea;
        


        //brute force
        // for(int i =0;i<l;i++){
        //     for(int j =1;j<l;j++){
        //         int area = (j-i)* Math.min(height[i],height[j]);
        //         if(area > maxarea){
        //            maxarea = area;
        //         }
        //     }
        // }return maxarea;
    }
}