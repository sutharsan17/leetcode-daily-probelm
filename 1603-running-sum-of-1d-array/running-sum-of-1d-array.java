class Solution {
    public int[] runningSum(int[] nums) {
        int n =nums.length;
        int prefixsum=0;
        int[] output=new int[n];
        for(int i =0;i<n;i++){
        prefixsum+=nums[i];
        output[i]=prefixsum;
        }
      return output;  
    }
}