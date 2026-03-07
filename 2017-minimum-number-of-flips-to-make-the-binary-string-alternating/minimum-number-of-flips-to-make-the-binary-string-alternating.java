class Solution {
    public int minFlips(String s) {
        int misMatchPat1=0;
        int misMatchPat2=0;
        for(int i=0;i<s.length();i++){
            if(i %2==0){
                if(s.charAt(i)=='0'){
                   misMatchPat1++;
                }else if(s.charAt(i)=='1'){
                   misMatchPat2++;
                }
            }else if (i %2 !=0){
                if(s.charAt(i)=='0'){
                   misMatchPat2++;
                }else if(s.charAt(i)=='1'){
                   misMatchPat1++;
                }
            }
        }
        int min=Math.min(misMatchPat1,misMatchPat2);

        String doubleStr=s+s;
        int n=s.length();
        for(int i=n;i<2*n;i++){
            int outGoing=i-n;
            int inComing=i;
            if(outGoing %2==0){
                if(doubleStr.charAt(outGoing)=='0'){
                   misMatchPat1--;
                }else if(doubleStr.charAt(outGoing)=='1'){
                   misMatchPat2--;
                }
            }else if (outGoing %2 !=0){
                if(doubleStr.charAt(outGoing)=='0'){
                   misMatchPat2--;
                }else if(doubleStr.charAt(outGoing)=='1'){
                   misMatchPat1--;
                }
            }
            if(inComing %2==0){
                if(doubleStr.charAt(inComing)=='0'){
                   misMatchPat1++;
                }else if(doubleStr.charAt(inComing)=='1'){
                   misMatchPat2++;
                }
            }else if (inComing %2 !=0){
                if(doubleStr.charAt(inComing)=='0'){
                   misMatchPat2++;
                }else if(doubleStr.charAt(inComing)=='1'){
                   misMatchPat1++;
                }
            }
            min=Math.min(min,Math.min(misMatchPat1,misMatchPat2));
        }
        return min;
    }
}