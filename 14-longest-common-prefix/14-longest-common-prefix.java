class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        
        int minLength = 201;
        for (int i = 0; i < strs.length; i++) {
            if (minLength > strs[i].length()) {
                minLength = strs[i].length();
            }
        }
        
        int currLength = 0;
        int currIndex = 0;
        while (currIndex < minLength) {
            boolean isEquals = false;
            char currWord = strs[0].charAt(currIndex);
            for (int i = 1; i < strs.length; i++) {
                if (currWord == strs[i].charAt(currIndex)) {
                    isEquals = true;
                } else {
                    isEquals = false;
                    break;
                }
            }
            
            if (isEquals) {
                currLength++;
                currIndex++;
            } else {
                break;
            }
        }
        
        String result = "";
        String str = strs[0];
        for (int i = 0; i < currLength; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}