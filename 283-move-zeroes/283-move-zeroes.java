class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        int zeroCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCnt++;
            } else {
                nums[idx++] = nums[i];
            }
        }
        for (int i = nums.length - zeroCnt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}