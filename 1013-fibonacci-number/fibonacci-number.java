class Solution {
    public int fib(int n) {
        int r=function(n);
        return r;
    }
    public static int function(int n){
        if(n==0||n==1){
            return n;
        }
        int fib1 = function(n - 1);
        int fib2 = function(n - 2); 
        int sum = fib1 + fib2;
        return sum;
    }
}