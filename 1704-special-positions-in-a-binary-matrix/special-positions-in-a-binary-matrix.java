import java.awt.Point;
class Solution {
    public int numSpecial(int[][] mat) {
        /* Set <Point> set= new HashSet<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                final int currI=i;
                final int currJ=j;
                if(mat[i][j]==1){
                    Optional <Point> found =set.stream()
                                            .filter(p -> p.x ==currI || p.y == currJ)
                                            .findFirst();

                    if(found.isPresent()){
                        Point temp = found.get();
                        set.remove(temp);
                    }else {set.add(new Point(currI,currJ));}
                } 
            }
        }
        return set.size(); */
        int [] rowCount= new int [mat.length];
        int [] colCount =new int [mat[0].length];
        for(int i=0;i<mat.length;i++){
            int Count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    Count++;
                }
            }rowCount[i]=Count;
            }
        for(int i=0;i<mat[0].length;i++){
            int Count=0;
            for(int j=0;j<mat.length;j++){
                if(mat[j][i]==1){
                    Count++;
                }
            }colCount[i]=Count;
            }
        int finalCount=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && rowCount[i]==1 && colCount[j] ==1){
                    finalCount++;
                }
            }
            }
        return finalCount;
    }
}