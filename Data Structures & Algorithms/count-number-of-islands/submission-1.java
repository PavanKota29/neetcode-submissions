class Solution {

    public void dfs(int i,int j,char[][] mat,boolean[][] vis,
                    int m,int n){
        if(i < 0 || j < 0 || i >= m || j>=n || mat[i][j] == '0' || vis[i][j]){
            return;
        }
        
        vis[i][j] = true;
        
        dfs(i + 1,j,mat,vis,m,n);// upper row
        dfs(i - 1,j,mat,vis,m,n);// lower row
        dfs(i,j+1,mat,vis,m,n);// left col
        dfs(i,j-1,mat,vis,m,n);// right col
    }

    public int solve(char[][] ch){
        int n = ch.length;
        int m = ch[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(ch[i][j] == '1' && !vis[i][j]){
                    dfs(i,j,ch,vis,n,m);
                    count++;
                }
            }
        }
        return count;
    }
    public int numIslands(char[][] grid) {

        return solve(grid);
        
    }
}
