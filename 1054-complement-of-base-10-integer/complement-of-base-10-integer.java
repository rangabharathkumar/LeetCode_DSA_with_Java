class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)return 1;
        int ones=(Integer.highestOneBit(n)<< 1)-1;
        return n^ones;
    }

}