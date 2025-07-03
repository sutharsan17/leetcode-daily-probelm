class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int i =1;
        int sum = 1;
        while(i<n){
            if(ratings[i]==ratings[i-1]){
                i++;
                sum++;
                continue;
            }
            int peak = 1;
            while(i<n && ratings[i]>ratings[i-1]){
                peak++;
                i++;
                sum += peak;
            }
            int down = 1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum += down;
                i++;
                down++;
            }
            if(down>peak){
                sum += down - peak;
            }
        }
        return sum;
    }
}