class Solution {
  public int numDecodings(String s) {
    int cur, pv = 0, cv = 1;
    char prev_letter = '0';
    
    for(int i = 0; i != s.length(); i++){
      char cur_letter = s.charAt(i); 
      
      if(prev_letter == '0'){
        if(cur_letter == '0') return 0;
        cur = cv;
      }
      else{
        cur = cur_letter == '0' ?  0 : cv;
        if(prev_letter == '1' || (prev_letter == '2' && cur_letter < '7')) cur += pv;
      }
      
      pv = cv;
      cv = cur;
      prev_letter = cur_letter;
    }
    
    return cv;
  }
}