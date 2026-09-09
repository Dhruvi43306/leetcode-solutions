class Solution {
    public int missingNumber(int[] nums) {
        int k = 0;
        for(int i = 0; i <= nums.length; i++){
            k = i;
          for(int j = 0; j < nums.length; j++){
            if(i == nums[j]){
                k = 0;
                break;
            }
            
          }
          if(k != 0)
            return k;            
        }
        return k;
    }
}