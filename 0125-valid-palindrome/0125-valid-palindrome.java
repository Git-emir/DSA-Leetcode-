class Solution {
    public boolean isPalindrome(String s) {
        int l =0;
        int r = s.length() -1;
        while(l<r){
            char lch = s.charAt(l);
            char rch = s.charAt(r);
            if(!Character.isLetterOrDigit(lch)){

                l++;
            }else if(!Character.isLetterOrDigit(rch)){
                r--;
            }else{
                lch = Character.toLowerCase(lch);
                rch = Character.toLowerCase(rch);
                if(lch == rch){
                    r--;
                    l++;

                }else{
                    return false;
                }
            }
        }return true;
    }
}