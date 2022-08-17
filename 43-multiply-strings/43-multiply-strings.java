class Solution {
    public String multiply(String num1, String num2) {
        int[] calc = new int[num1.length() + num2.length()];
        for (int i = num2.length() - 1; i >= 0; i--) {
            for (int j = num1.length() - 1; j >= 0; j--) {
                int mul = calc[i + j + 1] + (num1.charAt(j) - '0') * (num2.charAt(i) - '0');
                calc[i + j] += (mul / 10);
                calc[i + j + 1] = (mul % 10);
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int val : calc) {
            if (!(answer.length() == 0 && val == 0)) {
                answer.append(val);
            }
        }
        return answer.toString().length() == 0 ? "0" : answer.toString();
    }
}