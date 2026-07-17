class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    private void findCombination(int i,int[] candidates,int target,List<List<Integer>> ans,List<Integer> ds){
        if(i == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }return;
        }
        if(candidates[i] <= target){
            ds.add(candidates[i]);
            findCombination(i,candidates,target-candidates[i],ans,ds);
            ds.remove(ds.size() -1);
        }
        findCombination(i+1,candidates,target,ans,ds);
    }
}