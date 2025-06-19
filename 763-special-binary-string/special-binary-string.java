class Solution {
    public String makeLargestSpecial(String s) {
        List<String> specials = new ArrayList<>();
        int count = 0, start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;

            if (count == 0) {
                String inner = s.substring(start + 1, i);
                String special = "1" + makeLargestSpecial(inner) + "0";
                specials.add(special);
                start = i + 1;
            }
        }

        
        specials.sort(Comparator.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (String str : specials) {
            result.append(str);
        }
        return result.toString();
    }
}