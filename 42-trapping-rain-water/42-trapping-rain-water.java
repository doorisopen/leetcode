class Solution {
    public int trap(int[] height) {
        int answer = 0;
        int width = height.length;
        for (int index = 1; index < width - 1; index++) {
            int leftValue = 0, rightValue = 0;
            for (int left = 0; left < index; left++) {
                leftValue = Math.max(leftValue, height[left]);
            }
            
            for (int right = index + 1; right < width; right++) {
                rightValue = Math.max(rightValue, height[right]);
            }
            
            if (height[index] < leftValue && height[index] < rightValue) {
                answer += (Math.min(leftValue, rightValue) - height[index]);
            }
        }
        return answer;
    }
}