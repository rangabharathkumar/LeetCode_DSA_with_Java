class Solution {
    public boolean isPalindrome(String s) {
       String input =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       int left=0;
       int right=input.length()-1;
       while(left<right){
        if(input.charAt(left)!=input.charAt(right)){
             return false;
       }
       right--;
       left++; 
    }return true;
    }
}