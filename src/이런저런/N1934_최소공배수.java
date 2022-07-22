package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1934_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(lcm(A, B));
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A%B);
    }

    public static int lcm(int A, int B) {
        return A*B/gcd(A,B);
    }
}
