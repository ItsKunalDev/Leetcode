class Solution {
    public int largestRectangleArea(int[] arr) {
        int []nsl =function1(arr);
        int [] nsr= function2(arr);
        int max=0;
        for (int i=0 ; i<arr.length ; i++){
            int h= arr[i];
            int w= nsr[i]-nsl[i]-1;
            int a=h*w;
            max=Math.max(max,a);
        }
        return max;
    }
    public static int [] function1(int []arr){
        int n=arr.length;
        int []res =new int [n];
        Stack<Integer> s=new Stack<>();
        for (int i =0;i<n;i++){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=-1;
            }else{
                res[i]=s.peek();
            }
            s.push(i);
        }
        return res;
    }
    public static int [] function2(int []arr){
        int n=arr.length;
        int []res =new int [n];
        Stack<Integer> s=new Stack<>();
        for (int i =n-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=n;
            }else{
                res[i]=s.peek();
            }
            s.push(i);
        }
        return res;
    }
}