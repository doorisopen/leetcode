class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if (s1Len > s2Len) return false;
        int[] count = new int[26];
        for (int i = 0; i < s1Len; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (isAllZero(count)) return true;
        for (int i = s1Len; i < s2Len; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - s1Len) - 'a']++;
            if (isAllZero(count)) return true;
        }
        return false;
    }
    
    private boolean isAllZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }
}