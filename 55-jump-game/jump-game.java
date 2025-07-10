class Solution {
    public boolean canJump(int[] nums) {
      int n=nums.length;
      int maxlen=0;
      for(int i = 0;i<n;i++){
        if(i>maxlen) return false;
        maxlen=Math.max(maxlen,nums[i]+i);
      }
      return true;
    }
}