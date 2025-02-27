class Solution {
    public boolean allstars(String p,int c){
        
        for(int a=0;a<=c;a++){
            if(p.charAt(a)!='*'){
                return false;
            }
        }
        return true;
    }
    public boolean f(int i,int j,String s, String p,int[][]dp){
        
        if(i<0&&j<0) return true;
        if(i>=0&&j<0) return false;
        if(i<0&&j>=0){
            return allstars(p,j);
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }
        if((s.charAt(i)==p.charAt(j))||p.charAt(j)=='?'){
            dp[i][j]= f(i-1,j-1,s,p,dp)? 1:0;
        }else if(p.charAt(j)=='*'){
             dp[i][j]=(f(i,j-1,s,p,dp)||f(i-1,j,s,p,dp))? 1:0;
        }
        
        return dp[i][j]==1;
    }
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(n-1,m-1,s,p,dp);
    }
}