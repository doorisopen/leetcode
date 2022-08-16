class Solution {
    public int[] findBall(int[][] grid) {
        int end = grid[0].length;
        int[] answer = new int[end];
        for (int step = 0; step < end; step++) {
            answer[step] = findBall(0, step, grid);
        }
        return answer;
    }
    
    private int findBall(int r, int c, int[][] grid) {
        if (r == grid.length) return c;
        if (c < 0 || c >= grid[0].length) return -1;
        if (c + 1 < grid[0].length && grid[r][c] + grid[r][c + 1] > 0) return findBall(r + 1, c + 1, grid);
        else if (c - 1 >= 0 && grid[r][c] + grid[r][c - 1] < 0) return findBall(r + 1, c - 1, grid);
        return -1;
    }
}