package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10430_나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append((A+B)%C + "\n");
        sb.append(((A%C) + (B%C))%C + "\n");
        sb.append((A*B)%C + "\n");
        sb.append(((A%C)*(B%C))%C);

        System.out.println(sb);

    }
}
