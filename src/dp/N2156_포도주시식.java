package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2156_포도주시식 {
    static int wine[];
    static int dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        wine = new int [n+1];
        dp = new int [n+1];
        for (int i = 0; i < n; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = wine[0];
        if (n > 1) {
            dp[1] = wine[0] + wine[1];
        }
        if (n > 2) {
            dp[2] = Math.max(dp[1], Math.max(wine[0] + wine[2], wine[1] + wine[2]));
        }

        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 1],
                    Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
        }

        System.out.println(dp[n-1]);
    }
}