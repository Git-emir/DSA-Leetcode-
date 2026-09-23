class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;
        int maxlen = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            //odd length
            int len1 = expand(i, i, s);
            //even lenght
            int len2 = expand(i, i + 1, s);

            int l = Math.max(len1, len2);
            if (l > maxlen) {
                maxlen = l;
                start = i - (l - 1) / 2;
            }
        }
        return s.substring(start, start + maxlen);
    }

    private int expand(int s, int e, String str) {
        while (s >= 0 && e < str.length() && str.charAt(s) == str.charAt(e)) {
            s--;
            e++;
        }
        return e - s - 1;
    }
}