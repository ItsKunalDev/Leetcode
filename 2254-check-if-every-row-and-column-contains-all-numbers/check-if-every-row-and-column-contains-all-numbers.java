class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            boolean[] rowCheck = new boolean[n + 1];
            boolean[] colCheck = new boolean[n + 1];

            for (int j = 0; j < n; j++) {
                int rowVal = matrix[i][j];
                int colVal = matrix[j][i];

                
                if (rowVal < 1 || rowVal > n || rowCheck[rowVal]) {
                    return false;
                }
                rowCheck[rowVal] = true;

                
                if (colVal < 1 || colVal > n || colCheck[colVal]) {
                    return false;
                }
                colCheck[colVal] = true;
            }
        }
        return true;
    }
}