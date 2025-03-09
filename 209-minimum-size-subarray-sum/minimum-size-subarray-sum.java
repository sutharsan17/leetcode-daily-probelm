class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n = nums.length;
       int left = 0, right = 0;
       int sum = 0;
       int minlen = Integer.MAX_VALUE;

       while (right < n) {
            sum += nums[right];

            
            while (sum >= target) {
                minlen = Math.min(minlen, right - left + 1);
                sum -= nums[left];
                left++; 
            }

            right++; 
       }

       return minlen == Integer.MAX_VALUE ? 0 : minlen; 
    }
}
