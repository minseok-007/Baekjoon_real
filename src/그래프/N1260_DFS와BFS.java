package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N1260_DFS와BFS {
    static int[][] graph;
    static boolean[] visited;
    static int N, M;
    static Queue<Integer> queue = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N+1][N+1];
        visited  = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            graph[node1][node2] = 1;
            graph[node2][node1] = 1;
        }

        dfs(V);
        sb.append('\n');
        Arrays.fill(visited, false);
        bfs(V);

        System.out.println(sb);
    }

    public static void dfs(int i) {
        visited[i] = true;
        sb.append(i + " ");

        for (int j = 1; j <= N; j++) {
            if (graph[i][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }

    public static void bfs(int i) {
        queue.offer(i);
        visited[i] = true;
        sb.append(i + " ");

        while(!queue.isEmpty()) {
            int temp = queue.poll();

            for (int j = 1; j <= N; j++) {
                if (graph[temp][j] == 1 && visited[j] == false) {
                    queue.offer(j);
                    visited[j] = true;
                    sb.append(j + " ");
                }
            }
        }
    }
}

