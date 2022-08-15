class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = 0;
        if (m > 0) {
            n = matrix[0].length;
        }
        List<Integer> result = new ArrayList<>();
        if (m == 0) {
            return result;
        }
        
        int r = 0, c = 0, re = m - 1, ce = n - 1;
        while (r <= re && c <= ce) {
            // col(left to right)
            for (int i = c; i <= ce; i++) {
                result.add(matrix[r][i]);
            }
            r++;
            
            // row(up to down)
            for (int i = r; i <= re; i++) {
                result.add(matrix[i][ce]);
            }
            ce--;
            
            if (r <= re) {
                // col(right to left)
                for (int i = ce; i >= c; i--) {
                    result.add(matrix[re][i]);
                }
            }
            re--;    
            
            if (c <= ce) {
                // row(down to up)
                for (int i = re; i >= r; i--) {
                    result.add(matrix[i][c]);
                }
            }
            c++;
        }
        return result;
    }
}