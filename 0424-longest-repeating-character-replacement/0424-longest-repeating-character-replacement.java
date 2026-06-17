class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int l = 0;
        int r = 0;
        int freq = 0;
        int maxlen = 0;

        while (r < s.length()) {
            hs.put(s.charAt(r), hs.getOrDefault(s.charAt(r), 0) + 1);
            freq = Math.max(freq, hs.get(s.charAt(r)));
            if ((r - l + 1) - freq > k) {
                hs.put(s.charAt(l), hs.get(s.charAt(l)) - 1);
                l++;

            }
            if ((r - l + 1) - freq <= k) {
                maxlen = Math.max(maxlen, r - l + 1);

            }
            r++;
        }
        return maxlen;
    }
}