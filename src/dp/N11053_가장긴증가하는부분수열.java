package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11053_가장긴증가하는부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        int series[] = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            series[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
           dp[i] = 1;
           for (int j =0; j < i; j++) {
               if (series[j] < series[i] && dp[i] <= dp[j] ) {
                   dp[i] = dp[j] + 1;
               }
           }
        }
        int max = -1;
        for (int i = 0; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);
    }
}
