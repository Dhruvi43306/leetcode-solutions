class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       int ans = 0,h=0;
       int i = 0,j = n-1;
    while(i < j){
            int w = j - i;
            if(height[i] < height[j]){
                h = height[i];
            }
            else{
                h = height[j];
            }
            int area = w * h;
            if(ans < area){
                ans = area;
            }
        if(height[i] < height[j]){
            i++;
        }
        else{
            j--;
        }
       }
       return ans; 
    }
}