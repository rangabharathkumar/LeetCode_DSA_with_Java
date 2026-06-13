class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;

        if(nums.length==0){
            return arr;
        }
        if(nums.length==1){
            System.out.println(nums.length);
            if(nums[0]==target){
                arr[0]=0;
                arr[1]=0;
                return arr;
        }
        }
        int left=0;
        int right=nums.length-1;

        while(left<right){
            if(nums[left]==target && nums[right]==target){
                arr[0]=left;
                arr[1]=right;
                return arr;
            }
            else if (nums[left]==target && nums[right]!=target){
                arr[0]=left;
                arr[1]=left;
                right--;
            }
            else if (nums[left]!=target && nums[right]==target){
                arr[1]=right;
                arr[0]=right;
                left++;
            }
            else{
                left++;
                right--;
            }                        
        }
        if(left == right && nums[left]==target ){
            arr[0]=left;
            arr[1]=left;
        }
        

        return arr;
    }
}