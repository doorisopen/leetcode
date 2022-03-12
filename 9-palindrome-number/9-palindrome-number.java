class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String inputStr = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        sb.append(inputStr);
        sb.reverse();
        return inputStr.equals(sb.toString());
    }
}