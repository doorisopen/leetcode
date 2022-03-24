class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int between = Math.abs(arr[0] - arr[1]);
        for (int i = 2; i < arr.length; i++) {
            if (between != Math.abs(arr[i-1] - arr[i])) {
                return false;
            }
            between = Math.abs(arr[i-1] - arr[i]);
        }
        return true;
    }
}