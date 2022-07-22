package dp;

import java.util.Scanner;

public class N9465_스티커 {
    static int cost[][];
    static int cache[][];
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int T = keyboard.nextInt();
        for (int i = 0; i < T; i++) {
            int n = keyboard.nextInt();

            cost = new int[2][n+1];
            cache = new int[2][n+1];

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < n; k++) {
                    int score = keyboard.nextInt();
                    cost[j][k]=score;
                }
            }

            cache[0][1] = cost[0][1];
            cache[1][1] = cost[1][1];

            for (int l = 2; l <= n; l++) {
                cache[0][l] = Math.max(cache[1][l-1], cache[1][l-2]) + cost[0][l];
                cache[1][l] = Math.max(cache[0][l-1], cache[0][l-2]) + cost[1][l];
            }
            System.out.println(Math.max(cache[0][n], cache[1][n]));

        }

    }
}
