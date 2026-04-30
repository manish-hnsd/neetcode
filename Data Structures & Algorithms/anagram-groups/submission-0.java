class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            // Convert to Char
            char[] ch = str.toCharArray();
            //Sort
            Arrays.sort(ch);
            // Create Key
            String key = new String(ch);
            //Group Anagram
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
