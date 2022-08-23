class Solution {
    public int longestPalindrome(String[] words) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            String[] splitWord = word.split("");
            String reverseWord = splitWord[1] + splitWord[0];
            if (map.containsKey(reverseWord)) {
                answer += 4;
                map.put(reverseWord, map.get(reverseWord) - 1);
                if (map.get(reverseWord) == 0) {
                    map.remove(reverseWord);
                }
                continue;
            }
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        
        for (String key : map.keySet()) {
            String[] splitWord = key.split("");
            String reverseWord = splitWord[1] + splitWord[0];
            if (map.get(key) == 1 && map.containsKey(reverseWord)) {
                answer += 2;
                break;
            }
        }
        return answer;
    }
}