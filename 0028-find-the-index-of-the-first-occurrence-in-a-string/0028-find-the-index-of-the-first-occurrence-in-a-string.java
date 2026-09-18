class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int[] kmp = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (needle.charAt(i) == needle.charAt(len)) {
                len++;
                kmp[i] = len;
                i++;
            } 
            else if (len != 0) {
                len = kmp[len - 1];
            } 
            else {
                kmp[i] = 0;
                i++;
            }
        }
        int start = 0;
        int end = 0;
        while (start < haystack.length()) {
            if (haystack.charAt(start) == needle.charAt(end)) {
                start++;
                end++;
                if (end == n) {
                    return start - end;
                }
            } 
            else if (end != 0) {
                end = kmp[end-1];
            } 
            else {
                start++;
            }

        }
        return -1;
    }
}