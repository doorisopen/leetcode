class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) num = nums[i];
            count += (num == nums[i]) ? 1 : -1;
        }
        return num;
    }
}