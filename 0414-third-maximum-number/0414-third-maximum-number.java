class Solution {
    public int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if((count >= 1 && nums[i] == max) ||
               (count >= 2 && nums[i] == smax) ||
               (count >= 3 && nums[i] == tmax)) {
                continue;
            }
            
            count++;
            if(nums[i] > max){
                tmax = smax;
                smax = max;
                max = nums[i];
               
            }
            else if(smax < nums[i] && nums[i] != max){
                tmax = smax;
                smax = nums[i];
            }
            else if(tmax < nums[i] && smax != nums[i] && max != nums[i]){
                tmax = nums[i];
            }
        }
        if(count < 3){
            return max;
        }
        return tmax;
    }
}