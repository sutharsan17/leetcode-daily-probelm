class Solution {
    public boolean canJump(int[] nums) {
        int n =nums.length;
        int maxjumb=0;
        for(int i=0 ;i<n;i++){
         if(i>maxjumb) return false;
         maxjumb=Math.max(maxjumb,i+nums[i]);

        }
        return true;
    }
}