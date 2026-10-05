class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String prev = countAndSay(n-1);
        String ans = "";
        int i = 0;
       
        while(i < prev.length()){
             int count = 0;
            char currunt = prev.charAt(i);
            while(i < prev.length() && prev.charAt(i) == currunt){
                count++;
                i++;
            }
            ans = ans+count+currunt;
        }  
        return ans;  
    }
}