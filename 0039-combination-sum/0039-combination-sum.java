class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        combination(candidates, target, 0, temp, ans);

        return ans;
    }

    public void combination(int[] candidates, int target, int left,
                            List<Integer> temp, List<List<Integer>> ans) {

        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = left; i < candidates.length; i++){

            if(candidates[i] > target){
                continue;
            }

            // Take
            temp.add(candidates[i]);

            combination(candidates, target - candidates[i], i, temp, ans);

            // Backtrack
            temp.remove(temp.size() - 1);
        }
    }
}