class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total=0;
        int n=arr.length;
         for(int i = 0;i<n;i++){
            int left=i+1;
            int right=n-i;
            int odd=((left*right)+1)/2;
            total+=arr[i]*odd;
         }
        return total;
    }
}