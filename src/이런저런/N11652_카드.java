package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N11652_카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        Arrays.sort(arr);

        int count = 1, max = 1;
        long ans = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i-1]) {
                count++;
            } else {
                count = 1;
            }
            if (max < count) {
                max = count;
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}
