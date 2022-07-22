package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1978_소수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int numPrime = 0;
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            int factor = 0;
            if (num != 1) {
                for (int i = 1; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        factor++;
                    }
                }
            }
            if (factor == 1) {
                numPrime++;
            }
        }
        System.out.println(numPrime);
    }
}
