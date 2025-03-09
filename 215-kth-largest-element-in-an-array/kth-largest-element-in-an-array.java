class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
      int n=nums.length;
      for(int num:nums){
        pq.add(num);
      }
      while(n-k+1!=pq.size()){
        pq.poll();
      }
      return pq.peek();
    }
}