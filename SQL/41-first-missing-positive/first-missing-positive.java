class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> set= new HashSet<> ();
         for (int i=0;i<nums.length;i++){
            if(nums[i]>0){
                set.add(nums[i]);
            }
         }
        if(set.size()==0){
            return 1;
        }
        int n=1;
         while(set.contains(n)){
            n++;
         }
         return n;
    }
}