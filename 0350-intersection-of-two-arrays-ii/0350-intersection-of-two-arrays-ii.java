class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
     
      for(int i = 0; i < nums1.length; i++){
            count[nums1[i]]++;
      }
      int k = 0;
       int[] ans = new int[Math.min(nums1.length, nums2.length)];
        for(int i = 0; i < nums2.length; i++){
           if(count[nums2[i]] > 0){
                ans[k] = nums2[i];
                k++;

                count[nums2[i]]--;
           }
      }
      return java.util.Arrays.copyOf(ans,k);
    }
}