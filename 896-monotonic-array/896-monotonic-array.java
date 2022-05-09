class Solution {
    public boolean isMonotonic(int[] nums) {
        int answer = 0;
        int prev = nums[0];
        for (int index = 1; index < nums.length; index++) {
            if (prev < nums[index]) {
                if (answer < 0) {
                    return false;
                }
                answer++;
            }
            if (prev > nums[index]) {
                if (answer > 0) {
                    return false;
                }
                answer--;
            }
            prev = nums[index];
        }
        
        return true;
    }
}