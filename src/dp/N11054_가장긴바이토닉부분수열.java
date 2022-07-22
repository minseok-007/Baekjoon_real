package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11054_가장긴바이토닉부분수열 {
    static int dp_inc[];
    static int dp_dec[];
    static int series[];
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        series = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            series[i] = Integer.parseInt(st.nextToken());
        }
        int totalSum = 0;
        for (int i = 1 ; i < N; i++) {
            dp_inc = new int[N+1];
            dp_dec = new int[N+1];
            dp_inc [i] = 1;
            dp_dec [i] = 1;
            int max = increasing(i);
            int min = decreasing(i);
            if (max + min > totalSum) {
                totalSum = max + min;
            }
        }
        System.out.println(totalSum - 1);
    }
    public static int decreasing(int index) {
        for (int i = index; i < N; i++) {
            for (int j = index; j < i; j++) {
                if (series[j] > series[i] && dp_dec[i] <= dp_dec[j] ) {
                    dp_dec[i] = dp_dec[j] + 1;
                }
            }
        }
        return dp_dec[index];
    }
    public static int increasing(int index) {
        for (int i = 0; i < index; i++) {
            for (int j =0; j < i; j++) {
                if (series[j] < series[i] && dp_inc[i] <= dp_inc[j] ) {
                    dp_inc[i] = dp_inc[j] + 1;
                }
            }
        }
        return dp_inc[index];
    }
}
