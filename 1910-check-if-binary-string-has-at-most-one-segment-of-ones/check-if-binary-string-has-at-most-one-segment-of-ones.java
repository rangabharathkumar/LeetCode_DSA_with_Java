class Solution {
    public boolean checkOnesSegment(String s) {
        boolean state=false;
        boolean zeroState=false;
        for(int i =0;i<s.length();i++){
            if(s.charAt(0)=='0'){
                return false;
            }else if (s.charAt(i)=='1' && !zeroState){
                  state=true;
            }else if(s.charAt(i)=='0' && state && !zeroState){
                zeroState=true;
            }else if(s.charAt(i)=='1' && zeroState){
                return false;
            }
        }
        return state;
    }
}