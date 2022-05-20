import java.util.*;

class Solution {
    public boolean canJump(int[] nums) {
        int end = nums.length;
        int pos = nums[0];
        if (pos == 0 && end > 1) return false;
        if (end == 1) return true;
        for (int i = 1; i < end; i++) {
            if (i > pos) return false;
            pos = Math.max(pos, i + nums[i]);
        }
        return true;
    }
}