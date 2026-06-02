class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=0;
        int k=0;
        while(i< haystack.length() && j< haystack.length()){
            if(haystack.charAt(j) == needle.charAt(k)){
                if(k+1 == needle.length()){
                    return i;
                }
                j++;
                k++;

            }else {
                i++;
                j=i;
                k=0;
            }
        }return -1;
    }
}