public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String bit = Integer.toBinaryString(n);
        int result = 0;
        for (int i = 0; i < bit.length(); i++) {
            if (bit.charAt(i) == '1') {
                result++;
            }
        }
        return result;
    }
}