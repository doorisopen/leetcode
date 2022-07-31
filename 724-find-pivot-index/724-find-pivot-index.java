class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int num : nums) {
            right += num;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                left += nums[i-1];                
            }
            right -= nums[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}