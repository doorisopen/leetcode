import java.util.*;

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int index = 0; index < nums.length; index++) {
            sum += nums[index];
            nums[index] = sum;
            
        }
        return nums;
    }
}