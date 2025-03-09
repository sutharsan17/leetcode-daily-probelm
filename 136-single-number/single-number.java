class Solution {
    public int singleNumber(int[] nums) {
        int n =nums.length;
        int xor=0;
        if(n<1) return n;
        for(int i :nums){
           xor=xor^i;
        }
        return xor;
    }
}