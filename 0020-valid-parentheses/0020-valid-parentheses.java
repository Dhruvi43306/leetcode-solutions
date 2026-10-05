class Solution {
    int top = -1;
    public boolean isValid(String s) {
     char[] stack = new char[s.length()];
   
       for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                top++;
                stack[top] = ch;
            }
            else{
                  if (top == -1) 
                    return false;

                char open = stack[top];
                top--;  
                if (!isMatch(open, ch)) {
                    return false;
                }  
            }
         }
        
        return top == -1;
        
    }
    
    public boolean isMatch(char open, char close) {

        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}