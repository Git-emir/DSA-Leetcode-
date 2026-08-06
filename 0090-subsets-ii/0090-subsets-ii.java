class Solution {
    private void findSubset(int idx,int[] nums,List<List<Integer>> ans,List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i =idx;i<nums.length;i++){
            if(i!= idx && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubset(i+1,nums,ans,ds);
            ds.remove(ds.size() -1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        findSubset(0,nums,ans,new ArrayList<>());
        return ans;
    }
}