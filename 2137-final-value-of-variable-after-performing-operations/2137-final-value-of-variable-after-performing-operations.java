class Solution {
    public int finalValueAfterOperations(String[] operations) {
         
        int X = 0;
        for(int i = 0; i < operations.length;i++){
            String coperation = operations[i];
            if(coperation.equals("X--") || coperation.equals("--X")){
                X = X - 1;
            }if(coperation.equals("X++") || coperation.equals("++X")){
                X  = X +1;
            }
        }return X;
        
    }
}