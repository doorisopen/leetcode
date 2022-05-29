class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int answer = Integer.MIN_VALUE;
        int[] dp = new int[values.length + 1];
        dp[0] = values[0];
        for (int i = 1; i < values.length; i++) {
            answer = Math.max(answer, dp[i - 1] + values[i] - i);
            dp[i] = Math.max(dp[i - 1], values[i] + i);
            
        }
        return answer;
    }
}