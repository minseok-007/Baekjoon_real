package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2579_계단오르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dp[] = new int[N+1];
        int stair[] = new int[N+1];
        for (int i = 0; i < N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

    }
}
