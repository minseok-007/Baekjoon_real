package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1912_연속합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        int series[] = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            series[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = series[0];
        for (int i = 1; i < N; i++) {
            dp[i] = series[i];
            if (dp[i] < dp[i-1] + dp[i]) {
                dp[i] = dp[i-1]+dp[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i =0 ; i < N; i++) {
            max = dp[i] > max ? dp[i] : max;
        }
        System.out.println(max);
    }
}
