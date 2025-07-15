class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String word:strs){
            char[] words=word.toCharArray();
            Arrays.sort(words);
            String key=new String(words);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(word);

        }
        return new ArrayList<>(map.values());
    }
}