 //sliding window pattern
 class Solution {
   public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int min = nums.length + 1;

    for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){

            int count = right-left+1;

             if(count < min){
                min = count;
            }
            sum -= nums[left];
            left++;
        }
        
    
}
    return min == nums.length + 1 ? 0 :  min;
        }
}

