class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int lefts=0;
        int rights=0;
        int left[] =new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
        lefts+=nums[i];
        rights+=nums[n-i-1];
        left[i]=lefts;
        right[n-i-1]=rights;

        }
        for(int i =0;i<n;i++){
            if(left[i]==right[i]) return i;
        }
        return -1;
    }
}