package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11005_진법변환2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        char arr[]= new char[36];
        for (int i = 0; i < 10; i++) {
            arr[i] = (char)(i+48);
        }
        for (int i = 10; i < 36; i++) {
            arr[i] = (char)(i+55);
        }


        while(N > 0) {
            sb.append(arr[N%B]);
            N = N / B;
        }

        System.out.println(sb.reverse());

    }
}
