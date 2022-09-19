class Solution {
    private static List<List<Integer>> result;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<>();
        combi(n, k, 1, new ArrayList<>());
        return result;
    }
    
    
    private void combi(int n, int k, int p, List<Integer> ans) {
        if (ans.size() == k) {
            result.add(new ArrayList<>(ans));
            return;
        }
        for (int i = p; i <= n; i++) {
            if (!ans.contains(i)) {
                ans.add(i);
                combi(n, k, i, ans);
                ans.remove(ans.size() - 1);   
            }
        }
    }
}