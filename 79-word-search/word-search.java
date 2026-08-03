class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length; i++) {
            for(int j =0; j<board[0].length; j++) {
                if (dfs(board,word,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean dfs(char[][]board, String word, int x, int y, int index) {
        if( index == word.length()) {
            return true;
        }
        if( x < 0 || x >= board.length || y<0 || y>= board[0].length || board[x][y] != word.charAt(index)) {
            return false;
        }
        char temp = board[x][y];
        board[x][y] = '#';

        boolean found =
        dfs(board, word, x+1, y, index+1) ||
        dfs(board, word, x-1, y, index+1) ||
        dfs(board, word, x, y+1, index+1) ||
        dfs(board, word, x, y-1, index+1);
        board[x][y] = temp;
        return found;

    }
}