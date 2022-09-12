class Solution {
    private static int r, c;
    private static int[][] dir = {
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };
    
    public int maxAreaOfIsland(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int mxArea = 0;
        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++) {
                if (grid[x][y] == 1) {
                    mxArea = Math.max(mxArea, bfs(grid, x, y));
                }
            }   
        }
        return mxArea;
    }
    
    private int bfs(int[][] grid, int x, int y) {
        int count = 1;
        Queue<int[][]> q = new LinkedList<>();
        q.add(new int[][]{{x, y}});
        grid[x][y] = 2;
        while (!q.isEmpty()) {
            int[][] pos = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = pos[0][0] + dir[i][0];
                int ny = pos[0][1] + dir[i][1];
                if (nx >= r || nx < 0 || ny >= c || ny < 0) continue;
                if (grid[nx][ny] != 1) continue;
                grid[nx][ny] = 2;
                count++;
                q.add(new int[][]{{nx, ny}});
            }
        }
        return count;
    }
}
