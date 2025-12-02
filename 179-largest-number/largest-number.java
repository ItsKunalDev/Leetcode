class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String e[]=new String[n];
        for (int i=0;i<n;i++){
            e[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(e,new Comparator<String>(){
            public int compare(String a, String b){
                String f=a+b;
                String s=b+a;
                return s.compareTo(f);
            }
        });
        if (e[0].equals("0")){
            return "0";
        }
        String  res="";
        for(String val:e ){
            res+=val;
        }
        return res;
    }
}