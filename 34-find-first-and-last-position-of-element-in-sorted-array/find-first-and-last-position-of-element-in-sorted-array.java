class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = firstOccur(nums, target, 0);
        int j = lastOccur(nums, target, 0);
        return new int[]{i, j};
    }

    public static int firstOccur(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, key, i + 1);
    }

    public static int lastOccur(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int found = lastOccur(arr, key, i + 1);
        if (found == -1 && arr[i] == key) {
            return i;
        }
        return found;
    }
}