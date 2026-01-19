class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int c=0;
        for (int i=0 ; i<n;i++){
            c+=nums[i];
        }
        int q= n*(n+1)/2;
        int sum = q-c;
        return sum;
    }
}