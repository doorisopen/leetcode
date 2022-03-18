class Solution {
    public int countOdds(int low, int high) {
        int lowCnt = (low / 2) + (low % 2);
        int highCnt = (high / 2) + (high % 2);
        return (highCnt - lowCnt) + (low % 2 == 1 ? 1 : 0);
    }
}