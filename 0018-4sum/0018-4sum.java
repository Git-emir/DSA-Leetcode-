class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int l = j+1;
                int r = n-1;
                while(l<r){
                    long sum = (long)nums[i];
                    sum += nums[j];
                    sum += nums[l];
                    sum += nums[r];

                    if(sum == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[r]);

                        ans.add(temp);
                        l++;r--;
                        while(l<r && nums[l] == nums[l-1]) l++;
                        while(l<r && nums[r] == nums[r+1]) r--;
                        
                    }
                    else if((sum < target)){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return ans;

    }
}

// better approach
// int n = nums.length;
//         Set<List<Integer>> st = new HashSet<>();
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 Set<Integer> hs = new HashSet<>();
//                 for (int k = j + 1; k < n; k++) {
//                     long sum = (long) nums[i] + (long) nums[j];
//                     sum += nums[k];
//                     long fourth = (long) target - sum;
//                     if (fourth >= Integer.MIN_VALUE &&
//                             fourth <= Integer.MAX_VALUE &&
//                             hs.contains((int) fourth)) {
//                         List<Integer> temp = new ArrayList<>();

//                         temp.add(nums[i]);
//                         temp.add(nums[j]);
//                         temp.add(nums[k]);
//                         temp.add((int) fourth);

//                         Collections.sort(temp);
//                         st.add(temp);

//                     }
//                     hs.add(nums[k]);

//                 }
//             }
//         }
//         return new ArrayList<>(st);