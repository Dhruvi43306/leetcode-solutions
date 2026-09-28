class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(nums, 0, temp, ans);

        return ans;
    }
      void backtrack(int[] nums, int index, List<Integer> temp, List<List<Integer>> ans) {
        if(index == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        backtrack(nums,index+1,temp,ans);
        temp.remove(temp.size() - 1);  
        backtrack(nums, index + 1, temp, ans);      
    }
}