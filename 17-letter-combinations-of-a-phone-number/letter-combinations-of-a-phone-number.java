class Solution {
    final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> str=new ArrayList<>();
        int len = digits.length();
        if(len==0){
 
            return str;
        }
        function(0,digits,"",str);
        return str;

    }
    public static void function(int nums, String digits, String c, List<String> str){
        if(nums==digits.length()){
            str.add(c);
        }
        else{
           int pos = Character.getNumericValue(digits.charAt(nums));
            char[] l = L[pos];
            for (int i = 0; i < l.length; i++) {
                function(nums + 1, digits, c + l[i], str);
            }
        }
    }

}