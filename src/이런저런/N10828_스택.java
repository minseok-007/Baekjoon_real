package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N10828_스택 {
    static ArrayList<Integer> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        stack = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.equals("pop")) {
                if (isEmpty(stack) == 1) {
                    sb.append("-1" + "\n");
                } else {
                    sb.append(stack.get(stack.size()-1)+ "\n");
                    stack.remove(stack.size()-1);
                }
            } else if (str.equals("size")) {
                sb.append(stack.size()+ "\n");
            } else if (str.equals("empty")) {
                sb.append(isEmpty(stack)+ "\n");
            } else if (str.equals("top")) {
                if (isEmpty(stack) == 1) {
                    sb.append("-1"+ "\n");
                } else {
                    sb.append(stack.get(stack.size()-1)+ "\n");
                }
            } else {
                StringTokenizer st = new StringTokenizer(str);
                String push = st.nextToken();
                int X = Integer.parseInt(st.nextToken());
                stack.add(X);
            }
        }
        System.out.println(sb);
    }

    public static int isEmpty(ArrayList list) {
        if (list.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}
