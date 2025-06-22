class Solution {
    static int count =0;
    public int totalNQueens(int n) {
        count =0;
        char [][]b=new char [n][n];
        for(int i=0;i<b.length;i++){
            for(int j=0; j<b.length;j++){
                b[i][j]='X';
            }
        }
        function(b,0);
        return count;
        
    }

    public static void function(char[][]b,int row ){
        if(row==b.length){
            count++;
            return;
        }
        for(int i=0;i<b.length ;i++){
            if(isSafe(b,row , i)){
                b[row][i]='Q';
                function(b,row+1);
                b[row][i]='X';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row, int col){
        for (int i =row -1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for (int i =row -1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for (int i =row -1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}