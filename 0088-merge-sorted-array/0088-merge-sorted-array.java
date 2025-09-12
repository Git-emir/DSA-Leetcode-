class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    int start = m-1;
    int end = n-1;
    int p = m+n -1;  //pointer to the last element
    while(start >= 0 && end >= 0){
        if(nums1[start] > nums2[end]){
            nums1[p] = nums1[start];
            start --;
        }else {
            nums1[p] = nums2[end];
            end --;
        }
        p--;
    }
    while(end >= 0){
        nums1[p] = nums2[end];
        p--;
        end --;

    }
    }
}