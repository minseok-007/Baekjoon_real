package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N10819_차이를최대로 {
    static int N;
    static int result;
    static int[] arr;
    static int [] temp;
    static boolean [] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        visited = new boolean[N];
        temp = new int[N];
        result = 0;
        dfs(0);
        System.out.println(result);

    }

    public static void dfs(int count) {
        if (count == N) {
            int sum = 0;
            for (int i = 0; i < N - 1; i++) {
                sum += Math.abs(temp[i] - temp[i+1]);
            }
            result = Math.max(result, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp[count] = arr[i];
                dfs(count+1);
                visited[i] = false;
            }
        }
    }


}
