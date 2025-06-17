class Solution {
    public double myPow(double x, int n) {
        if (n< 0) {
            x = 1 / x;
            n = -n;
        }
        return function(x, n);
    }
    public static double function(double x, int n){
        if(n==0){
            return 1;
        }
        double p=function(x,n/2);
        double nums=p*p;
        if(n%2!=0){
            nums=x*nums;
        }
        return nums;
    }
}