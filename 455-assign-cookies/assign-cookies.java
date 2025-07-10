class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=s.length;
        int m=g.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        while(r<m && l<n){
            if(g[r]<=s[l]) r++;
            l++;
        }
        return r;
        
    }
}