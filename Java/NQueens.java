public class NQueens {
    public static void placeNQueens(int n) {
        int[][] board = new int[n][n];
        placeQueens(board, n, 0);
    }
    public static void placeQueens(int[][] board, int n, int row) {
        if(row == n){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    }
}
