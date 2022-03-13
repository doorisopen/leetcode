class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            char source = s.charAt(i);
            if (isPush(source)) {
                stk.push(source);
            } else {
                if (stk.empty()) {
                    return false;
                }
                if (isMatch(stk.peek(), source)) {
                    stk.pop();
                    result = true;
                } else {
                    return false;
                }
            }
        }
        if (!stk.empty()) {
            result = false;
        }
        return result;
    }
    
    private boolean isPush(char source) {
        if (source == '(') {
            return true;
        }
        if (source == '[') {
            return true;
        }
        if (source == '{') {
            return true;
        }
        return false;
    }
    
    private boolean isMatch(char target, char source) {
        if (source == ')') {
            return target == '(';
        }
        if (source == ']') {
            return target == '[';
        }
        if (source == '}') {
            return target == '{';
        }
        return false;
    }
}