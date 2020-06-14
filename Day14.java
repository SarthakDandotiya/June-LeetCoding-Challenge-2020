// Question:
// Cheapest Flights Within K Stops
// .!

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        for (int i = 0; i <= K; i++) {
            int[] tmpDist = Arrays.copyOf(dist, dist.length);
            for (int[] edge : flights) {
                int u = edge[0];
                if (dist[u] == Integer.MAX_VALUE)
                    continue;
                int v = edge[1];
                int w = edge[2];
                tmpDist[v] = Math.min(tmpDist[v], dist[u] + w);
            }
            dist = tmpDist;
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}