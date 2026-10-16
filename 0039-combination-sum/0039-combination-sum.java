class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        combination(0, candidates, ans, ds, target);
        return ans;
    }

    private void combination(int id, int[] candidates, List<List<Integer>> ans, List<Integer> ds, int target) {
        if (id == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (candidates[id] <= target) {
            ds.add(candidates[id]);
            combination(id, candidates, ans, ds, target - candidates[id]);
            ds.remove(ds.size() - 1);
        }
        combination(id + 1, candidates, ans, ds, target);
    }
}