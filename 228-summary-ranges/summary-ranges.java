class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> outArr=new ArrayList<>();
        int j=0;
        int i=1;
        if (nums.length ==0 )return outArr;
        while(i<nums.length){
            if((nums[i-1]+1) == nums[i]){
               i++;
            }else if (j==i-1){
               outArr.add(String.valueOf(nums[j]));
               j=i;
               i++;
            }
            else{
                outArr.add(nums[j]+"->"+nums[i-1]);
                System.out.println(i);
                j=i;
                i++;
            }
        }
        if(j == nums.length-1){
            outArr.add(String.valueOf(nums[j]));
        }else {
            outArr.add(nums[j] + "->" + nums[nums.length - 1]);
        }
        return outArr;
    }
}