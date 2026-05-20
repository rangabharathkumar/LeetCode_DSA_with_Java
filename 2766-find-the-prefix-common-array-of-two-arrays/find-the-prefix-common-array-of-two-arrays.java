class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer>counter=new HashMap<>();
        int [] C= new int[A.length];
        int i = 0;
        while(i < A.length){
            if(i>0){
            C[i]+=C[i-1];
            }
            if(counter.putIfAbsent(A[i],1) != null){
                C[i]+=1;
            }
            if(counter.putIfAbsent(B[i],1) != null){
                C[i]+=1;
                
            }

            i++;
        }
        return C;
    }
}