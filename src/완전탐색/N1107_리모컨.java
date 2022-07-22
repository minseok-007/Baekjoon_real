package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1107_리모컨 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());


        boolean [] broken = new boolean[10];

        if (M!=0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                broken[Integer.parseInt(st.nextToken())] = true;
            }
        }

        int result = Math.abs(N - 100);

        for (int i = 0; i <=999999; i++) {
            String str = String.valueOf(i);

            boolean isBreak = false;
            for (int j = 0; j <str.length(); j++) {
                if (broken[str.charAt(j)-'0']) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak) {
                int min = Math.abs(N - i) + str.length();
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}
