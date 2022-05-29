class Solution {
    public int jump(int[] nums) {
        int answer = 0;
        int cur = 0;
        int nxt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > cur) {
                answer++;
                cur = nxt;
            }
            nxt = Math.max(nxt, i + nums[i]);
        }
        return answer;
    }
}