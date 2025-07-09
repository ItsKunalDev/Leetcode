class Solution {
    public boolean isValid(String s) {
        Stack<Character> str=new Stack<>();
        for(int i= 0 ; i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                str.push(ch);
            }else{
                if(str.isEmpty()){
                    return false;
                }
                if((str.peek()=='('&&ch==')')||(str.peek()=='{'&&ch=='}')||(str.peek()=='['&&ch==']')){
                    str.pop();
                }else{
                    return false;
                }
            }
        }
        if(str.isEmpty()){
            return true;
        }
        return false;
    }
}