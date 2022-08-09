class Solution {
    private static int[][] directions = {
        {1, 0},
        {0, 1},
        {-1, 0},
        {0, -1}
    };
    private static boolean[][] visit;
    private static int width;
    private static int height;
    
    public int numIslands(char[][] grid) {
        width = grid[0].length;
        height = grid.length;
        visit = new boolean[height][width];
        
        int count = 0;
        for (int c = 0; c < height; c++) {
            for (int r = 0; r < width; r++) {
                if (!visit[c][r] && grid[c][r] == '1') {
                    visit[c][r] = true;
                    bfs(grid, c, r);
                    ++count;
                }
            }
        }
        return count;
    }
    
    private void bfs(char[][] grid, int sc, int sr) {
        Queue<Pos> q = new LinkedList<>();
        q.add(new Pos(sc, sr));
        while (!q.isEmpty()) {
            Pos pos = q.poll();
            int c = pos.c;
            int r = pos.r;
            for (int[] dir : directions) {
                int nc = c + dir[0];
                int nr = r + dir[1];
                if (nc < 0 || nc >= height || nr < 0 || nr >= width) continue;
                if (visit[nc][nr] || grid[nc][nr] == '0') continue;
                visit[nc][nr] = true;
                q.add(new Pos(nc, nr));
            }
        }
    }
    
    private static class Pos {
        int c;
        int r;
        
        Pos(int c, int r) {
            this.c = c;
            this.r = r;
        }
    }
}