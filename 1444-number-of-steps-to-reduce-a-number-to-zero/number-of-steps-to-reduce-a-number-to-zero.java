class Solution {
    public int numberOfSteps(int num) {
        return function(num);
    }
    public static int function(int num){
        int count=0;
        while(num!=0){
            if(num%2==0){
                num/=2;
            }
            else{
                num-=1;
            }
            count++;
        }
        return count;
    }
}