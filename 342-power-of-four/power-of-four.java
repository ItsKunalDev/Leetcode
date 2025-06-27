class Solution {
    public boolean isPowerOfFour(int n) {
        return function(4,n);
        
    }
    public static boolean function(int a, int n ){
        if(n==1){
            return true;
        }
        if(n <= 0 || n % a != 0 ){
            return false;
        }
        return function(a,n/a);
    }
}