class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(reverse(words[i], 0, words[i].length() - 1));
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    
    private String reverse(String s, int l, int r) {
        String[] ss = s.split("");
        while (l < r) {
            String temp = ss[l];
            ss[l++] = ss[r];
            ss[r--] = temp;
        }
        return String.join("", ss);
    }
}