package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class N10825_국영수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String [][] arr = new String[N][4];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String [] s1, String[] s2) {
                if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
                    if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                        if (Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
                            return s1[0].compareTo(s2[0]);
                        }
                        return Integer.parseInt(s2[3])- Integer.parseInt(s1[3]);
                    }
                    return Integer.parseInt(s1[2])- Integer.parseInt(s2[2]);
                }
                return Integer.parseInt(s2[1])- Integer.parseInt(s1[1]);
            }
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append('\n');
        }
        System.out.println(sb);
    }
}

