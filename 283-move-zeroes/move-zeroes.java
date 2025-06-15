class Solution {
    public void moveZeroes(int[] nums) {
        int[] a=nums;
        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[j++] = a[i];
            }
        }

        while (j < a.length) {
            a[j++] = 0;
        }
    }
}