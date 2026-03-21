class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int top=x;
        int bottom=x+k-1;
        int i=y;
        while(top <(x+k/2)){
            System.out.println(".");
            while(i<=y+k-1){
            grid[top][i]=grid[top][i]+grid[bottom][i];
            grid[bottom][i]=grid[top][i]-grid[bottom][i];
            grid[top][i]=grid[top][i]-grid[bottom][i];
            System.out.println(grid[top][i]+"1");
            System.out.println(grid[bottom][i]);
            i++;
        }
        i=y;
        top++;
        bottom--;
        }

        return grid;
    }
}