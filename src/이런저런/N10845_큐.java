package 이런저런;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N10845_큐 {

    public static ArrayList<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        queue = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                    sb.append(back()).append('\n');
                    break;

            }
        }

        System.out.println(sb);
    }

    public static void push(int item) {
        queue.add(item);
    }

    public static int pop(){
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.remove(0);
        }
    }

    public static int empty() {
        if (queue.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front(){
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.get(0);
        }
    }

    public static int back() {
        if (queue.isEmpty()) {
            return -1;
        } else {
            return queue.get(queue.size() - 1);
        }
    }
}
