package 입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_B_3 {
    public static void main(String[] args) throws IOException {
        /*
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        int [] store = new int[num];
        for (int i =0 ; i < num; i++) {
            int input1=keyboard.nextInt();
            int input2 = keyboard.nextInt();
            store[i] = input1+input2;
        }
        keyboard.close();

        for (int i: store){
            System.out.println(i);
        }

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
