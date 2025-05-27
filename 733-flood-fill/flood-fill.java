class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int img[][]=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++)
            for(int j=0;j<image[0].length;j++)
                img[i][j]=image[i][j];
        int inicolor=image[sr][sc];
        int vis[][]=new int[image.length][image[0].length];
        int dx[]={-1,0,+1,0};
        int dy[]={0,+1,0,-1};
        
        dfs(sr,sc,dx,dy,vis,img,color,inicolor);
        return img;
    }
    public void dfs(int sr,int sc,int dx[],int dy[],int vis[][],int img[][],int color,int inicolor)
    {
        vis[sr][sc]=1;
        img[sr][sc]=color;
        for(int i=0;i<4;i++)
        {
            int nr=sr+dx[i];
            int nc=sc+dy[i];
            if(nr>=0 && nc>=0 && nr<img.length && nc<img[0].length && vis[nr][nc]==0 && img[nr][nc]==inicolor)
            {
                dfs(nr,nc,dx,dy,vis,img,color,inicolor);
            }
        }
    }
}