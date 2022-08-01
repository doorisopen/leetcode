class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPoint = 0;
        int tPoint = 0;
        while (tPoint < t.length()) {
            if (sPoint >= s.length()) {
                return true;
            }
            if (s.charAt(sPoint) == t.charAt(tPoint)) {
                sPoint++;
            } 
            tPoint++;
        }
        return sPoint >= s.length();
    }
}