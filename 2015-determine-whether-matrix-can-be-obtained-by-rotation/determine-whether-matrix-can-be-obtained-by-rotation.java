class Solution {
    private static  void rotateMat(int [][] mat) {
        for(int i=0;i<mat.length;i++){
            for (int j=i;j<mat.length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < mat.length; i++) {
            int left = 0;
            int right = mat.length - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }

    }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
           if(mat.length==0 && mat.length==1){
            return true;
           }else {
                for(int i=0;i<4;i++){
                    rotateMat(mat);
                    if( Arrays.deepEquals(mat, target)){
                        return true;
                    }
                }
           }
           return false;
    }
}