package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11055_가장큰증가부분수열 {
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
            dp[i] = series[i];
            for (int j =0; j < i; j++) {
                if (series[j] < series[i]) {
                    dp[i] = Math.max(dp[j] + series[i], dp[i]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);
    }
}
