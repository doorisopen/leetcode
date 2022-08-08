/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return searchFirstBadVersion2(n);
        // return searchFirstBadVersion(0, n - 1);
    }
    
    private int searchFirstBadVersion(int target, int n) {
        int mid = target + (n - target) / 2;
        if (!isBadVersion(mid - 1) && isBadVersion(mid)) {
            return mid;
        }
        //mid > firstBadVersion
        if (isBadVersion(mid)) {
            return searchFirstBadVersion(target, mid);
        }
        //mid < firstBadVersion
        return searchFirstBadVersion(mid + 1, n);
    }
    
    private int searchFirstBadVersion2(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}