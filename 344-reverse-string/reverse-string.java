class Solution {
    public void reverseString(char[] s) {
        int n =s.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            char temp=s[r];
            s[r]=s[l];
            s[l]= temp;
            l++;
            r--;

        }
        return ;
        
    }
}