class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        int[] a = new int[m+n];

        while(i >=0  && j >= 0){
            if(nums1[i] > nums2[j]){
                a[k--] = nums1[i--];
            }
            else{
                a[k--] = nums2[j--];
            }
        }
          while(i >= 0) {
            a[k--] = nums1[i--];
        }

        while(j >= 0) {
            a[k--] = nums2[j--];
        }
        int total = m+n;
        if(total % 2 == 1){
            return a[total/2];
       }
      
       return (a[total/2] + a[(total/2)-1]) / 2.0;
    }
}