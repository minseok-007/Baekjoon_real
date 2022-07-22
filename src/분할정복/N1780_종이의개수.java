package 분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1780_종이의개수 {
    public static int [][] board;
    public static int MINUS_ONE = 0;
    public static int ZERO = 0;
    public static int ONE = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        board = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0,0,N);
        System.out.println(MINUS_ONE);
        System.out.println(ZERO);
        System.out.println(ONE);
    }

    public static void solve(int row, int col, int size) {
        if (numCheck(row, col, size)) {
            if (board[row][col] == -1) {
                MINUS_ONE++;
            } else if (board[row][col] == 0) {
                ZERO++;
            } else {
                ONE++;
            }
            return;
        }

        int newSize = size/3;

        solve(row, col, newSize);
        solve(row, col + newSize, newSize);
        solve(row, col + 2 * newSize, newSize);

        solve(row + newSize, col, newSize);
        solve(row + newSize, col + newSize, newSize);
        solve(row + newSize, col + 2*newSize, newSize);

        solve(row + 2 * newSize, col, newSize);
        solve(row + 2 * newSize, col + newSize, newSize);
        solve(row + 2 * newSize, col + 2 * newSize, newSize);

    }

    public static boolean numCheck(int row, int col, int size) {
        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
