class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        return searchIndex(nums, target, 0, length - 1);
    }
    
    private int searchIndex(int[] nums, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (start > end) return -1;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            return searchIndex(nums, target, mid + 1, end);
        }
        return searchIndex(nums, target, start, mid - 1);
    }
}