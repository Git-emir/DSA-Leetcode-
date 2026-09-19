class Solution {
    public String countAndSay(int n) {
        String res = "";
        if( n== 1) return "1";
        String say = countAndSay(n-1);
        for(int i =0;i<say.length();i++){
            int count = 1;
            char ch = say.charAt(i);
            while(i<say.length()-1 && ch == say.charAt(i+1)){
                count++;
                i++;
            }
            res += count;
            res += ch;
        }return res;
    }
}