class Solution {
    public int rob(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int stepTwo = i >= 2 ? nums[i-2] : 0;
            int stepThree = i >= 3 ? nums[i-3] : 0;
            nums[i] += Math.max(stepTwo, stepThree);
            max = Math.max(nums[i], max);
        }
        return max;
    }
}