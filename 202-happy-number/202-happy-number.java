class Solution {
    Set<Integer> container = new HashSet<>();
    
    public boolean isHappy(int n) {
        int result = happy(n);
        if (result == 1) return true;
        if (container.contains(result)) return false;
        container.add(result);
        return isHappy(result);
    }
    
    private Integer happy(int n) {
        int num = n;
        int sum = 0;
        while (num > 0) {
            int mod = num % 10;
            num /= 10;
            sum += (mod * mod);
        }
        return sum;
    }
    
}