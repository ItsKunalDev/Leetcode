class Solution {
    public int repeatedNTimes(int[] arr) {
        Arrays.sort(arr); 
        for (int i=0; i<arr.length-1;i++){
            if (arr[i]==arr[i+1]||arr[i]==arr[i+2]){
                return arr[i];
            }
        }

        return -1;
    }
}