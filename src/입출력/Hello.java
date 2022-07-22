package 입출력;

public class Hello {
    public static void main(String[] args) {
        boolean EVEN = true;
        int N = 247;
        while(N > 0 && EVEN == true) {
            if ((N % 10) % 2 == 1) {
                EVEN = false;
            }
            N = N /10;
        }
        System.out.println(EVEN);
    }
}
