class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
        char h1, h2, l1, l2;
        int hp, lp;

        if (x > y) {
            h1 = 'a';
            h2 = 'b';
            hp = x;
            l1 = 'b';
            l2 = 'a';
            lp = y;
        } else {
            h1 = 'b';
            h2 = 'a';
            hp = y;
            l1 = 'a';
            l2 = 'b';
            lp = x;
        }

        StringBuilder sb1 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb1.length() > 0 && sb1.charAt(sb1.length() - 1) == h1 && c == h2) {
                sb1.deleteCharAt(sb1.length() - 1);
                score += hp;
            } else {
                sb1.append(c);
            }
        }

        StringBuilder sb2 = new StringBuilder();
        for (char c : sb1.toString().toCharArray()) {
            if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == l1 && c == l2) {
                sb2.deleteCharAt(sb2.length() - 1);
                score += lp;
            } else {
                sb2.append(c);
            }
        }

        return score;
    }
}