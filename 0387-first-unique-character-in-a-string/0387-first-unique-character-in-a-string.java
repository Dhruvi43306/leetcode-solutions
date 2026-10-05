class Solution {
    public int firstUniqChar(String s) {
        int i = 0;
        int n = s.length();
        
        while(i < n){
            int j = 0;
            boolean unique = true;
            while(j < n){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    unique = false;
                    break;
                }
                j++;
            }
            if(unique)
                return i;
            
        i++;
        }
        return -1;
    }
}