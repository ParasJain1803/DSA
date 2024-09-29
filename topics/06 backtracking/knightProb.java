public class knightProb {
        public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nKnights(board, 0);
        System.out.println(count);
    }

    public static boolean isSafe(char board[][], int row, int col) {
        
        int dx[] = {-2, -2, -1, -1, 1, 1, 2, 2};
        int dy[] = {-1, 1, -2, 2, -2, 2, -1, 1};

        for(int i = 0; i < 8; i++ ) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];

            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board.length && board[newRow][newCol] == 'K') {
                return false;                
            }
        }

        return true;
    }

    public static void nKnights(char board[][], int row) {
        if (row == board.length) {
            print(board);
            return;
        }
        for (int j = 0; j<board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'K';
                nKnights(board, row+1);
                board[row][j] = 'x';
            }
        }
    }
    static int count;
    public static void print(char board[][]) {
        count++;
        System.out.println("------Chess board------");
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board.length ; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
