class Solution {
    public int minOperations(String s) {
        int zeroString=0;
        int oneString=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                System.out.println(i);
                if(s.charAt(i)=='0'){
                     oneString++;
                }else if(s.charAt(i)=='1'){
                      zeroString++;
                }
            }else if(i %2!=0){
                if(s.charAt(i)=='0'){
                     zeroString++;
                }else if(s.charAt(i)=='1'){
                      oneString++;
                }
            }
        }
        return Math.min(zeroString ,oneString);
    }
}