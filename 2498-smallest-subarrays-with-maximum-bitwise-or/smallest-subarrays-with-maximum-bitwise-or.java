class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        

        int[] last_occurrence = new int[30];
    
        for (int i = n - 1; i >= 0; i--) {
           
            for (int p = 0; p < 30; p++) {
                if (((nums[i] >> p) & 1) == 1) {
                    last_occurrence[p] = i;
                }
            }

            int farthest_index = i;
            for (int p = 0; p < 30; p++) {
                farthest_index = Math.max(farthest_index, last_occurrence[p]);
            }
            
           
            answer[i] = farthest_index - i + 1;
        }
        
        return answer;
    }
}