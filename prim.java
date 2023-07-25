package daa;

import java.util.Scanner;

public class prim {
    static int mincost = 0;
    static int n, a = 0, b = 0, min, u = 0, v = 0;

    public void prim(int n, int[][] cost) {
        int[] visited = new int[n + 1];
        for (int i = 2; i <= n; i++)
            visited[i] = 0;
        visited[1] = 1;
        int ne = 1;
        while (ne < n) {
            min = 999;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (cost[i][j] < min) {
                        if (visited[i] == 0)
                            continue;
                        else {
                            min = cost[i][j];
                            a = u = i;
                            b = v = j;
                        }
                    }
                }
            }
            if (visited[u] == 0 || visited[v] == 0) {
                System.out.println((ne) + " edge(" + a + ", " + b + ") = " + min);
                ne = ne + 1;
                mincost = mincost + min;
                visited[v] = 1;
            }
            cost[a][b] = 999;
        }
        System.out.println("The minimum cost of the spanning tree is " + mincost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        n = sc.nextInt();
        int[][] cost = new int[n + 1][n + 1];
        System.out.println("Enter the cost matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                cost[i][j] = sc.nextInt();
                if (cost[i][j] == 0)
                    cost[i][j] = 999;
            }
        }
        prim p = new prim();
        p.prim(n, cost);
    }
}
