class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        int left = 0;
        int right = 0;
        int count = m;
        int minlen = Integer.MAX_VALUE;
        int startidx = -1;

        while (right < n) {
            char ch = s.charAt(right);
            if (hm.containsKey(ch)) {
                if (hm.get(ch) > 0) {
                    count--;
                }
                hm.put(ch, hm.get(ch) - 1);
            }

            while (count == 0) {
                if (right - left + 1 < minlen) {
                    minlen = right - left + 1;
                    startidx = left;
                }
                char lch = s.charAt(left);
                if (hm.containsKey(lch)) {
                    hm.put(lch, hm.get(lch) + 1);

                    if (hm.get(lch) > 0) {
                        count++;
                    }
                }
                left++;

            }
            right++;

        }
        
        if (startidx == -1) {
            return "";
        }
        return s.substring(startidx, startidx + minlen);
    }
}