package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2193_이친수 {
    static long cache[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cache = new long[N+1][2];
        long count = 0;
        for (int i = 0; i < 2; i++) {
            count += binary (N, i);
        }
        System.out.println(count);
    }
    public static long binary(int digit, int val) {
        if (cache[digit][val] > 0) {
            return cache[digit][val];
        }
        if (digit == 1) {
            if (val == 0) {
                return 0;
            } else if (val == 1) {
                return 1;
            }
        }
        if (val == 0) {
            cache[digit][val] = binary(digit-1, val) + binary(digit-1, val+1);
        } else if (val == 1) {
            cache[digit][val] = binary(digit-1, val-1);
        }
        return cache[digit][val];
    }
}
