class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet <Integer> set = new HashSet<>();
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int num=arr1[i];
            while(num>0){
                set.add(num);
                num/=10;
            }
        }
        for(int j=0;j<arr2.length;j++){
            int num=arr2[j];
            while(num>0){
                if(set.contains(num)){
                   if((int)Math.log10(num)+1>count){
                      count=(int)Math.log10(num)+1;
                   }
                }
                num/=10;
            }            
        }

        return count;
    }
}