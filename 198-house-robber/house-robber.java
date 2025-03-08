class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
     int ans= hb(nums,n-1,dp);
     return ans;

    }
     
        
    public  int hb(int[] arr,int ind,int[] dp){
       
     
      if(ind==0) return arr[0];
      if(ind<0) return 0;
       if(dp[ind]!=-1) return dp[ind];
      int take =arr[ind]+hb(arr,ind-2,dp);
      int nottake=0+hb(arr,ind-1,dp);
      dp[ind]=Math.max(take,nottake);  
     return dp[ind];
    }
}