/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution {


    /*public int firstBadVersion(int n) {
       return firstBadVersion(n, 1, Integer.MAX_VALUE - 1);
    }*/

    public int firstBadVersion(int n, int lowest, int highest) {
        if (isBadVersion(n) && !isBadVersion(n - 1)) return n;
        if (isBadVersion(n)){
            highest = n - 1;
            return firstBadVersion(n / 2, lowest, highest);
        } else {
            lowest = n + 1;
            return firstBadVersion(n * 2, lowest, highest);
        }
    }

    public int firstBadVersion(int n) {
        int start = 0;
        int end = n;

        while (start < end) {
            int mid = (start + end) / 2;
            if (isBadVersion(n)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }


    public boolean isBadVersion(int n) {
        return n % 2 == 0;
    }
}