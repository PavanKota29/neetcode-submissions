class Solution {

    public boolean isSafe(int row,int col,char[][] ans,int n){
        int i = row;
        int j = col;

        while(i>=0 && j>=0){
            if(ans[i][j]=='Q') return false;
            i--;
            j--;
        }

        i = row;
        j = col;

        while(j>=0){
            if(ans[i][j] == 'Q') return false;
            j--;
        }

        i = row;
        j = col;

        while(i<n && j>=0){
            if(ans[i][j] == 'Q') return false;
            i++;
            j--;
        }

        return true;

    }
    public void Solve(int col,List<List<String>> res,char[][] ans,int n){
        if(col == n){
            List<String>temp= new ArrayList<>();
            for(char[] i:ans){
                temp.add(new String(i));
            }

            res.add(temp);
            return;
        }

        for(int row = 0;row<n;row++){
            if(isSafe(row,col,ans,n)){
                ans[row][col] = 'Q';
                Solve(col+1,res,ans,n);
                ans[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] ans = new char[n][n];
        for(char[] i:ans){
            Arrays.fill(i,'.');
        }

        Solve(0,res,ans,n);
        return res;
    }
}
