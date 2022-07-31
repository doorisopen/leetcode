class Solution {
    private static final String[] NUMBER_LETTERS = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits == "" || digits.length() == 0) return new ArrayList<>();
    
        List<String> results = new ArrayList<>();
        combinate("", digits, 0, results);
        return results;
    }
    
    private void combinate(String prefix, String digits, int index, List<String> results) {
        if (prefix.length() == digits.length()) {
            results.add(prefix);
            return;
        }
        String letters = NUMBER_LETTERS[(digits.charAt(index) - '0')];
        String[] splitLetters = letters.split("");
        for (String letter : splitLetters) {
            combinate(prefix + letter, digits, index + 1, results);
        }
    }
}