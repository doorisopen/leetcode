class Solution {
    static Map<Character, Integer> romanNumerals = new HashMap<>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };
    
    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        for (int index = s.length() - 1; index >= 0 ; index--) {
            int currValue = romanNumerals.get(s.charAt(index));
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }
}