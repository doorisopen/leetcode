class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int num : nums) {
            if (cache.containsKey(num)) {
                cache.put(num, cache.get(num) + 1);
            } else {
                cache.put(num, 1);
            }
        }
        for (int num : cache.keySet()) {
            if (cache.get(num) == 1) return num;
        }
        return 0;
    }
}