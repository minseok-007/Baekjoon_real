package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2225_합분해 {
    static int dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        dp = new int[K+1][N+1];
        int count = count(K, N);
        System.out.println(count);
         /*int count = 1;
        for (int i = 1; i < K; i++) {
            count *= (N + i);
            count /= i;
        }
        System.out.println(count%1000000000);
          */
    }
    public static int count(int digits, int num) {
        if (dp[digits][num] > 0) {
            return dp[digits][num];
        }
        if (num == 0 || digits == 1) {
            return dp[digits][num] = 1;
        }

        for (int i = num; i >=0; i--) {
            dp[digits][num] +=count(digits-1, i);
            dp[digits][num] %=1000000000;
        }
        //dp[digits][num] = count(digits-1, num) + count(digits, num-1);

        return dp[digits][num];
    }
}
