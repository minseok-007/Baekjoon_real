package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1850_최대공약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long gcd = gcd(A,B);

        StringBuilder sb = new StringBuilder();

        for (long i = 0; i < gcd; i++) {
            sb.append(1);
        }

        System.out.println(sb);
    }

    static long gcd(long A, long B) {
        if (B == 0) {
            return A;
        }
        return gcd(B, A%B);
    }

}
