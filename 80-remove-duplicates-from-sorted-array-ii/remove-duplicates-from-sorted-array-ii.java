/*class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        int j=2;
        int n=nums.length;
        int count=0; 
        while(j<n){
            if(nums[i]==nums[j] && count < 2){
              j++;
              count++;  
              System.out.println(Arrays.toString(nums)+""+"1" +" "+count +" "+i+" "+j);
            }else if(nums[i]==nums[j] && count >=2 ){
                j++;
                System.out.println(Arrays.toString(nums)+""+"2"+" "+count+" "+i+" "+j);
            }else if(nums[i] != nums[j] && count == 2){
                nums[i]=nums[j];
                j++;
                count=0;
                System.out.println(Arrays.toString(nums)+""+"33"+" "+count+" "+i+" "+j);
            }
            else if (nums[i] != nums[j] && count > 2){
                nums[i+1]=nums[j];
                i++;
                j++;
                count=0;
                System.out.println(Arrays.toString(nums)+""+"3"+" "+count+" "+i+" "+j);
            }
            else if(nums[i] != nums[j] && count<=1 ){
                i++;
                j++;
                count=0;
                System.out.println(Arrays.toString(nums)+""+"4"+" "+count +" "+i+" "+j );
            }
            
    }
    return n-1;
    }
} */



class Solution {
    public int removeDuplicates(int[] nums) {
    int j=2;
    for (int i=2;i<nums.length;i++){
        if(nums[i]!=nums[j-2]){
               nums[j]=nums[i];
               j++;
        }
    }
    return j;
    }
    
}