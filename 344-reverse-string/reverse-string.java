class Solution {
    public void reverseString(char[] s) {
        int n =s.length-1;
        int l=0;
        int r=n;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        return;
    }
}