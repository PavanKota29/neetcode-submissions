class Solution {

    
    public void Solve(int col,int[] leftrow,int[] upper,int[] lower,List<List<String>> res,char[][] ans,int n){
        if(col == n){
            List<String>temp= new ArrayList<>();
            for(char[] i:ans){
                temp.add(new String(i));
            }

            res.add(temp);
            return;
        }

        for(int row = 0;row<n;row++){
            if(leftrow[row] == 0 && upper[row+col] == 0 && lower[n-1+col-row] == 0){
                ans[row][col] = 'Q';
                leftrow[row] = 1;
                upper[row+col] = 1;
                lower[n-1+col-row] = 1;
                Solve(col+1,leftrow,upper,lower,res,ans,n);
                ans[row][col] = '.';
                leftrow[row] = 0;
                upper[row+col] = 0;
                lower[n-1+col-row] = 0;

            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] ans = new char[n][n];
        int[] leftrow = new int[n];
        int[] upper = new int[2*n-1];
        int[] lower = new int[2*n-1];
        for(char[] i:ans){
            Arrays.fill(i,'.');
        }

        Solve(0,leftrow,upper,lower,res,ans,n);
        return res;
    }
}
