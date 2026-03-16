class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxlen = 0;
        while(right < s.length()){
            if(hm.containsKey(s.charAt(right))){
                 left = Math.max(left , hm.get(s.charAt(right)) +1);
            }hm.put(s.charAt(right), right);
             maxlen = Math.max(maxlen,right - left +1);
             right++;
        }return maxlen;
    }
}