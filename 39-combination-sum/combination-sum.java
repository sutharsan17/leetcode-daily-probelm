class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        
        backtrack(candidates , new ArrayList<>() , target , 0 , 0 , n , ans);
        return ans;
    }
    private void backtrack(int[] c , List<Integer> comb , int t , int sum , int i , int n , List<List<Integer>> ans){
        if(sum == t){
            ans.add(new ArrayList<>(comb));
            return;
        }
        if(sum > t || i >= n) return;
        comb.add(c[i]);
        backtrack(c , comb , t , sum+c[i] , i , n , ans);
        comb.remove(comb.size() - 1);
        backtrack(c , comb , t , sum , i+1 , n , ans);
    }
}