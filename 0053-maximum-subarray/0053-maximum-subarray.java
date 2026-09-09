class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int sum = nums[0];
        int maxsum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum >= 0){
                sum = sum + nums[i];
            }
            else{
                sum = nums[i];
            }
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        return maxsum;
    }
}