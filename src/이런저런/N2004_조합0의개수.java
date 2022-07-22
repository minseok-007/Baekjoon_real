package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2004_조합0의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count_five = five_power(n) - five_power(m) - five_power(n-m);
        int count_two = two_power(n) - two_power(m) - two_power(n-m);
        System.out.println(Math.min(count_five, count_two));
    }

    static int five_power(int num) {
        int count = 0;
        while(num>=5) {
            count += num / 5;
            num /= 5;
        }
        return count;
    }

    static int two_power(int num) {
        int count = 0;
        while (num >=2) {
            count += num / 2;
            num /= 2;
        }
        return count;
    }
}
