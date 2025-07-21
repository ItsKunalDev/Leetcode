class Solution {
    public String makeFancyString(String s) {
        if (s.length() < 3) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int len = sb.length();

            if (len >= 2 && sb.charAt(len - 1) == c && sb.charAt(len - 2) == c) {
                continue;
            }
            
            sb.append(c);
        }

        return sb.toString();
    }
}