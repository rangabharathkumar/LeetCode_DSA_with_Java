class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=k-1;
        double sum=0;
        double avg=0;
        while(right <= nums.length-1 && right-left+1==k){          
        if(left==0){
        for(int i=0;i<k;i++){
           sum+=nums[i];
        }
        avg=sum/k;
        }else{                
            sum-=nums[left-1];
            sum+=nums[right];       
            if((sum/k)>avg){
                avg=sum/k;
            }
        }
            left++;
            right++;
        
        }
        return avg;
    
    }
}