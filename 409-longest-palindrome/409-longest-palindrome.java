class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) return 0;
        Set<String> set = new HashSet<>();
        int evenCount = 0;
        for (String str : s.split("")) {
            if (set.contains(str)) {
                set.remove(str);
                evenCount++;
            } else {
                set.add(str);
            }
        }
        return evenCount*2 + (set.isEmpty() ? 0 : 1);
    }
}