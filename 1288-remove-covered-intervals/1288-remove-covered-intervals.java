
class Solution {

    public int removeCoveredIntervals(int[][] intervals) {

        // Sort by start in ascending order.
        // If starts are equal, sort by end in descending order.
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        int count = 0;
        int farthestEnd = 0;

        for (int[] interval : intervals) {

            if (interval[1] > farthestEnd) {
                count++;
                farthestEnd = interval[1];
            }
        }

        return count;
    }
}