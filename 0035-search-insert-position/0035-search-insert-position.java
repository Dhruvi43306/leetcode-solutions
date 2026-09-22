class Solution {
    public int searchInsert(int[] nums, int target) {
       
        int j = 0;
        int n = nums.length;
          if(target == 0 && !(nums[j] < 0) || nums[j] > target){
            return 0;
        }
       
      
        
        for(int i = n-1; i >= 0; i--){
            if(nums[i] != target){
                if(target > nums[i]){
                    return i+1;
                }
                if(nums[i] < 0 && target > nums[i]){
                    return i+1;
                }
            }
                if(target == nums[i]){
                return i;
                }
            
        }
        return -1;
    }
}