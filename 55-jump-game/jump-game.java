class Solution {
    public boolean canJump(int[] nums) {
       int fp=nums.length-1;
       for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=fp){
                fp=i;
            }
        }
        return fp==0;
    }
}