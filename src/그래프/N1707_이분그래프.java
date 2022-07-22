package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N1707_이분그래프 {
}

    /*
    static int visited[]; // 0, 1, 2
    static ArrayList<Integer> [] bipartite;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < K; i++) {
            int V = Integer.parseInt(st.nextToken()); // 정점의 수
            int E = Integer.parseInt(st.nextToken()); // 간선의 수
            visited = new int[V+1];
            bipartite = new ArrayList[V+1];

            for (int a = 1; a <=V; a++) {
                bipartite[a] = new ArrayList<>();
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < E; j++) {
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());
                bipartite[u].add(v);
                bipartite[v].add(u);
            }

            for (int k = 1; k <= V; k++) {
                if (visited[i] == 0) {
                    dfs(k, 1);
                }
            }

            boolean ok = true;
            for (int l = 1; l <= V; l++) {
                for (int m = 0; m<bipartite[l].size(); m++) {
                    int j = bipartite[l].get(m);
                    if (visited[l] == visited[j]) {
                        ok = false;
                    }
                }
            }
            if (ok == false) {
                System.out.println("NO");
            } else {
                System.out.printf("YES");
            }
        }
    }

    public static boolean dfs(int node, int visit) {
        visited[node] = visit;
        for (int i = 0; i < bipartite[node].size(); i++) {
            int next = bipartite[node].get(i);
            if (visited[next] == 0) {
                if (dfs(next, 3-visit) == false) {
                    return false;
                } else if (visited[next] == visited[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}

     */
