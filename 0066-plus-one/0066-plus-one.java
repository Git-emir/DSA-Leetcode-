class Solution {
    public int[] plusOne(int[] digits) {
        int x = digits.length ;
      
      for(int i = x -1;i>=0;i--){
        digits[i]++;
        if(digits[i]<10){
            return digits;
        }digits[i] =0;

      }int[] newdigit = new int[x+1];
      newdigit[0] =1;
      return newdigit;
    }
}