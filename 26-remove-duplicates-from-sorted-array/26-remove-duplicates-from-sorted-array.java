class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int prev = -101;
        int pos = 0;
        for (int num : nums) {
            if (prev != num) {
                nums[pos++] = num;
                count++;
                prev = num;
            }
        }
        return count;
    }
}