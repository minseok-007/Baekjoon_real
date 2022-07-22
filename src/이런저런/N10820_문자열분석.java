package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10820_문자열분석 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        int arr[];

        while((str=br.readLine()) !=null){
            arr = new int[4];
            for (int i = 0; i < str.length(); i++) {
                int num = (int)str.charAt(i);
                if (num >= 97 && num <= 122) {
                    arr[0]++;
                } else if (num >= 65 && num <= 90) {
                    arr[1]++;
                } else if (num >= 48 && num <= 57) {
                    arr[2]++;
                } else if (num == 32) {
                    arr[3]++;
                }
            }
            for (int i = 0; i < 4; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
