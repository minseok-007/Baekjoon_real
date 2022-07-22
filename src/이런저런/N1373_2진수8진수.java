package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1373_2진수8진수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String binary = br.readLine();

        int num = 0;
        for (int i = binary.length() - 1; i >= 0; i-=3) {
            num = Integer.parseInt(String.valueOf(binary.charAt(i))) * 1;
        }

    }
}
