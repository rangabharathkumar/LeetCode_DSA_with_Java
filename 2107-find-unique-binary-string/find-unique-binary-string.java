class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder out=new StringBuilder ();
        for(int i=0;i<nums.length;i++){
            String num=nums[i];
            if(num.charAt(i)=='0'){
                out.append('1');
            }else if(num.charAt(i)=='1'){
                out.append('0');
            }
        }
        return out.toString();
    }
}