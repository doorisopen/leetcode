class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int miss = 0;
        int first = -1, second = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                miss++;
                if (first == -1) {
                    first = i;
                } else {
                    second = i;
                }
            }
            if (miss > 2) return false;
        }
        if (miss == 2) {
            return miss != s1.length() && s1.charAt(first) == s2.charAt(second) && s2.charAt(first) == s1.charAt(second);
        }
        return false;
    }
}