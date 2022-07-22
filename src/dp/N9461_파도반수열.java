package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9461_파도반수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            long dp[] = new long[N+1];
            for (int j = 1; j <= N; j++) {
                if (j == 1) {
                    dp[j] = 1;
                } if (j == 2) {
                    dp[j] = 1;
                } if (j == 3) {
                    dp[j] = 1;
                } if (j == 4) {
                    dp[j] = 2;
                } if (j == 5) {
                    dp[j] = 2;
                } if (j > 5){
                    dp[j] = dp[j-1] + dp[j-5];
                }
            }
            sb.append(dp[N]);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
