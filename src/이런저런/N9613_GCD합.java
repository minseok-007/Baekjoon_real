package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N9613_GCD합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int arr[];

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int range = Integer.parseInt(st.nextToken());
            arr = new int[range];
            for (int j = 0; j < range; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            long sum = 0;
            for (int k = 0; k < range; k++) {
                for (int l = k+1; l < range; l++) {
                    sum += gcd(arr[k], arr[l]);
                }
            }
            sb.append(sum);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A%B);
    }
}
