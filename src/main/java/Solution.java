public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] parent = new int[n];
        int[] rank = new int[n];
        for (int node = 0; node < n; node++) {
            parent[node] = node;
            rank[node] = 1;
        }
        int result = n;
        for (int n1 = 0; n1 < n; n1++) {
            for (int n2 = 0;n2 < n; n2++) {
                if (isConnected[n1][n2] == 1) {
                    result -= union(n1, n2, parent, rank);
                }
            }
        }
        return result;
    }
    public int find(int node, int[] parent) {
        int p = parent[node];
        while(p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }
        return p;
    }

    public int union(int node1, int node2, int[] parent, int[] rank) {
        int p1 = find(node1, parent);
        int p2 = find(node2, parent);
        if (p1 == p2) {
            return 0;
        }
        if (rank[p1] > rank[p2]) {
            parent[p2] = p1;
            rank[p1] += rank[p2];
        } else {
            parent[p1] = p2;
            rank[p2] += rank[p1];
        }
        return 1;
    }
}
