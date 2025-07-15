class Solution {
    public String reverseWords(String s) {
        String temp="";
        String[] words=s.trim().split("\\s+");
        for(int i =words.length-1;i>=0;i--){
          temp+=words[i];
          if(i!=0){
            temp+=" ";
          }
        }
        return temp;
    }
}