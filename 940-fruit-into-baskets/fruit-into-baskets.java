class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int left =0;
        int right=0;
        int maxlen=0;
    HashMap<Integer,Integer> map=new HashMap<>();

        while(right<n){
        
        int a=fruits[right];
            map.put(a,map.getOrDefault(a,0)+1);
            if(map.size()>2){
                int b=fruits[left];
               map.put(b,map.get(b)-1);
                left++;

                if(map.get(b)==0){
                    map.remove(b);
                }
            }
            if(map.size()<=2){
              maxlen=Math.max(maxlen,right-left+1);  
            }
                
        
            
            
         
         right++;


        }
        return maxlen;
    }
}