package 브루트포스_강의;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1748_수이어쓰기1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int add = 1;
        int count = 0;
        int div = 10;
        for (int i = 1; i <= N; i++) {
            if (i%div == 0) {
                add++;
                div*=10;
            }
            count += add;
        }
        System.out.println(count);
    }
}
