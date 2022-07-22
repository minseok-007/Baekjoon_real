package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1699_제곱수의합 {
    static int[] dp;
    static int maxSquare;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1];
        int maxSquare = (int)Math.sqrt(N);
        int count = findSum(N);
    }
    public static int findSum(int remain) {
        if (dp[remain] > 0) {
            return dp[remain];
        }
        if (remain == 0) {
            return dp[remain];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= maxSquare; i++) {
            if (findSum(remain - i * i) < min) {
                min = findSum(remain- i * i);
                dp[remain] = min;
            }
        }
        return 0;
    }
}
