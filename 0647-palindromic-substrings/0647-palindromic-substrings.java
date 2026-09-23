class Solution {
    public int countSubstrings(String s) {
        int count =0;
        for(int i =0;i<s.length();i++){
            count += expand(i,i,s);
            count += expand(i,i+1,s);
        }
        return count;
    }
    private int expand(int st,int e,String s){
        int count = 0;
        while(st >= 0 && e < s.length() && s.charAt(st) == s.charAt(e)){
                count++;
                st--;
                e++;
        }return count;
    }
}