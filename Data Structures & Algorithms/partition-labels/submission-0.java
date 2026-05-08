class Solution {
    public List<Integer> partitionLabels(String s) {
        // Store last occurrence of every character
        Map<Character, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            lastIndex.put(s.charAt(i), i);
        }
        List<Integer> res = new ArrayList<>();
        int count = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            // Find farthest last occurrence
            end = Math.max(end, lastIndex.get(s.charAt(i)));
            // Partition point
            if (i == end) {
                res.add(count);
                count = 0;
            }
        }
        return res;
    }
}
