class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s = m-1;
        int e = n-1;
        int p = m+n -1;
        while(s >=0 && e >=0){
            if(nums1[s] > nums2[e]){
                nums1[p] = nums1[s];
                s--;
            }else{
                nums1[p] = nums2[e];
                e--;
            }
            p--;
        }
        while(e >=0){
            nums1[p] = nums2[e];
            p--;
            e--;
        }
    }
}