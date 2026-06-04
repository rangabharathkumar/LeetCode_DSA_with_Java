class Solution {
    public String reverseWords(String s) {
        String [] words =s.split("\\s+");
        StringBuilder ns=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
              ns.append(words[i]);
              ns.append(" ");
        }

        return ns.toString().trim();
    }
}