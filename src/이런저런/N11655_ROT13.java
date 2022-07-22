package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11655_ROT13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i);
            if (code >= 65 && code <= 90) {
                if (code <= 77) {
                    code = code+13;
                } else {
                    code = code-13;
                }
            } else if (code >= 97 && code <= 122) {
                if (code <= 109) {
                    code = code+13;
                } else {
                    code = code-13;
                }
            }
            System.out.print((char)code);
        }
    }
}
