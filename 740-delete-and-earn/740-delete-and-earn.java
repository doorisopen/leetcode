class Solution {
    private static final int MAX = 10000;
    
    public int deleteAndEarn(int[] nums) {
        int length = nums.length;
        if (length == 0) return 0;
        if (length < 2) return nums[0];
        
        int[] dp = new int[MAX + 1];
        for (int num : nums) {
            dp[num] += num;
        }
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + dp[i]);
        }
        return dp[MAX];
    }
}