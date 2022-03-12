class Solution {
    public boolean isPalindrome(int x) {
        String inputStr = String.valueOf(x);
        int startIndex = 0;
        int endIndex = inputStr.length() - 1;
        while (startIndex < endIndex) {
            if (inputStr.charAt(startIndex++) != inputStr.charAt(endIndex--)) {
                return false;
            }
        }
        return true;
    }
}