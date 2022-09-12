class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int mx = 0;
        Map<Character, Integer> cache = new HashMap<>();
        for (int i = 0, j = 0; i < len; i++) {
            if (cache.containsKey(s.charAt(i))) {
                j = Math.max(j, cache.get(s.charAt(i)) + 1);
            }
            cache.put(s.charAt(i), i);
            mx = Math.max(mx, i - j + 1);
        }
        return mx;
    }
}