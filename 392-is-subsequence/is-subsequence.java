class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int prev=-1;
        if(t.length()==0 && s.length() != 0){
            return false;
        }
        if(s.length()==0 && t.length() ==0){
            return true;
        }
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else if(j==t.length()-1){
                return false;
                
            }else{
                j++;
            }
            
        }

        if(j==t.length() && i != s.length()){
                return false;
            }
        return true;
    }
}