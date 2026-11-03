class Solution {

    static boolean isValidRow(char[][] mat,int row){

        int[] vis = new int[10];
        for(int i=0;i<9;i++){
            if(mat[row][i]!='.'){
                char val = mat[row][i];
                if(vis[val-'0']!=0){
                    return false;
                }
                vis[val-'0']++;
            }
        }
        return true;
    }

    static boolean isValidCol(char[][] mat,int col){

        int[] vis = new int[10];
        for(int i=0;i<9;i++){
            if(mat[i][col]!='.'){
                char val = mat[i][col];
                if(vis[val-'0']!=0){
                    return false;
                }
                vis[val-'0']++;
            }
        }
        return true;
    }

    static boolean isMatValid(char[][] mat,int srow,int ecol){

        int[] vis = new int[10];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                char curr = mat[i+srow][j+ecol];
                if(curr!='.'){
                    if(vis[curr-'0']!=0){
                        return false;
                    }
                    vis[curr-'0']++;
                }
            }
        }
        return true;
    }

    static boolean isValid(char[][] mat){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(!isValidRow(mat,i) || !isValidCol(mat,j) 
                || !isMatValid(mat,i-i%3,j-j%3)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return isValid(board);
    }
}
