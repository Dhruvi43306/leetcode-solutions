class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        int n = s.length();
        for(int i = 0; i < n; i++){
            boolean visisted[] = new boolean[256];
            int length = 0;
            for(int j = i; j < n; j++){
               
                char str = s.charAt(j);
                if(visisted[str]){
                    break;
                }
                else{
                    visisted[str] = true;
                    length++;
                }
             
            }
            if(length > maxlength){
                maxlength = length;
            }
        }
        return maxlength;
    }
}