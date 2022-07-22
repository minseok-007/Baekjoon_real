package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11057_오르막_수 {
    static int cache[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cache = new int[N+1][10];
        for (int i = 0; i < 10; i++) {
            cache[1][i] = 1;
        }
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count += stair(N, i);
        }
        System.out.println(count%10007);
    }

    public static int stair(int digit, int num){
        if (cache[digit][num] > 0) {
            return cache[digit][num];
        }
        for (int i = 0; i <=num; i++) {
            cache[digit][num] += stair(digit-1, num-i);
        }
        return cache[digit][num]%10007;
    }
}
