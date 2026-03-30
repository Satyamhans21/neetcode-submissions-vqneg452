class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;

        for(int i=0;i<n;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<m;j++){
                if(board[i][j]=='.') continue;
                if(set.contains(board[i][j])) return false;
                set.add(board[i][j]);
            }
        }
        for(int i=0;i<m;i++){
            Set<Character> set=new HashSet<>();
            for(int j=0;j<n;j++){
                if(board[j][i]=='.') continue;
                if(set.contains(board[j][i])) return false;
                set.add(board[j][i]);
            }
        }

        for(int row=0;row<n;row+=3){
            for(int col=0;col<m;col+=3){
                Set<Character> set=new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        char c=board[row+i][col+j];
                        if(c=='.') continue;
                        if(set.contains(c)) return false;
                        set.add(c);
                    }
                }
            }
        }
        return true;
    }
}
