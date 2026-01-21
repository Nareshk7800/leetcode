class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int front = 0;
        int top = 0;
        int side = 0;
        for(int i=0;i<n;i++){
            int rowmax = 0;
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    top++;
                }
                rowmax = Math.max(rowmax,grid[i][j]);
            }
            front+=rowmax;
        }
        for(int j=0;j<n;j++){
            int colmax = 0;
            for(int i = 0;i<n;i++){
                colmax = Math.max(colmax,grid[i][j]);
            }
            side+=colmax;
        }
        return top+front+side;
    }
}