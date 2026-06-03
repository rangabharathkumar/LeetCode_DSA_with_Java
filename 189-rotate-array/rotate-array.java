class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reversingArr(nums,0,nums.length-1);
        reversingArr(nums,0,k-1);
        reversingArr(nums,k,nums.length-1);
        
    }
    public int [] reversingArr(int [] nums,int start,int end){

        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    } 
}