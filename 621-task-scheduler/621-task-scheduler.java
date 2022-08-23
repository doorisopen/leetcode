class Solution {
    public int leastInterval(char[] tasks, int n) {
        int maxCount = 0;
        int maxFreq = 0;
        int[] count = new int[26];
        for (char task : tasks) {
            count[task - 'A']++;
            if (maxFreq == count[task - 'A']) {
                maxCount++;
            }
            if (maxFreq < count[task - 'A']) {
                maxFreq = count[task - 'A'];
                maxCount = 1;
            }
        }
        
        int partCount = maxFreq - 1;
        int partLength = n - (maxCount - 1);
        int emptyCount = partCount * partLength;
        int useTaskCount = tasks.length - (maxFreq * maxCount);
        int idleCount = Math.max(0, emptyCount - useTaskCount);
        return tasks.length + idleCount;
    }
}