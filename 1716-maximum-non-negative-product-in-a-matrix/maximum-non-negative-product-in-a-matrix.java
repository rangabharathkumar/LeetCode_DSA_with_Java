class Solution {
    public int maxProductPath(int[][] grid) {
        final int MOD =1000000000 +7;
        int m=grid.length;
        int n=grid[0].length;
        long[][] maxMatrix=new long[m][n];
        long[][] minMatrix=new long[m][n];

        maxMatrix[0][0]=grid[0][0];
        minMatrix[0][0]=grid[0][0];

        for (int i = 1; i < m; i++) {
            maxMatrix[i][0] = maxMatrix[i - 1][0] * grid[i][0];
            minMatrix[i][0] = minMatrix[i - 1][0] * grid[i][0];
        }


        for (int j = 1; j < n; j++) {
            maxMatrix[0][j] = maxMatrix[0][j - 1] * grid[0][j];
            minMatrix[0][j] = minMatrix[0][j - 1] * grid[0][j];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(grid[i][j]>= 0){
                     maxMatrix[i][j] =Math.max(maxMatrix[i][j - 1], maxMatrix[i - 1][j]) * grid[i][j];
                    minMatrix[i][j] =Math.min(minMatrix[i][j - 1], minMatrix[i - 1][j]) * grid[i][j];
                }else{
                    maxMatrix[i][j] =Math.min(minMatrix[i][j - 1], minMatrix[i - 1][j]) * grid[i][j];
                    minMatrix[i][j] =Math.max(maxMatrix[i][j - 1], maxMatrix[i - 1][j]) * grid[i][j];
                }
            }
        }

        if(maxMatrix [m-1][n-1] <0){
            return -1;
        }else{
            return (int)(maxMatrix[m-1][n-1]%MOD);
        }
    }
}