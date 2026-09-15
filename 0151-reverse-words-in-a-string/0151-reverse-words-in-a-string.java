class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != ' ') {
                arr[index++] = arr[i];
            } else if (index > 0 && arr[index - 1] != ' ') {
                arr[index++] = ' ';
            }
        }
        if (index > 0 && arr[index - 1] == ' ') {
            index--;
        }
        int left = 0;
        int right = index - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        int start = 0;
        for (int i = 0; i < index - 1; i++) {
            if (arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        reverse(arr, start, index - 1);
        return new String(arr, 0, index);
    }

    private void reverse(char[] arr, int s, int e) {
        while (e > s) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}