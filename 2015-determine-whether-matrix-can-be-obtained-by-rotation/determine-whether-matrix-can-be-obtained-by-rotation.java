class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++){
            if(Arrays.deepEquals(mat, target)) return true;
            rotate(mat);
        }
        return false;
    }
    public int[][] rotate(int[][] mat){
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int[] arr : mat){
            int s = 0;
            int e = n-1;
            while(s < e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }
        return mat;
    }
}