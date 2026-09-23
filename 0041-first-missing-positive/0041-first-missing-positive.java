class Solution {
    public int firstMissingPositive(int[] nums){
         int ans = 1;  
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= 0){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
           else if(nums[i] == ans){
                ans++;
           }

           else{
            return ans;
           }
        }
        
        return ans;   
    }
}