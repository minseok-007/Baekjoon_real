package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N10809_알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int arr[] = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < S.length(); i++) {
            if (arr[(int)S.charAt(i)-97] == -1) {
                arr[(int)S.charAt(i)-97] = i;
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
