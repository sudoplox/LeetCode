200. Number of Islands
https://leetcode.com/problems/number-of-islands/


class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }   
        int rown=grid.length;
        int coln=grid[0].length;
        // boolean[][] visited=new visited[rown][coln];
        int ans=0;
        for(int i=0;i<rown;i++){
            for(int j=0;j<coln;j++){
                if(grid[i][j]=='1'){
                    ans+=dfs(grid,i,j);
                }
            }
        }
        return ans;
    }
    public int dfs(char[][] grid,int i , int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length ||grid[i][j]=='0'){
            return 0;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
        return 1;
    }
    
}

Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Islands.
Memory Usage: 40.5 MB, less than 99.74% of Java online submissions for Number of Islands.