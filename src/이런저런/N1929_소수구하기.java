package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1929_소수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean arr[] = make_prime(M);
        StringBuilder sb = new StringBuilder();

        for (int i = N; i < arr.length; i++) {
            if (arr[i] == false) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static boolean [] make_prime(int Max) {
        boolean [] Prime = new boolean[Max+1];
        Prime[0] = true;
        Prime[1] = true;

        for (int i = 2; i <= Math.sqrt(Max); i++) {
            if (Prime[i] == true) {
                continue;
            }
            for (int j = i * i; j < Max + 1; j = j + i) {
                Prime[j] = true;
            }
        }
        return Prime;
    }
}
