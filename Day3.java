// Question:
// Two City Scheduling
// *

class CustomSort implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        return Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]);
    }
}

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int N = costs.length / 2;
        int a = 0, b = 0;
        int sum = 0;
        Arrays.sort(costs, new CustomSort());
        for (int i = 0; i < 2 * N; i++) {
            if ((costs[i][0] <= costs[i][1] && a < N) || b == N) {
                sum += costs[i][0];
                a++;
            } else {
                sum += costs[i][1];
                b++;
            }
        }
        return sum;
    }
}