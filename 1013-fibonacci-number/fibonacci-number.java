class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int prev2=0;
        int prev1=1;
        for(int i =1;i<n;i++){
           int cur=prev1+prev2;
           prev2=prev1;
           prev1=cur;
           

           
           
           
        }
        return prev1;
        
    }
}