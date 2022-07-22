package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6588_골드바흐의추측 {
    static boolean prime[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        prime = new boolean[1000001];

        get_prime();
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            boolean hasSum = false;
            for (int i = 3; i <= n/2; i+=2) {
                if (!prime[i] && !prime[n-i]) {
                    sb.append(n + " = " + i + " + " + (n-i));
                    hasSum = true;
                    break;
                }
            }

            if (!hasSum) {
                sb.append("Goldbach's conjecture is wrong.");
            }
            sb.append('\n');
            /*
            int deduct = 0;
            int bigger = 0;
            int smaller = 0;
            for (int i = 3; i < n; i+=2) {
                for (int j = i+2; j < n; j +=2) {
                    if (i + j == n && prime[i] == false && prime[j] == false) {
                        if (j - i > deduct) {
                            deduct = j - i;
                            bigger = j;
                            smaller = i;
                        }
                        break;
                    }
                }
            }

             */

        }

        System.out.println(sb);

    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
