class Solution {
    public boolean isIsomorphic(String s, String t) {
        String[] ss = s.split("");
        String[] st = t.split("");
        
        Map<String, String> match = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (match.containsKey(ss[i])) {
                if (!match.get(ss[i]).equals(st[i])) {
                    return false;
                }
            } else {
                if (match.containsValue(st[i])) {
                    return false;
                } else {             
                    match.put(ss[i], st[i]);   
                }
            }
        }
        return true;
    }
}