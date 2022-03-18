class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int len = salary.length - 2;
        double avg = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            avg += salary[i];
        }
        return (double) avg / len;
    }
}