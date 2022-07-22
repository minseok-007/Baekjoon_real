package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String ps = br.readLine();
            int count = 0;
            boolean already = false;
            for (int j = 0 ; j < ps.length(); j++) {
                if (ps.charAt(j) == '(') {
                    count++;
                } else if (ps.charAt(j) == ')') {
                    count--;
                }
                if (count < 0) {
                    sb.append("NO" + "\n");
                    already = true;
                    break;
                }
            }
            if (!already) {
                if (count > 0) {
                    sb.append("NO" + "\n");
                } else {
                    sb.append("YES" + "\n");
                }
            }
        }
        System.out.println(sb);
    }
}
