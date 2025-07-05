class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] arr = new int[nums.length][2];

       
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] = nums[i];  
            arr[i][1] = i;       
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int l = 0;
        int h = nums.length - 1;

        while (l < h) {
            int sum = arr[l][0] + arr[h][0];

            if (sum == target) {
                return new int[]{arr[l][1], arr[h][1]};
            } else if (sum < target) {
                l++;
            } else {
                h--;
            }
        }

        return new int[]{-1, -1}; 
    }
}