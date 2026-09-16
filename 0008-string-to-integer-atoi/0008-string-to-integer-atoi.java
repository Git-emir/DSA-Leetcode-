class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int idx = 0;
        while (idx < s.length() && s.charAt(idx) == ' ') {
            idx++;
        }
        if (idx < s.length() && (s.charAt(idx) == '-' || s.charAt(idx) == '+')) {
            if (s.charAt(idx) == '-') {
                sign = -1;
            }
            idx++;
        }
        int num = 0;
        while (idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
            int digit = s.charAt(idx) - '0';

            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            idx++;
        }
        return num * sign;
    }
}