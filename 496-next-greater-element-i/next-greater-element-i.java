class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer>st=new Stack<>();
    int n=nums2.length-1;
HashMap<Integer,Integer> map=new HashMap<>();
for(int i =n;i>=0;i--){
    while(!st.isEmpty() && st.peek()<=nums2[i]){
        st.pop();
    }
   int nextgreater= st.isEmpty() ? -1:st.peek();

map.put(nums2[i],nextgreater);
st.push(nums2[i]);
}

int[] result=new int[nums1.length];
for(int i=0;i<nums1.length;i++){
    result[i]=map.get(nums1[i]);
}
return result;
    }
}