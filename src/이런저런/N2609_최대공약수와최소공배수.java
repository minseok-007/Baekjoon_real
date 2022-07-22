package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2609_최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        int max = 0;
        for (int i = 1; i <= Math.min(A,B); i++) {
            if ((A%i == 0 && B%i ==0) && i > max) {
                max = i;
            }
        }
        sb.append(max + "\n");
        sb.append(A*B/max);

        System.out.println(sb);



    }
}
