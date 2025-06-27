class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        while(n!=0){
            int p=n%10;
            n/=10;
            pro*=p;
            sum+=p;
        }
        int q = pro-sum;
        return q;
    }
}