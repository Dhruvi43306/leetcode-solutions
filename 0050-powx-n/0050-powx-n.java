class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        long exp = n;       
        if(exp < 0)
         exp = -exp; 

        while(exp > 0){
            if(exp % 2 == 1){
                res = res*x;
            }
            x = x*x;
            exp /= 2;
        }
         return n < 0 ? 1 / res : res;  
    }
}
