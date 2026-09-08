class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum = 1;
        int[] ans = new int[n+1];

     for(int i = n-1; i >= 0; i--){
        if(digits[i] < 9){
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
     }
     //special case like 999 so become 1000
        ans[0] = 1;
        return ans;
    }
}