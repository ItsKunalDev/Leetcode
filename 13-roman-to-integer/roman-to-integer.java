class Solution {
    public int romanToInt(String s) {
        int[] num = {1, 5, 10, 50, 100, 500, 1000};
        String[] str = {"I", "V", "X", "L", "C", "D", "M"};

        String[] arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int val1 = 0;
            if (arr[i].equals(str[0])) {
                val1 = num[0];
            } else if (arr[i].equals(str[1])) {
                val1 = num[1];
            } else if (arr[i].equals(str[2])) {
                val1 = num[2];
            } else if (arr[i].equals(str[3])) {
                val1 = num[3];
            } else if (arr[i].equals(str[4])) {
                val1 = num[4];
            } else if (arr[i].equals(str[5])) {
                val1 = num[5];
            } else if (arr[i].equals(str[6])) {
                val1 = num[6];
            }
            if (i + 1 < arr.length) {
                int val2 = 0;
                if (arr[i + 1].equals(str[0])) {
                    val2 = num[0];
                } else if (arr[i + 1].equals(str[1])) {
                    val2 = num[1];
                } else if (arr[i + 1].equals(str[2])) {
                    val2 = num[2];
                } else if (arr[i + 1].equals(str[3])) {
                    val2 = num[3];
                } else if (arr[i + 1].equals(str[4])) {
                    val2 = num[4];
                } else if (arr[i + 1].equals(str[5])) {
                    val2 = num[5];
                } else if (arr[i + 1].equals(str[6])) {
                    val2 = num[6];
                }

                if (val1 < val2) {
                    sum -= val1;
                    continue;
                }
            }

            sum += val1;
        }

        return sum;
    }
}
