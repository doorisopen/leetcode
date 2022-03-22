class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int x2 = points[i][0];
            int y2 = points[i][1];
            if (x != x2 && y != y2) continue;
            int calcDistance = Math.abs(x - x2) + Math.abs(y - y2);
            if (distance > calcDistance) {
                distance = calcDistance;
            }
        }
        
        if (distance != Integer.MAX_VALUE) {
            for (int i = 0; i < points.length; i++) {
                int x2 = points[i][0];
                int y2 = points[i][1];
                if (x != x2 && y != y2) continue;
                int calcDistance = Math.abs(x - x2) + Math.abs(y - y2);
                if (distance == calcDistance) {
                    return i;
                }
            }
        }
        return -1;
    }
}